package com.example;

import org.antlr.v4.runtime._;
import org.antlr.v4.runtime.tree._;

object ScalaCompilerApplication extends App {
  var inputText: String  = "{1,2,3,4}";
  if (args != null && args.length > 0) {
      inputText = args(0);
  }

  // create a CharStream that reads from standard input
  val input: ANTLRInputStream = new ANTLRInputStream(inputText);

  // create a lexer that feeds off of input CharStream
  val lexer: ArrayInitLexer = new ArrayInitLexer(input);

  // create a buffer of tokens pulled from the lexer
  val tokens: CommonTokenStream = new CommonTokenStream(lexer);

  // create a parser that feeds off the tokens buffer
  val parser: ArrayInitParser = new ArrayInitParser(tokens);

  val tree: ParseTree = parser.init(); // begin parsing at init rule
  System.out.println(tree.toStringTree(parser)); // print LISP-style tree

}
