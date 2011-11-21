import sbt._
import Keys._

object BuildSettings {
  val buildOrganization = "net.icorsaro"
  val buildVersion = "0.3"
  val buildScalaVersion = "2.9.1"

  val buildSettings = Defaults.defaultSettings  ++ Seq (
    organization := buildOrganization,
    version      := buildVersion,
    scalaVersion := buildScalaVersion
  )
}

object Resolvers {
  val sbtIdeaRepo = "sbt-idea-repo" at "http://mpeltonen.github.com/maven/"

  val sbtResolvers = Seq (sbtIdeaRepo)
}

object EscalierBuild extends Build
{
  import BuildSettings._
  import Resolvers._
  
   lazy val escalier = Project (
     "escalier", 
     file("."), 
     settings = buildSettings 
   ) dependsOn(idlib)

   lazy val idlib = 
     Project (
       "idlib", 
       file("idlib")) settings (
	 name := "escalier-idlib",
	 version := "0.3"
       )
}
