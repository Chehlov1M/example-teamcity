import jetbrains.buildServer.configs.kotlin.v2023_11.*
import jetbrains.buildServer.configs.kotlin.v2023_11.buildSteps.MavenBuildStep
import jetbrains.buildServer.configs.kotlin.v2023_11.triggers.VcsTrigger

object TeamCityHomework_deploy_to_master : BuildType({
    id = "TeamCityHomework_deploy_to_master"
    name = "Deploy to Master"
    
    vcs {
        root(DslContext.settingsRoot)
        checkoutMode = CheckoutMode.ON_AGENT
    }

    triggers {
        vcs {
            branchFilter = "+:refs/heads/master"
        }
    }

    steps {
        maven {
            goals = "clean deploy"
            mavenHomePath = "%env.MAVEN_HOME%"
            jdkHome = "%env.JAVA_HOME%"
        }
    }

    artifactRules = "+:**/*.jar => artifacts"
})
