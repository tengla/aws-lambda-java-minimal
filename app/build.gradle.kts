/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin application project to get you started.
 * For more details take a look at the 'Building Java & JVM projects' chapter in the Gradle
 * User Manual available at https://docs.gradle.org/6.8.2/userguide/building_java_projects.html
 */

version = "0.1"

plugins {
  // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
  id("org.jetbrains.kotlin.jvm") version "1.4.20"

  // add shadowJar task
  id("com.github.johnrengelman.shadow") version "5.2.0"

  // Apply the application plugin to add support for building a CLI application in Java.
  application
}

repositories {
  maven(url = "https://kotlin.bintray.com/kotlinx/") // soon will be just jcenter()
  // Use JCenter for resolving dependencies.
  jcenter()
}

dependencies {
  // Align versions of all Kotlin components
  implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

  // kotlinx datetime
  implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.1.1")

  // Use the Kotlin JDK 8 standard library.
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

  // This dependency is used by the application.
  implementation("com.google.guava:guava:29.0-jre")

  // aws lambda sdk
  implementation("com.amazonaws:aws-lambda-java-core:1.2.1")

  // Use the Kotlin test library.
  testImplementation("org.jetbrains.kotlin:kotlin-test")

  // Use the Kotlin JUnit integration.
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

application {
  // Define the main class for the application.
  // 'shadowJar' is presumably not ready for this yet, so
  // use old style.
  // Never mind the deprecation warnings.
  // mainClass.set("trafficinfo.baseline.lambda.minimal.AppKt")
  mainClassName = "trafficinfo.baseline.lambda.minimal.AppKt"
}
