TallGrass
1. Introduction
a. Brief description of the design philosophy of your language.
The idea behind TallGrass is that the computer itself is an ecosystem. All
data points are specimens hidden in grass. Arrays are like patches of grass. Loops
are more of the action of rustling through the patches of grass (arrays) to find the
data needed. Our language prioritizes readability over syntax. This is a domain
specific language with field researchers (programmers) in mind. (Are we catching
the Pokemon references, yet?)
b. Discussion of the languages that influenced your language design.
Python is our main influencer for our language for its readability and
prioritization of programmers. Pokemon is also an influencer, but clearly, that’s
not a computing language.
2. EBNF Description of your language syntax
<program> ::= <statement>+
<statement> ::= <spotStmt>
| <checkStmt>
| <rustleStmt>
| <shoutStmt>
| <callStmt>
<spotStmt> ::= “spot” <identifier> “level” (<expression>
| <patchDef>
| <objectDef>)
<patchDef> ::= “patch” “[“ <expression> ( “
,
” <expression> )* “]”
<objectDef> ::= “specimen” “{“ ( <identifier> “:” <expression> ( “
<identifier> “:” <expression> )* )? “}”
”
,
<shoutStmt> ::= “shout” <expression>
<checkStmt> ::= “check” “(“ <condition> “)“ <statement>* “retreat”
<rustleStmt> ::= “rustle” <identifier> “through“ <expression> “to”
<expression> <statement>* “hikeOver”
<callStmt> ::= “call” <identifier> “(“ <expression>* “)”
3. Semantic Behavior Description
a. Describe variable binding.
The keyword spot binds a value to a name. All of our variables are global
initially so it’s easier to manage game states like playerScore or dealerScore in a
blackjack program. There is overwriting; so, if you spot a specimen that already
exists, the old data will be overwritten.
b. Describe your control structures.
check is how we branch. It evaluates a boolean. If the condition is met,
then the “researcher stays in the grass” to execute the code. If the condition is
NOT met, then the “researcher retreats” (to the next line of code…)
rustle is how we loop. This carries the researcher through a range of
numbers, or a patch of grass (an array) one by one.
c. Define what every keyword means.
Keyword Meaning
spot Declares a variable
level Assignment operator (=)
shout Outputs/Prints
listen Inputs
patch Array
check IF statement
retreat End of an if statement
rustle FOR loop
hikeOver Ends a loop
4. Code Examples
a. Hello, World
shout “Hello, World”
b. Random Number Demonstration
spot hiddenValue level random(1, 11)
shout “A wild number has appeared! Its level is: ”
shout hiddenValue
c. Prompt the user for a starting number and an ending number. Count from the start
to the end, printing each number and indicating whether that number is even or
odd.
shout “Enter your starting specimen ID#: ”
spot start level listen
shout “Enter your ending specimen ID#: ”
spot end level listen
rustle i through start to end
spot number level i % 2
check (number == 0)
shout i + “ is an EVEN specimen!”
retreat
check (number != 0)
shout i + “ is an ODD specimen!!”
retreat
hikeOver
d. Write an example that illustrates all other parts of your language (if you didn't use
those features in the first three.) For example, objects, function calls, graphical
programming, etc.
// to define a specimen object
spot myStarter level specimen {
name: “Charmander”
stamina: 50
isShiny: false
}
// procedure to help boost stats
Procedure levelUp(subject)
spot subject.stamina level subject.stamina + 10
shout subject.name + “ gained stamina!!”
hikeOver
// main logic
shout “Current Stamina: ”
shout myStarter.stamina
call levelUp(myStarter)
check (myStarter > 55)
shout “Your specimen is growing strong!”
retreat