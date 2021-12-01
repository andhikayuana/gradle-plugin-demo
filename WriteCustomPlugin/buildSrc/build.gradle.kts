plugins {

    `kotlin-dsl`
}


repositories {
    google()
    mavenCentral()
}


dependencies {
    implementation("com.android.tools.build:gradle:7.0.2")
    implementation(kotlin("stdlib"))
    gradleApi()
}