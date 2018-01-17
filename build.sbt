name := "Enron Email ETL"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.lightbend.akka" %% "akka-stream-alpakka-file" % "0.16",
  "com.typesafe.akka" %% "akka-stream-kafka" % "0.18",
  "com.typesafe.akka" %% "akka-actor" % "2.5.9",
  "com.typesafe.akka" %% "akka-stream" % "2.5.9",
  "com.typesafe.akka" %% "akka-testkit" % "2.5.9" % Test,
  "com.typesafe.akka" %% "akka-stream-testkit" % "2.5.9" % Test,
  "com.sksamuel.avro4s" %% "avro4s-core" % "1.8.0",
  "io.eels" %% "eel-core" % "1.2.4",
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  "org.xerial" % "sqlite-jdbc" % "3.21.0.1",
  "com.github.aselab" %% "scala-activerecord" % "0.4.0"
)
