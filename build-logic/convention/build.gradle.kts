plugins {
    `kotlin-dsl`
}
group = "com.sougata.runique.buildlogic"

dependencies{
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.android.tools.common)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.room.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
}

gradlePlugin{
    plugins{
        register("androidApplication"){
            id = "runique.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        register("AndroidApplicationComposeConventionPlugin"){
            id = "runique.android.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }
        register("AndroidLibraryConventionPlugin"){
            id = "runique.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }
        register("AndroidLibraryComposeConventionPlugin"){
            id = "runique.android.library.compose"
            implementationClass = "AndroidLibraryComposeConventionPlugin"
        }
        register("AndroidFeatureUiConventionPlugin"){
            id = "runique.android.feature.ui"
            implementationClass = "AndroidFeatureUiConventionPlugin"
        }
        register("JvmLibraryConventionPlugin"){
            id = "runique.jvm.library"
            implementationClass = "JvmLibraryConventionPlugin"
        }
        register("RoomConventionPlugin"){
            id = "runique.android.room"
            implementationClass = "RoomConventionPlugin"
        }
        register("JvmKtorConventionPlugin"){
            id = "runique.jvm.ktor"
            implementationClass = "JvmKtorConventionPlugin"
        }
    }
}
