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

val coroutinesVersion: String by project
val intellijPlatformVersion: String by project

dependencies {
  compileOnly(project(":projector-common"))
  api(project(":projector-util-logging"))

  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion")

  compileOnly("com.jetbrains.intellij.platform:bootstrap:$intellijPlatformVersion")
  compileOnly("com.jetbrains.intellij.platform:util-base:$intellijPlatformVersion")

  testImplementation(kotlin("test"))
}
