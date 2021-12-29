plugins {
    kotlin("jvm") version "1.6.0"
    id("com.google.cloud.tools.jib") version "3.1.4"

}


group = "com.marcinf"


repositories {
    mavenCentral()
}

jib {
    from {
        image ="azul/zulu-openjdk-alpine:17.0.1-17.30.15@sha256:61b9956f6514e403cd2132be7cc9a77f12c9008b93defa8962b2d6a7ccdfdbf4"
//        image = "azul/zulu-openjdk-centos:17-jre@sha256:16b97e5e900fc839addb1d015d0092905395bfdfad47d5399f0e62f047d228ef"
    }

}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.1")
    api("aws.sdk.kotlin:s3:0.9.5-beta")
}

