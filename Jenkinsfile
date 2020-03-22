node {

    checkout scm

    docker.withRegistry('https://registry.hub.docker.com', 'dockerHub') {

        def customImage = docker.build("dockerrock123/dockerrock123")

        /* Push the container to the custom Registry */
        customImage.push()
    }
}