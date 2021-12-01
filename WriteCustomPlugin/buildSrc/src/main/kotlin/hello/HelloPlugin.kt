package hello

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.register

abstract class HelloPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.tasks.register<HelloTask>("hello")


    }
}