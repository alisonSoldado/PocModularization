// Top-level build file where you can add configuration options common to all sub-projects/modules.
//plugins {
//    id(libs.plugins.android.application.get().pluginId) apply false
//    id(libs.plugins.jetbrains.kotlin.android.get().pluginId) apply false
//    id(libs.plugins.android.library.get().pluginId) apply false
//}

buildscript {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }

    dependencies {
        classpath(libs.kotlin.gradle.plugin)
        classpath(libs.android.gradle.plugin)
    }
}