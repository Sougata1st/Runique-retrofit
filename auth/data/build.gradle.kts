plugins {
    alias(libs.plugins.runique.android.library)
}

android {
    namespace = "com.sougata.auth.data"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.core.data)
    implementation(projects.auth.domain)
}