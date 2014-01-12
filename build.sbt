name := "products"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache
)

libraryDependencies ++= Seq(
  "net.sf.barcode4j" % "barcode4j" % "2.0"
)

play.Project.playScalaSettings
