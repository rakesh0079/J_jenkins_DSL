pipeline {
    agent any
    stages {
stage('Init'){
steps{
echo 'First Pipeline Project Build Start  '
}

}
stage('Build'){
steps{
    echo 'Build Sample project'
}
}

stage('Deploy'){
steps{
    echo 'Deploy Project '
}
}


}
  }
