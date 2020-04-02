node{
    
    stage("Git Clone"){
   	git credentialsId: 'GITHUB_CREDENTIALS', url: 'https://github.com/surjeetkm/producer.git'
    }
    stage("Maven Clean Build"){
        def mavenHome = tool name: "Maven", type: "maven"
        
        def mavenCmd= "${mavenHome}/bin/mvn"
        sh "${mavenCmd}  clean package"
    }
    stage('Build image') {
 	 app = docker.build("banded-elevator-272716/student-service-latest")
	}
	stage('Push image') {
 	 docker.withRegistry('https://eu.gcr.io', 'gcr:myregistry') {
 	 app.push("${env.BUILD_NUMBER}")
 	 app.push("latest")
  }
}
}
