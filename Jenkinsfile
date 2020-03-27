node{
    
    stage("Git Clone"){
   	git credentialsId: 'GITHUB_CREDENTIALS', url: 'https://github.com/surjeetkm/producer.git'
    }
    stage("Maven Clean Build"){
        def mavenHome = tool name: "Maven", type: "maven"
        
        def mavenCmd= "${mavenHome}/bin/mvn"
        sh "${mavenCmd}  clean package"
    }
    stage('Docker build Image'){
    	sh "docker build -t dockerrock123/employee-producer-kubernate ."
    }
    stage('Docker push to docker hub'){
    withCredentials([string(credentialsId: 'DOCKER_HUB_CREDENTIALS', variable: 'DOCKER_HUB_CREDENTIALS')]) {
		sh "docker login -u dockerrock123 -p ${DOCKER_HUB_CREDENTIALS}"
	}
    	sh "docker push dockerrock123/employee-producer-kubernate"
    }
}
