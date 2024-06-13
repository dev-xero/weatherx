// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
	alias(libs.plugins.android.application) apply false
	alias(libs.plugins.jetbrains.kotlin.android) apply false
	kotlin("kapt") version "2.0.0"
	alias(libs.plugins.dagger.hilt.android) apply false
	id("org.jetbrains.kotlin.plugin.serialization") version "1.7.10" apply false
}