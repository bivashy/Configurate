plugins {
    id("org.spongepowered.configurate.build.component")
}

description = "JSON format loader for Configurate, implemented using Jackson"

dependencies {
    val guavaVersion: String by project

    api(projects.core)
    api("com.fasterxml.jackson.core:jackson-core:2.13.0")
    testImplementation("com.google.guava:guava:$guavaVersion")
}
