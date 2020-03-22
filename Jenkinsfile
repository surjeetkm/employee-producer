pipeline {  
	environment {
    registry = "dockerrock123/skmrepo"
    registryCredential = 'dockerHub'
  }  agent any  stages {
    stage('Building image') {
      steps{
        script {
          docker.build registry + ":$BUILD_NUMBER"
        }
      }
    }
  }
}