name := "twitter-stream-final"

version := "0.1"

scalaVersion := "2.11.12"

val sparkVersion = "1.5.2"

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}
