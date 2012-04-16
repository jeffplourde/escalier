name := "escalier"

version := "0.4.2"

organization := "net.icorsaro"

homepage :=  Some(new java.net.URL("http://github.com/kydos/escalier"))

scalaVersion := "2.9.2"

libraryDependencies += "org.scala-lang" % "scala-swing" % "2.9.2"

libraryDependencies += "com.espertech" % "esper" % "4.2.0"

autoCompilerPlugins := true

addCompilerPlugin("org.scala-lang.plugins" % "continuations" % "2.9.2")

scalacOptions += "-deprecation"

scalacOptions += "-unchecked"
