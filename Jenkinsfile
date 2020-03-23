node{
    
    stage("Git Clone"){
        git credentialsId: 'github', url: 'https://github.com/surjeetkm/producer.git'
    }
    stage("Maven Clean Build"){
        def mavenHome = tool name: "Maven", type: "maven"
        
        def mavenCmd= "${mavenHome}/bin/mvn "
        sh "${mavenCmd} clean package"
    }
    stage('Docker build Image'){
    	sh "docker build -t dockerrock123/employee-producer-kubernate ."
    }
    stage('Docker push to docker hub'){
    	withCredentials([string(credentialsId: 'dockerhub-credential', variable: 'dockerhub-credential')]) {
    		sh "docker login -u dockerrock123 -p ${dockerhub-credential}"
	}
    	sh "docker push dockerrock123/employee-producer-kubernate"
    }
}