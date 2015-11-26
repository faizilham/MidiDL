grammar Mdl;

midi:
	channel_declarations
	channels
;

NUM: [0-9]+;
WS: [ \t\r]+ -> skip;
ID: '@'[A-Za-z_]+[0-9A-Za-z_]*;

PLUS: '+';
MINUS: '-';

OCTAVE_SHIFT: '\''+;
BASE_NOTE: 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g';

newline: '\n'+ | EOF;
pitch_shift_sign: PLUS+ | MINUS+;

channel_declarations: newline* (channel_declaration newline)*;
channel_declaration: 'channel' name=ID instrument=NUM;

group_declarations: newline* (group_declaration group_declaration)*;
group_declaration: 'group' name=ID command+;
group_usage: name=ID;

channels:  newline* (channel newline)*;
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

playthrough: tie | harmony | loop;

tie: note1=note '&' note2=note;
harmony: '(' note+ ')';
loop: '[' command+ ']' value=NUM;