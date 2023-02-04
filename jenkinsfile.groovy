
  freeStyleJob('CamundaJob') {
    logRotator(-1, 10)
    jdk('Java 8')
    scm {
        github('https://github.com/rakesh0079/s_camunda.git', 'master')
    }
    triggers {
        githubPush()
    }
    steps {
        maven('clean package',"pom.xml")
    }
    publishers {
        archiveArtifacts('**/*.war')
    }
}