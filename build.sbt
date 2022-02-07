

lazy val scalagen = (project in file("scalagen"))
  .settings(
    // identity
    organization := "com.any",
    organizationName := "any",
    // versions
    scalaVersion := "2.12.15",
    // dependencies
    libraryDependencies ++= Seq(
      // escape utils 
      "joda-time" % "joda-time" % "2.3",
      "org.joda" % "joda-convert" % "1.6",
      "com.google.code.javaparser" % "javaparser" % "1.0.10",
      "org.apache.commons" % "commons-text" % "1.7",
      "org.apache.commons" % "commons-io" % "1.3.2"
    ),
    // compile options
    scalacOptions ++= Seq(
      "-deprecation",
      "-unchecked", 
      "-feature",
      // "-Ywarn-unused",
      "-language:reflectiveCalls",
      "-language:implicitConversions"
    ),
    name := "scalagen",
    assembly / mainClass := Some("com.mysema.scalagen.Cli"),
    assembly / assemblyJarName := "scalagen.jar",
    assembly / test := {},
    assembly / assemblyOutputPath := file("./bin/scalagen.jar")
  )




