val scala3Version = "3.3.4"

lazy val root = project
  .in(file("."))
  .settings(
    name := "Scala 3 Project Template",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= List(
      "org.typelevel" %% "cats-core" % "2.12.0",
      "org.typelevel" %% "kittens" % "3.4.0",
      "org.scalameta" %% "munit" % "1.0.3" % Test,
    )
  )
