plugins {
    alias(libs.plugins.runique.android.library)

}

android {
    namespace = "com.sougata.run.location"

}

dependencies {

    implementation(libs.bundles.androidx.core)
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.google.android.gms.play.services.location)
    implementation(projects.core.domain)
    implementation(projects.run.domain)
}