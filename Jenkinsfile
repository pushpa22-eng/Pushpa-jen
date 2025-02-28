pipeline {
    agent { docker { image 'maven:3.9.9-eclipse-temurin-21-alpine' } }  or any
	
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
				echo 'build'
            }
        }
		stage("test"){
		steps{
		echo 'test'
		}
		
		}
		stage("deploy"){
		steps{
		echo 'deploy'
		}
		
		}
    }
}
