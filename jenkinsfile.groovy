
  freeStyleJob('CamundaDSLJOB') {
    logRotator(-1, 10)
    jdk('Java 11')
    scm {
        github('rakesh0079/s_camunda.git', 'master')
    }
    triggers {
        scm('*****')
    }
    steps {
        maven('clean package',"pom.xml")
    }
    publishers {
        archiveArtifacts '**/*.war'
    }
}
