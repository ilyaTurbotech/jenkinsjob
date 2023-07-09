pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'echo "hello world" > output.txt'
            }
        }
        stage('Archive') {
            steps {
                archiveArtifacts 'output.txt'
            }
        }
    }
}