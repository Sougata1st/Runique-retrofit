package com.sougata.convention

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureAndroidCompose(
    commonExtension: CommonExtension<*, *, *, *, *, *>
) {
    commonExtension.run {
        buildFeatures.compose = true
        composeOptions {
            kotlinCompilerExtensionVersion = libs.findVersion("composeCompiler")
                .get()
                .toString()
        }

        dependencies {
            val bom = libs
                    .findLibrary("androidx-compose-bom")
                    .get()
            "implementation"(platform(bom))
            "androidTestImplementation"(platform(bom))
            "implementation"(libs.findBundle("compose").get())
        }
    }
}