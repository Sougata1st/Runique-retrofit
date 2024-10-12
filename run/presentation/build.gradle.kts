plugins {
    alias(libs.plugins.runique.android.feature.ui)
}

android {
    namespace = "com.sougata.run.presentation"
}

dependencies {

    implementation(libs.coil.compose)
    implementation(libs.google.maps.android.compose)
    implementation(libs.androidx.activity.compose)
    implementation(libs.timber)
}