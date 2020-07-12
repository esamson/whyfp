import BuildSettings._

ThisBuild / scalaVersion := "2.13.2"

lazy val root = Project(id = "WhyFP", base = file("."))
  .aggregate(
    app
  )
  .settings(publish / skip := true)
  .disablePlugins(HeaderPlugin)

lazy val app = module("app")
  .settings(Dependencies.app)
