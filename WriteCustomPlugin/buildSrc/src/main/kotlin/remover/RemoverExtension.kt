package remover

import org.gradle.api.provider.Property

interface RemoverExtension {
    fun getSnapResources(): Property<String>
    fun getSnapAssets(): Property<String>

}