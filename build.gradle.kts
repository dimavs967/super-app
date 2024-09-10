//buildscript {
//    dependencies {
//        classpath(libs.google.services)
//    }
//}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
//    alias(libs.plugins.googleServices) apply false
    alias(libs.plugins.googleKsp) apply false
    alias(libs.plugins.compose.compiler) apply false
    alias(libs.plugins.kotlin.serialization) apply false
    alias(libs.plugins.googleHilt) apply false
}

