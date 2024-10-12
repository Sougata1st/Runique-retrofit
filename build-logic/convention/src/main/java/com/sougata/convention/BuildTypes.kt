package com.sougata.convention

import com.android.build.api.dsl.ApplicationExtension
import com.android.build.api.dsl.BuildType
import com.android.build.api.dsl.CommonExtension
import com.android.build.api.dsl.LibraryExtension
import com.android.build.gradle.internal.cxx.configure.gradleLocalProperties
import org.gradle.api.Project
import org.gradle.internal.impldep.com.esotericsoftware.minlog.Log
import org.gradle.kotlin.dsl.configure

internal fun Project.configureBuildTypes(
    commonExtension: CommonExtension<*, *, *, *, *, *>,
    extensionType: ExtensionType
) {
    val apiKey = gradleLocalProperties(rootDir,providers).getProperty("API_KEY")

    commonExtension.run {
        buildFeatures {
            buildConfig = true
        }

        when (extensionType) {
            ExtensionType.APPLICATION -> {
                extensions.configure<ApplicationExtension> {
                    buildTypes {
                        release {
                            configureReleaseBuildTypes(
                                commonExtension,
                                apiKey
                            )
                        }

                        debug {
                            configureDebugBuildTypes(apiKey)
                        }
                    }
                }
            }

            ExtensionType.LIBRARY -> {
                extensions.configure<LibraryExtension> {
                    buildTypes {
                        release {
                            configureReleaseBuildTypes(
                                commonExtension,
                                apiKey
                            )
                        }
                        debug {
                            configureDebugBuildTypes(apiKey)
                        }
                    }
                }
            }
        }
    }
}

private fun BuildType.configureDebugBuildTypes(apiKey: String) {
    buildConfigField("String", "API_KEY", "\"$apiKey\"")
    buildConfigField("String", "BASE_URL", "\"https://runique.pl-coding.com:8080\"")
}

private fun BuildType.configureReleaseBuildTypes(
    commonExtension: CommonExtension<*, *, *, *, *, *>,
    apiKey: String
) {
    buildConfigField("String", "API_KEY", "\"$apiKey\"")
    buildConfigField("String", "BASE_URL", "\"https://runique.pl-coding.com:8080\"")
    isMinifyEnabled = true

    proguardFiles(
        commonExtension.getDefaultProguardFile("proguard-android-optimize.txt"),
        "proguard-rules.pro"
    )
}