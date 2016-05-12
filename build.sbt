lazy val commonSettings = Seq(
  scalaVersion := "2.11.8",
  addCompilerPlugin("org.scalamacros" % "paradise" % "3.0.0-M1" cross CrossVersion.full)
)

lazy val core = project.in(file("core"))
  .dependsOn(macro)
  .settings(commonSettings: _*)

lazy val macro = project.in(file("macro"))
  .settings(commonSettings: _*)

