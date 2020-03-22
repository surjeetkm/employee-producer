node("docker") {
    docker.withRegistry('https://registry.hub.docker.com', 'dockerHub') {
    
        git url: "https://github.com/surjeetkm/producer.git", credentialsId: 'git-hub'
    
        sh "git rev-parse HEAD > .git/commit-id"
        def commit_id = readFile('.git/commit-id').trim()
        println commit_id
    
        stage "build"
        def app = docker.build "dockerrock123/dockerwebapp"
    
        stage "publish"
        app.push 'master'
        app.push "${commit_id}"
    }
}