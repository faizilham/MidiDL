grammar Mdl;

WS: [ \t\r]+ -> skip;
ID: '@'[A-Za-z_]+[0-9A-Za-z_]*;
COMMENT: '//' ~[\n]+ -> skip;
VAR: '$'[A-Za-z_]+[0-9A-Za-z_]*;
NUM: [0-9]+;
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
val: NUM | VAR;

statements: newline* statement*;
statement: (constant_declaration | track_declaration | percussion_declaration | include | section_declaration | track) newline;

constant_declaration: '#constant' name=VAR value=val;
track_declaration: '#track' name=ID instrument=val;
percussion_declaration: '#percussion' name=ID;

section_declaration: '#section' name=ID ':' command+;
track: track_name=ID ':' command+;
include: '#include' filename=STRING;

command: note | modifiers | playback;

note: base=BASE_NOTE (pitch_shift=pitch_shift_sign)? (octave_shift=OCTAVE_SHIFT)? (note_length=val)? (length_shift=length_shift_sign)?;
pitch_shift_sign: PLUS+ | MINUS+;
length_shift_sign: DOT+;

modifiers: tempo | length | octave | volume | pitch_transpose;
tempo: 't' value=val;
length: 'l' value=val;

shift_sign: UP | DOWN;
octave: 'o' (shift=shift_sign (value=val)? | value=val);
volume: 'v' (shift=shift_sign (value=val)? | value=val);
pitch_transpose: 'p' (shift=shift_sign (value=val)? | ((negative=MINUS)? value=val));

playback: harmony | loop | section;

section: name=ID;
harmony: '(' note+ ')';
loop: '[' command+ ']' value=val;