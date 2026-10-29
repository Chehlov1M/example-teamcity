version = "2023.11"

vcsRoot(TeamCityHomework_HttpsGithubComChehlov1MExampleTeamcityGitRefsHeadsMaster) {
    name = "TeamCityHomework/VCS Root"
    ref = "refs/heads/master"
    vcsRootExtId = "TeamCityHomework_HttpsGithubComChehlov1MExampleTeamcityGitRefsHeadsMaster"
}

project {
    id = "TeamCityHomework"
    name = "TeamCity Homework"
    buildType(TeamCityHomework_deploy_to_master)
}
