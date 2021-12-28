plugins {
  kotlin("jvm")
  `maven-publish`
  jacoco
}

setupJacoco()

kotlin {
  explicitApi()
}

publishToSpace("java")

val intellijPlatformVersion: String by project

dependencies {
  compileOnly(project(":projector-common"))
  api(project(":projector-util-logging"))

  compileOnly("com.jetbrains.intellij.platform:bootstrap:$intellijPlatformVersion")
  compileOnly("com.jetbrains.intellij.platform:util-base:$intellijPlatformVersion")

  testImplementation(kotlin("test"))
}
