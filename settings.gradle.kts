pluginManagement {
    includeBuild("build-logic")
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

gradle.startParameter.excludedTaskNames.addAll(listOf(":build-logic:convention:testClasses"))


rootProject.name = "Runique"
include(":app")
include(":auth:data")
include(":auth:domain")
include(":auth:presentation")
include(":core:database")
include(":core:presentation:ui")
include(":core:presentation:designSystem")
include(":core:domain")
include(":core:data")
include(":run:data")
include(":run:domain")
include(":run:presentation")
include(":run:location")
include(":run:network")
