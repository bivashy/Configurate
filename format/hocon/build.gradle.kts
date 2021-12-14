plugins {
    id("org.spongepowered.configurate.build.component")
}

description = "HOCON format loader for Configurate"

dependencies {
    val guavaVersion: String by project

    api(projects.core)
    implementation("com.typesafe:config:1.4.1")
    testImplementation("com.google.guava:guava:$guavaVersion")
}
