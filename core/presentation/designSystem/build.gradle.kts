plugins {
    alias(libs.plugins.runique.android.library.compose)
}

android {
    namespace = "com.sougata.core.presentation.designsystem"
}

dependencies {

    implementation(platform(libs.androidx.compose.bom))
    api(libs.bundles.compose)
    implementation(libs.bundles.androidx.core)
}