# Basic_Compiler
Course: Compiler Design

### Problem Definition
For the project, consider a language called DualLang. This language is designed for communication between two devices named Device 1 and Device 2. It supports numerical and algebraic computations, conditional statements, loops, and multiple functions for interaction between the two devices. Below are examples of language definitions using Antlr:

### Numerical Computations (Algebraic and Logical)
The DualLang language should be capable of numerical computation both algebraically and logically:
- Addition: `a + b`
- Subtraction: `a - b`
- Multiplication: `a * b`
- Division: `a / b`
- Modulus: `a % b`
- Exponentiation: `a ^ b`

### Conditional Statements
The language should be able to execute conditional statements (else-then-if). For example:
```antlr
IF (a > b) THEN
    PRINT "a is greater than b";
ELSE
    PRINT "b is greater than or equal to a";
```
### Multiple Loops
For checking multiple conditions, sometimes multiple loops are needed. The language should be able to handle multiple loops, for example, performing numerical computations. Here are some examples of these rules:

### Multiple Functions
Similar to the example provided above, our language allows the user to define and use functions with different names and parameters.

### Rules
```antlr
[ \t\r\n]+ -> skip;
```

### Implementation and Evaluation:

First Phase of the Project
We design and implement the lexical analyzer. Design and implement the lexical analyzer (Lexical) using Antlr, ensuring the following features:

- Ability to display errors (report the maximum number each time the compiler is executed)
- Create an interface for a better user experience for the analyzer.

Second Phase of the Project
We design and implement the syntactic analyzer. Design and implement the syntax analyzer (Syntax) using Antlr, ensuring the following features:

- Ability to display errors (report the maximum number each time the compiler is executed)
