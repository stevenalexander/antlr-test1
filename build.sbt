scalaVersion := "2.13.5"

enablePlugins(Antlr4Plugin)
antlr4Version in Antlr4 := "4.9.2"
antlr4GenListener in Antlr4 := true
antlr4GenVisitor in Antlr4 := true
antlr4PackageName in Antlr4 := Some("com.example")