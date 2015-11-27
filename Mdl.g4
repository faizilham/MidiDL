grammar Mdl;

NUM: [0-9]+;
WS: [ \t\r]+ -> skip;
ID: '@'[A-Za-z_]+[0-9A-Za-z_]*;

PLUS: '+';
MINUS: '-';
DOT: '.';

OCTAVE_SHIFT: '\''+;
BASE_NOTE: 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g' | 'r';
STRING: '"' ~[\r\n"]+ '"';
UP: '>';
DOWN: '<';

midi: statements;

newline: '\n'+ | EOF;
pitch_shift_sign: PLUS+ | MINUS+;
length_shift_sign: DOT+;

statements: newline* (statement newline)*;
statement: channel_declaration | group_declaration | channel;

channel_declaration: '#channel' name=ID instrument=NUM;
group_declaration: '#group' name=ID command+;
channel: channel_name=ID command+;

command: note | modifiers | playthrough;

note: base=BASE_NOTE (pitch_shift=pitch_shift_sign)? (octave_shift=OCTAVE_SHIFT)? (note_length=NUM)? (length_shift=length_shift_sign)?;

modifiers: tempo | length | octave | volume | pitch_transpose;
tempo: 't' value=NUM;
length: 'l' value=NUM;

shift_sign: UP | DOWN;
octave: 'o' (shift=shift_sign (value=NUM)? | value=NUM);
volume: 'v' (shift=shift_sign (value=NUM)? | value=NUM);
pitch_transpose: 'p' (shift=shift_sign (value=NUM)? | ((negative=MINUS)? value=NUM));

/*
shift_octave: octave_up | octave_down;
octave_up: '>';
octave_down: '<';
*/


playthrough: tie | harmony | loop | group;

group: name=ID;
tie: note1=note '&' note2=note;
harmony: '(' note+ ')';
loop: '[' command+ ']' value=NUM;