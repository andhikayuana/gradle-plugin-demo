package hello

import com.android.build.gradle.AppExtension
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

abstract class HelloTask : DefaultTask() {

    @TaskAction
    fun taskAction() {
        println("Hello from ${project.parent?.name}")

//        project.extensions.extensionsSchema.forEach {
//            println(it.name)
//        }
        project.extensions.extensionsSchema.forEach {
//            println(it.name)
        }

//        sourceSets {
//            getByName("main") {
//                res.srcDirs("src/main/res", "src/main/remote-res")
//            }
//        }
        val androidExt = project.extensions.findByName("android") as AppExtension
        androidExt.sourceSets.asMap.forEach {
            println("KEY: ${it.key}, VALUE: ${it.value}")
            val androidSourceSet = it.value
            println(androidSourceSet.res.srcDirs.toString())
        }

        androidExt.sourceSets.getByName("main") {
            res.srcDirs("src/main/res", "src/main/remote-res")
        }
            //blm bisa add custom sourceset
//        androidExt.sourceSets.getByName("main").res.srcDirs("src/main/remote-res")






        project.properties.forEach {
            if (it.key.contains("source")) {
//                println("KEY: ${it.key} -> VALUE: ${it.value}")
            }


        }


    }
}