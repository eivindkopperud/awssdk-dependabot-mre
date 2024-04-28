plugins {
    kotlin("jvm") version "1.9.23"
}

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation("software.amazon.awssdk:apache-client:2.25.36")
}

group = "com.mre"
version = "1.0.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = JavaVersion.VERSION_17.toString()
    kotlinOptions.javaParameters = true
}
