pipeline {
    agent any
    stages {
stage('Ready for Build'){
steps{
echo 'Read for Build'
}

}
stage('Build Application'){
steps{
    sh 'mvn clean package'
}
}

stage('Post Build'){
success {
    echo 'Archive artifact ..'
    archiveArtifacts artifacts: '**/*.war'

}
}


}
  }
