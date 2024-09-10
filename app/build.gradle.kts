plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
//    alias(libs.plugins.googleServices)
    alias(libs.plugins.googleHilt)
    alias(libs.plugins.googleKsp)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.kotlin.serialization)
}

android {
    namespace = "com.mone.app"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.mone.app"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
        buildConfig = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.sentry.android)
    implementation(libs.androidx.security.crypto)
    implementation(libs.play.services.location)

    implementation(libs.bundles.common)
    implementation(libs.bundles.lottie)
    implementation(libs.bundles.compose)
    implementation(libs.bundles.googleServices)

    implementation(libs.bundles.coroutines)
    implementation(libs.bundles.network)

    implementation(libs.bundles.hilt)
    ksp(libs.hilt.android.compiler)

    implementation(platform(libs.androidx.compose.bom))

    testImplementation(libs.junit)

    debugImplementation(libs.leakcanary.android)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
}