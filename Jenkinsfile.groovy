pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'echo "hello world 222" > output.txt'
            }
        }
        stage('Archive') {
            steps {
                archiveArtifacts 'output.txt'
            }
        }
    }
}
