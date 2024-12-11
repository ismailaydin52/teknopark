// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
    id("com.google.gms.google-services") version "4.4.2" apply false
}
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:8.3.2") // Update to the latest version
        classpath ("com.google.gms:google-services:4.3.15") // (En son sürümü kullanın)
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10") // Update to the latest version
    }
}
