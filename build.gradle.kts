plugins {
    kotlin("multiplatform") version "1.8.0"
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

group = "me.user"
version = "1.0-SNAPSHOT"

var skikoVersion = "0.7.54"

repositories {
    mavenCentral()

    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")

}

kotlin {
    jvm {
        jvmToolchain(11)
        withJava()
        testRuns["test"].executionTask.configure {
            useJUnitPlatform()
        }
    }

    
    sourceSets {
        val commonMain by getting {
            dependencies {
                compileOnly("org.jetbrains.skiko:skiko:$skikoVersion")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val jvmMain by getting {
            dependencies {
                api("org.jetbrains.skiko:skiko-awt:$skikoVersion")
                runtimeOnly("org.jetbrains.skiko:skiko-awt-runtime-windows-x64:$skikoVersion")
                runtimeOnly("org.jetbrains.skiko:skiko-awt-runtime-linux-x64:$skikoVersion")
                runtimeOnly("org.jetbrains.skiko:skiko-awt-runtime-linux-arm64:$skikoVersion")
                runtimeOnly("org.jetbrains.skiko:skiko-awt-runtime-macos-x64:$skikoVersion")
                runtimeOnly("org.jetbrains.skiko:skiko-awt-runtime-macos-arm64:$skikoVersion")

            }

        }
        val jvmTest by getting
    }
}
