name := """kafka-stream-demo"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  guice,
  "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.0" % Test,
  "com.typesafe.akka" %% "akka-stream-kafka" % "0.17",
  "org.webjars" %% "webjars-play" % "2.6.2",
  "org.webjars" % "jquery" % "2.2.3",
  "org.webjars" % "bootstrap" % "3.3.6"
)