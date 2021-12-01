package remover

import org.gradle.api.Plugin
import org.gradle.api.Project


class RemoverPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        val extension = project.extensions.create("androidRemover", RemoverExtension::class.java)

//        project.tasks.register<RemoverTask>("remover")
        if (project.plugins.hasPlugin("com.android.application")) {

            println("HAI REMOVER")

//            project.properties.forEach {
//
//            }

        } else {
            throw IllegalStateException("need com.android.application plugin")
        }
    }
}