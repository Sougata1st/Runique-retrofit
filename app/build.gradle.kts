plugins {
    alias(libs.plugins.runique.android.application.compose)
    alias(libs.plugins.mapsplatform.secrets.plugin)
}

android {
    namespace = "com.sougata.runique"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    // coil
    implementation(libs.coil.compose)

    // androidx core
    implementation(libs.bundles.androidx.core)

    //crypto
    implementation(libs.androidx.security.crypto.ktx)

    //play core
    api(libs.bundles.play.core)

    testImplementation(libs.junit)
    androidTestImplementation(libs.bundles.androidx.test)
    debugImplementation(libs.androidx.compose.ui.tooling)
    debugImplementation(libs.androidx.compose.ui.test.manifest)

    //location
    implementation(libs.google.android.gms.play.services.location)

    //splash screen
    implementation(libs.androidx.core.splashscreen)
    //timber
    implementation(libs.timber)

    implementation(projects.core.presentation.designSystem)
    implementation(projects.core.presentation.ui)
    implementation(projects.core.domain)
    implementation(projects.core.data)
    implementation(projects.core.database)

    implementation(projects.auth.presentation)
    implementation(projects.auth.domain)
    implementation(projects.auth.data)

    implementation(projects.run.presentation)
    implementation(projects.run.domain)
    implementation(projects.run.data)
    implementation(projects.run.location)
    implementation(projects.run.network)
}