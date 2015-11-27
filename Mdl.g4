grammar Mdl;

NUM: [0-9]+;
WS: [ \t\r]+ -> skip;
ID: '@'[A-Za-z_]+[0-9A-Za-z_]*;

PLUS: '+';
MINUS: '-';

OCTAVE_SHIFT: '\''+;
BASE_NOTE: 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g';
STRING: '"' ~[\r\n"]+ '"';

midi: statements;

newline: '\n'+ | EOF;
pitch_shift_sign: PLUS+ | MINUS+;

statements: newline* (statement newline)*;
statement: channel_declaration | group_declaration | channel;

channel_declaration: '#channel' name=ID instrument=NUM;
group_declaration: '#group' name=ID command+;
channel: channel_name=ID command+;

command: note | modifiers | playthrough;

note: base=BASE_NOTE (pitch_shift=pitch_shift_sign)? (octave_shift=OCTAVE_SHIFT)? (note_length=NUM)?;

modifiers: tempo | length | octave | volume | shift_octave | pitch_transpose;
tempo: 't' value=NUM;
length: 'l' value=NUM;
octave: 'o' value=NUM;
volume: 'v' value=NUM;

shift_octave: octave_up | octave_down;
octave_up: '>';
octave_down: '<';

pitch_transpose: 'p' (negative=MINUS)? value=NUM;

playthrough: tie | harmony | loop | group;

group: name=ID;
tie: note1=note '&' note2=note;
harmony: '(' note+ ')';
loop: '[' command+ ']' value=NUM;