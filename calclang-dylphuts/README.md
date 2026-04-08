[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=22755331)
# TallGrass

TallGrass is an infix calculator language which calculates according to the
PEMDAS order of operations. This assignment's starter code is derived from the
[arithlang](https://github.com/hridesh/arithlang) example language, though it
differs in several important ways. First, rather than relying on fully
parenthesized prefix calculations, this language imposes both operator
precedence and associativity through its grammar.  Second, all of our operations
are either binary or unary, so there are no lists of operands to be constructed.

There are two main objectives in this assignment:

1. (Part 1) Implement a language from a specified grammar.
2. (Part 2) Add an operator to the grammar with proper precedence and
   implement that change in the language.

## Part 1 - Implementing an Infix Grammar

__Precedence__ is the term used in programming languages to specify the
order of operations of operators. Every operator in a programming language
exists at some "precedence level" and ties in precedence are broken according
to the operator's __associativity__ rules. _Associativity_ is always "left"
or "right" associative meaning we process operators of like precedence from
either left-to-right or right-to-left. In our language, we will be following
these rules for precedence and associativity:

| Precedence | Operator(s) | Associativity|
|------------|-------------|--------------|
| 1          | `()`        | left         |
| 2          | `^`         | right        |
| 3          | `* /`       | left         |
| 4          | `+ -`       | left         |

Note that here, we have one single right associative operator, exponent.
This is likely a different behavior than some calculators would have. For
example, in our language `2^3^2` is fully bracketed as `2^(3^2)` or `2^9`, 
not `(2^3)^2`. Also, it should be noted that `()` is not so much an operator
as it is a grouping method.

Order of operations can be imposed by a set of mutually recursive production
rules. The trick is to specify the grammar in such a way that it always
builds a parse tree that has the correct order of operations. Effectively,
operations with higher precedence, the ones that happen first, are placed
further down the recursion path. This puts these operations close to the leaves
of the tree. Operations which happen later are toward the beginning of
the path, and therefore tend to be closer to the root of the tree.

For PEMDAS, the standard way to define a grammar which has this property
is as follows:

```
< Exp >    ::= < Exp > + < Term >
               | < Exp > - < Term >
               | < Term >

< Term >   ::= < Term > * < Factor >
               | < Term > / < Factor >
               | < Factor>

< Factor > ::= < Base > ^ < Factor >
               | < Base >

< Base >   ::= ( < Exp > )
               | < Number >

< Number > ::= [0-9]+
               | [0-9]+ . [0-9]+  
```

There a few things worth taking note of here. First, most of these rules
are _left recursive_, meaning they immediately begin with a recursive
call to themselves. In order to make this work with a parser generator,
we must have at least one non-left recursive rule in each of these
sets. One rule, Factor, is right recursive. This direction of recursion controls
the associativity of the operations. A left recursive rule is left associative
and a right recursive rule is right associative.

Your task in this section is to implement this grammar. To achieve this goal,
you will need to alter several source files in the `src/TallGrass` directory:

- `TallGrass.g`
- `AST.java`
- `Evaluator.java`
- `Printer.java`

### Procedure

1. Look over all of these files and make sure you understand what has already
   been done for you.
2. Add the following classes to `AST.java` (All of these will inherit BinaryExp):
   1. `SubExp`
   2. `MulExp`
   3. `DivExp`
   4. `PowExp`
3. Add the necessary visit methods to the interface at the bottom of `AST.java`.
4. Implement the necessary visitor methods in `Evaluator.java`.
5. Implement the necessary visitor methods in `Printer.java`.
6. Alter `TallGrass.g` to conform to the above grammar.

### Hints

- Almost all of this can be done by copy, paste, and slight modifications.
- In this language, each rule might return several types of expressions. 
  As a result, you'll use `Exp` as the return type of all parser rules.
- Remember that the ANTLR file is being used to produce java code. As a result,
  errors in the `parser` directory really indicate errors in your code templates in
  the `.g` file!

## Part 2 - Adding a Unary Negation Operation

The previous section was part tutorial part coding exercise. This section will ask 
you to apply what you have learned. We are going to add a unary negation operator
to our language. The unary negation should have the following properties:

1. It should be right associative.
2. It should have the highest level of precedence, taking "immediate effect" on
   what comes to its right. This means it really takes on two forms:
   1. `- Number`
   2. `- ( Exp )`

### Procedure

1. Create a file called `bnf.txt` in the root directory of your codespace.
2. Copy the BNF grammar above into `bnf.txt`
3. Modify the BNF grammar to correctly specify the negation operator.
4. Implement the negation operator by modifying the necessary files in 
   TallGrass

## Submission Requirements

- Be sure to add and commit all of your files before submitting.
- Your program must have the following behaviors:
  - PEMDAS fully works.
  - Negation operator works.
- You must include the `bnf.txt` file in your submission.
- This assignment does not have an autograder.
- Submit the URL of your code repository for grading.