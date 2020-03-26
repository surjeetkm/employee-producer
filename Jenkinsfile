node{
    
    stage("Git Clone"){
        git credentialsId: 'GITHUB_CREDENTIALS', url: 'https://github.com/surjeetkm/producer.git'
    }
    stage("Maven Clean Build"){
       sh 'mvn clean package'
    }
    
}
