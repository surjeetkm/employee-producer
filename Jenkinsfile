node{
    
    stage("Git Clone"){
        git credentialsId: 'GITHUB_CREDENTIALS', url: 'https://github.com/surjeetkm/producer.git'
    }
    stage("Maven Clean Build"){
        def mavenHome = tool name: "Maven", type: "maven"
        
        def mavenCmd= "${mavenHome}/bin/mvn "
        sh "${mavenCmd} clean package"
    }
    
}
