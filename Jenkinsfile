node{
    
    stage("Git Clone"){
        git credentialsId: 'GITHUB_CREDENTIALS', url: 'https://github.com/surjeetkm/producer.git'
    }
    stage("Maven Clean Build"){
        def MVN_COMMAND = "mvn clean package"
        sh "${MVN_COMMAND}"
    }
    stage('Docker build Image'){
    	sh "docker build -t dockerrock123/employee-producer-kubernate ."
    }
    
}
