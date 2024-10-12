plugins {
    alias(libs.plugins.runique.android.library)
    alias(libs.plugins.runique.android.room)
    //room
}

android {
    namespace = "com.sougata.core.database"
}

dependencies {

    implementation(libs.org.mongodb.bson)
    implementation(projects.core.domain)
}