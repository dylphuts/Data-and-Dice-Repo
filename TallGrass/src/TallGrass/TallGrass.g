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
    | 'print' e=exp { $ast = new PrintExp($e.ast); }
    | Shout e=exp { $ast = new ShoutExp($e.ast); }
    | e=exp         { $ast = $e.ast; }
;
exp returns [Exp ast]
    : i=Identifier ':=' r=exp  { $ast = new AssignExp($i.text, $r.ast); }
    | l=exp '+' r2=term        { $ast = new AddExp($l.ast, $r2.ast); }
    | l=exp '-' r3=term        { $ast = new SubExp($l.ast, $r3.ast); }
    | t=term                   { $ast = $t.ast; }
    ;
term returns [Exp ast]
    : l=term '*' r=factor { $ast = new MulExp($l.ast, $r.ast); }
    | l=term '/' r=factor { $ast = new DivExp($l.ast, $r.ast); }
    | f=factor            { $ast = $f.ast; };
factor returns [Exp ast]
    : b=base '^' f=factor { $ast = new PowExp($b.ast, $f.ast); }
    | b=base              { $ast = $b.ast; };
base returns [Exp ast]
    : '-' b=base    { $ast = new NegExp($b.ast); }
    | '(' e=exp ')' { $ast = $e.ast; }
    | n=number      { $ast = $n.ast; }
    | i=Identifier  { $ast = new VarExp($i.text); };
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
 Dot : '.' ;

 Number : DIGIT+ ;


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
