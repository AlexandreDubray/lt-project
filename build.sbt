ThisBuild / scalaVersion := "2.13.1"

lazy val root = project.in(file(".")).
  aggregate(projects.js, projects.jvm).settings(
  publish := {},
  publishLocal := {},
)

lazy val projects = crossProject(JSPlatform, JVMPlatform).in(file(".")).settings(
  name := "lt-project",
  version := "0.1",
).jsSettings(
  libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.0.0",
  scalaJSUseMainModuleInitializer := true,
).jvmSettings(
  libraryDependencies += "org.scalatest" % "scalatest_2.13" % "3.1.1" % "test",
)
