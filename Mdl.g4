grammar Mdl;

NUM: [0-9]+;
WS: [ \t\r]+ -> skip;
ID: '@'[A-Za-z_]+[0-9A-Za-z_]*;
COMMENT: '//' ~[\n]+ -> skip;

PLUS: '+';
MINUS: '-';
DOT: '.';

OCTAVE_SHIFT: '\''+;
BASE_NOTE: 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g' | 'r';
STRING: '"' ~[\r\n"]+ '"';
UP: '>';
DOWN: '<';

midi: statements;

newline: '\n'+ | EOF | COMMENT;

statements: newline* statement*;
statement: (track_declaration | percussion_declaration | include | section_declaration | track) newline;

track_declaration: '#track' name=ID instrument=NUM;
percussion_declaration: '#percussion' name=ID;

section_declaration: '#section' name=ID command+;
track: track_name=ID command+;
include: '#include' filename=STRING;

command: note | modifiers | playback;

note: base=BASE_NOTE (pitch_shift=pitch_shift_sign)? (octave_shift=OCTAVE_SHIFT)? (note_length=NUM)? (length_shift=length_shift_sign)?;
pitch_shift_sign: PLUS+ | MINUS+;
length_shift_sign: DOT+;

modifiers: tempo | length | octave | volume | pitch_transpose;
tempo: 't' value=NUM;
length: 'l' value=NUM;

shift_sign: UP | DOWN;
octave: 'o' (shift=shift_sign (value=NUM)? | value=NUM);
volume: 'v' (shift=shift_sign (value=NUM)? | value=NUM);
pitch_transpose: 'p' (shift=shift_sign (value=NUM)? | ((negative=MINUS)? value=NUM));

playback: harmony | loop | section;

section: name=ID;
harmony: '(' note+ ')';
loop: '[' command+ ']' value=NUM;