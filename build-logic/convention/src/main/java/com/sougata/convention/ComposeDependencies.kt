package com.sougata.convention

import org.gradle.api.Project
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.project

fun DependencyHandlerScope.addUiLayerDependencies(project: Project){
    "implementation"(project(":core:presentation:ui"))
    "implementation"(project(":core:presentation:designSystem"))

    "implementation"(project.libs.findBundle("compose").get())
    "implementation"(project.libs.findBundle("compose.debug").get())
    "implementation"(project.libs.findBundle("koin.compose").get())
    "androidTestImplementation"(project.libs.findLibrary("androidx.compose.ui.test.junit4").get())
}