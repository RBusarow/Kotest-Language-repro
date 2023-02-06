plugins {
  kotlin("jvm") version "1.8.10"
}

java {
  toolchain.languageVersion.set(JavaLanguageVersion.of(11))
}

dependencies {

  implementation("io.kotest:kotest-common-jvm:5.5.5")
}
