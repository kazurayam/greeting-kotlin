plugins {
    id("org.jetbrains.kotlin.jvm") version "2.0.0-Beta2"
    //id("org.jetbrains.kotlin.multiplatform") version "2.0.0-Beta2"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.json:json:20231013")
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}