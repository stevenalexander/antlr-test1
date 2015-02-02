# ANTLR test project

Simple example project showing how to include [ANTLR 4.5](http://www.antlr.org/) into a Java application, using SBT for
the build with the [sbt-antlr4](https://github.com/ihji/sbt-antlr4) plugin to automatically compile the grammar file
under src/main/antlr.

This sample uses a grammar (starter/ArrayInit.g4) from the book ["The Definitive ANTLR 4 Reference"](https://pragprog.com/book/tpantlr2/the-definitive-antlr-4-reference),
the code samples used in the book are available online for free [here](https://pragprog.com/titles/tpantlr2/source_code).

## Setup

```
# get dependencies and compile
./sbt clean update compile

# run to parse input string "{4,3,2,1,0}", should output parsed LISP-style tree
./sbt "run {4,3,2,1,0}"
# output -> (init { (value 4) , (value 3) , (value 2) , (value 1) , (value 0) })
```
