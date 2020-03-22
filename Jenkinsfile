node{
	def app
	stage('Clone repository'){
		checkout scm
	}
	stage('Build Image'){
		app=docker.build("dockerrock123/producerapp")
	}
	stage('Test Image'){
		app.inside{
			sh 'echo "Test Passed"'
		}
	}
	stage('Push Image'){
		docker.withRegistry('https://registry.hub.docker.com','dockerHub'){
			app.push("${env.BUILD_NUMBER}")
			app.push("latest")
		}
	}

}