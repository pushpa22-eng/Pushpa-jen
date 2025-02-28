pipeline {
    agent  any
	
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
				echo 'build'
            }
        }
		stage('test'){
		steps{
		echo 'test'
		}
		
		}
		stage('deploy'){
		steps{
		echo 'deploy'
		}
		
		}
    }
}
