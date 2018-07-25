
plugins {
  application
  kotlin("jvm") version "1.2.51"
}

dependencies {
  compile(kotlin("stdlib"))
  compile("org.projectlombok:lombok:1.18.0:WRONG") // play with this line
}

repositories {
  jcenter()
}

