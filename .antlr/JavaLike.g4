grammar JavaLike;

main
    :   mainBody EOF
    |   WHITESPACE
    |   LINE_COMMENT
    ;
mainBody
    :   MAIN LEFT_CURLYBRACKET body RIGHT_CURLYBRACKET;

body
    :   lines*
    |   variable_declaration
    ;

if_statement
    :   IF_KEYWORD LEFT_BRACKET expression RIGHT_BRACKET LEFT_CURLYBRACKET body RIGHT_CURLYBRACKET
        (ELSIF_KEYWORD LEFT_BRACKET expression RIGHT_BRACKET LEFT_CURLYBRACKET body RIGHT_CURLYBRACKET)*
        (ELSE_KEYWORD RIGHT_CURLYBRACKET body LEFT_CURLYBRACKET)?
    ;

variable_declaration
    :   type_keyword Identifier ASSIGN expression;

while_statement
    :   WHILE_KEYWORD LEFT_BRACKET expression RIGHT_BRACKET LEFT_CURLYBRACKET body RIGHT_CURLYBRACKET
    ;

return_statement
    :   RETURN_KEYWORD expression
    ;

type_keyword
    :   BOOLEAN_KEYWORD 
    |   INTEGER_KEYWORD
    ;

lines
    :   variable_declaration SEMICOLON
    |   while_statement
    |   if_statement
    |   return_statement
    ;



type
	:	INTEGER
	|	BOOLEAN
	|	NULL
	;


expression 
    : EXCLAMATION  expression 
    | expression operators expression
    | atom;

atom : INTEGER | BOOLEAN | LEFT_BRACKET expression RIGHT_BRACKET;

operators : EQUAL | NOT_EQUAL | GREATER | GREATER_EQUAL | LESS | LESS_EQUAL | ANDAND | OROR | PLUS | MINUS |MULTIPLICATION;

// lex
Identifier
    : [a-zA-Z$_] [a-zA-Z0-9$_] *
    ;

ANDAND : '&&';
OROR : '||';
EQUAL : '==';
NOT_EQUAL : '!=';
LESS : '<';
LESS_EQUAL : '<=';
GREATER : '>';
GREATER_EQUAL : '>=';
EXCLAMATION : '!';

ASSIGN
    : '='
    ;

SEMICOLON
    : ';'
    ;

LEFT_BRACKET   
    : '('
    ;

RIGHT_BRACKET
    : ')'
    ;

RIGHT_CURLYBRACKET
    :   '}'
    ;

LEFT_CURLYBRACKET
    :   '{'
    ;

MAIN
    : 'public static void main(String[] argv)'
    ;

NULL
    :  	'null'
    ;

BOOLEAN
    :   'true'
    |   'false'
    ;


INTEGER
	: NUMBER;


fragment
NUMBER
	: '0'
	| NON_ZERO_DIGIT DIGITS?;

fragment
DIGITS
	: DIGIT DIGIT?;

fragment
DIGIT
	: '0'
	| NON_ZERO_DIGIT;


fragment
NON_ZERO_DIGIT
    :   [1-9]
    ;

// fragment
// DIGIT
//     : [0-9]
//     ;

// INTEGER
//     :
//     |   '0'
//     |   (NON_ZERO_DIGIT DIGIT*)
//    ;

WHILE_KEYWORD
    :  'while'
    ;

IF_KEYWORD
    :  'if'
    ;

ELSE_KEYWORD
    : 'else';

ELSIF_KEYWORD   
    : 'elsif';

INTEGER_KEYWORD
    :  'int'
    ;

RETURN_KEYWORD  
    : 'return'
    ;

BOOLEAN_KEYWORD
    :   'boolean'
    ;

PLUS
    : '+'
    ;
MINUS
    : '-'
    ;

MULTIPLICATION
    : '*'
    ;

WHITESPACE:  	[ \t\r\n\u000C]+ -> skip;
LINE_COMMENT:   '//'  ~[\r\n]* -> skip;