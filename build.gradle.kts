plugins {
    `java-library`
    `maven-publish`
    with(Plugins.Shadow) { id(id) version (version) }
    id("org.sonarqube") version "6.0.1.5171"
}

group = "com.github.Lipen"

subprojects {
    group = "${rootProject.group}.${rootProject.name}"
    version = rootProject.version
}

allprojects {
    apply(plugin = "java-library")
    apply(plugin = "maven-publish")

    repositories {
        mavenCentral()
    }

    java {
        toolchain.languageVersion.set(JavaLanguageVersion.of(8))

        withSourcesJar()
        // withJavadocJar()
    }

    publishing {
        publications {
            create<MavenPublication>("maven") {
                from(components["java"])
            }
        }
        repositories {
            maven(url = uri(layout.buildDirectory.dir("repository")))
        }
    }
}

dependencies {
    for (p in subprojects) {
        implementation(p)
    }
}

tasks.wrapper {
    gradleVersion = "8.3"
    distributionType = Wrapper.DistributionType.ALL
}

sonar {
    properties {
        property("sonar.projectKey", "JulietJavaTest")
        property("sonar.host.url", "http://localhost:9000")
        property("sonar.token", "sqp_1da741f37ccdd1680a815dc7b9895e8f5b4fa439")
    }
}
