plugins {
    application
    kotlin("jvm") version "1.3.71"
    kotlin("kapt") version "1.3.71"
    id("com.github.johnrengelman.shadow") version "6.0.0"
}

group = "org.mchpr"
version = "1.0-SNAPSHOT"

application {
    mainClassName = "mchpr.MchprKt"
}

repositories {
    jcenter()
    mavenCentral()
    maven {
        name = "sonatype-oss"
        url = uri("https://oss.sonatype.org/content/groups/public/")
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation(group = "io.ktor", name = "ktor-server-netty", version = "1.3.2")
    implementation(group = "io.ktor", name = "ktor-html-builder", version = "1.3.2")
    implementation(group = "org.jetbrains", name = "kotlin-css-jvm", version = "1.0.0-pre.109-kotlin-1.3.72")
    compileOnly(group = "junit", name = "junit", version = "4.12")
}
