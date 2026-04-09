grammar TallGrass;

@header {
import static TallGrass.AST.*;
}

// Parser Specification of this Programming Language
//  - parser specification rules start with lowercase
// YOU WILL NEED TO EDIT THE PARSER RULES FOR THIS ASSGINMENT

program returns [Program ast] :
    s=stmt { $ast = new Program($s.ast); }
;

stmt returns [Exp ast]
    : Spot i=Identifier Level r=exp  { $ast = new SpotStmt($i.text, $r.ast); }
    | Check '(' c=exp ')' body=stmt Retreat { $ast = new CheckStmt($c.ast, $body.ast); }
    | 'print' e=exp { $ast = new PrintExp($e.ast); }
    | Shout e=exp { $ast = new ShoutExp($e.ast); }
    | e=exp         { $ast = $e.ast; }
;
exp returns [Exp ast]
    : i=Identifier ':=' r=exp  { $ast = new AssignExp($i.text, $r.ast); }
    | l=exp '>' r=exp          { $ast = new GreaterExp($l.ast, $r.ast); }
    | l=exp '<' r=exp          { $ast = new LessExp($l.ast, $r.ast); }
    | l=exp '==' r=exp         { $ast = new EqualExp($l.ast, $r.ast); }
    | l=exp '+' r=exp          { $ast = new AddExp($l.ast, $r.ast); }
    | l=exp '-' r=exp          { $ast = new SubExp($l.ast, $r.ast); }
    | l=exp '*' r=exp          { $ast = new MulExp($l.ast, $r.ast); }
    | l=exp '/' r=exp          { $ast = new DivExp($l.ast, $r.ast); }
    | l=exp '^' r=exp          { $ast = new PowExp($l.ast, $r.ast); }
    | '-' e=exp                { $ast = new NegExp($e.ast); }
    | '(' e=exp ')'            { $ast = $e.ast; }
    | s=String                 { $ast = new StringExp($s.text.substring(1, $s.text.length()-1)); }
    | n=number                 { $ast = $n.ast; }
    | i=Identifier             { $ast = new VarExp($i.text); }
    ;
number returns [Exp ast]
    : n0=Number Dot n1=Number { $ast = new NumExp(Double.parseDouble($n0.text+"."+$n1.text)); }
    | n0=Number               { $ast = new NumExp(Double.parseDouble($n0.text)); };

 // Lexical Specification of this Programming Language
 //  - lexical specification rules start with uppercase
 // YOU SHOULD NOT EDIT THESE RULES IN THIS ASSIGNMENT
 Print : 'print';
 Shout : 'shout';
 Spot : 'spot';
 Level : 'level';
 Check : 'check';
 Retreat : 'retreat';
 Dot : '.' ;

 Number : DIGIT+ ;

 String : '"' (~["])* '"' ;

 Identifier :   Letter LetterOrDigit*;

 Letter :   [a-zA-Z$_]
	|   ~[\u0000-\u00FF\uD800-\uDBFF] 
		{Character.isJavaIdentifierStart(_input.LA(-1))}?
	|   [\uD800-\uDBFF] [\uDC00-\uDFFF] 
		{Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}? ;

 LetterOrDigit: [a-zA-Z0-9$_]
	|   ~[\u0000-\u00FF\uD800-\uDBFF] 
		{Character.isJavaIdentifierPart(_input.LA(-1))}?
	|    [\uD800-\uDBFF] [\uDC00-\uDFFF] 
		{Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?;

 fragment DIGIT: ('0'..'9');


 AT : '@';
 ELLIPSIS : '...';
 WS  :  [ \t\r\n\u000C]+ -> skip;
 Comment :   '/*' .*? '*/' -> skip;
 Line_Comment :   '//' ~[\r\n]* -> skip;
