package com.sougata.convention

import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.api.plugins.PluginManager
import org.gradle.kotlin.dsl.getByType

val Project.libs
    get() = extensions.getByType<VersionCatalogsExtension>().named("libs")
