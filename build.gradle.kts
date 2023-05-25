plugins {
    kotlin("jvm") version "1.8.20"
    application
}

group = "io.github.xsqssender"
version = "1.0.0"
description = "Xquare SQS Sender"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation(Dependencies.AWS_MESSAGING)
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}

application {
    mainClass.set("MainKt")
}