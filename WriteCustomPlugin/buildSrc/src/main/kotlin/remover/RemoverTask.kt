package remover

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

abstract class RemoverTask : DefaultTask() {

    @TaskAction
    fun taskAction() {
        println("REMOVER TASK")
        val extension = project.extensions.getByName("remover") as RemoverExtension

        println("SNAP Resources: ${extension.getSnapResources().get()}")
        println("SNAP Assets: ${extension.getSnapAssets().get()}")
    }
}