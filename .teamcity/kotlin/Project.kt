import jetbrains.buildServer.configs.kotlin.v2023_11.*
import jetbrains.buildServer.configs.kotlin.v2023_11.projectFeatures.VersionedSettings

project {
    id = "TeamCityHomework"
    name = "TeamCity Homework"
    features {
        versionedSettings {
            enabled = true
            format = VersionedSettings.Format.KOTLIN
            path = ".teamcity"
            vcsRootId = "TeamCityHomework_HttpsGithubComChehlov1MExampleTeamcityGit"
        }
    }
    buildType(TeamCityHomework_deploy_to_master)
}
