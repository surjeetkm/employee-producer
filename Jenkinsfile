node{
    
    stage("Git Clone"){
        git credentialsId: 'GITHUB_CREDENTIALS', url: 'https://github.com/surjeetkm/producer.git'
    }
    stage("Maven Clean Build"){
        echo "Maven build started......"
        def mavenHome = tool name: "Maven", type: "maven"
        
        def mavenCmd= "${mavenHome}/bin/mvn "
        sh "${mavenCmd} clean package"
        echo "Maven build ended success"
    }
    stage('Docker build Image'){
    	sh "docker build -t dockerrock123/employee-producer-kubernate ."
    }
    
}
