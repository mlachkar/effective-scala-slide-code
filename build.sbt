/***************************************************************
  *      THIS IS A GENERATED FILE - EDIT AT YOUR OWN RISK      *
  **************************************************************
  *
  * Use the mainadm command to generate a new version of
  * this build file.
  *
  * See https://github.com/lightbend/course-management-tools
  * for more details
  *
  */

import sbt._

Global / onChangedBuildSource := ReloadOnSourceChanges

lazy val `effective-scala-master` = (project in file("."))
  .aggregate(
    `week_001_effective_scala_introduction`,
    `week_002_business_code`,
    `week_004_reasoning_about_code`
  )
  .settings(ThisBuild / scalaVersion := Version.scalaVersion)
  .settings(CommonSettings.commonSettings: _*)

lazy val `week_001_effective_scala_introduction` = project
  .configure(CommonSettings.configure)

lazy val `week_002_business_code` = project
  .configure(CommonSettings.configure)

lazy val `week_004_reasoning_about_code` = project
  .configure(CommonSettings.configure)
       