plugins {
    alias(libs.plugins.runique.android.library.compose)
}

android {
    namespace = "com.sougata.core.presentation.ui"
}

dependencies {
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.bundles.compose)
    implementation(projects.core.domain)
    implementation(projects.core.presentation.designSystem)
}