grammar Brainfucker;

options {
  language=CSharp3;
  output=AST;

  backtrack=true;
  memoize=true;
}

tokens {
  UNKNOWN            	;
  PRINT   	= '.' 	;
  INPUT   	= ',' 	;
  WHILE 	= '['   ;
  BLOCK               	;
  PROGRAM             	;
}

@lexer::namespace { Brainfucker }
@parser::namespace { Brainfucker }


file	:	simple | complex?;
complex	:	WHILE ( simple* ) RBRACKET;
simple	:	MVLEFT | MVRIGHT | INCR | DECR | PRINT | INPUT;

MVLEFT  :	'<';
MVRIGHT	:	'>';
INCR	:	'+';
DECR	:	'-';
RBRACKET:	']';

