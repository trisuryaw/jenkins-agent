pipeline {
    agent any
    stages {
        stage("Build"){
            agent {
                label 'jenkins-docker'
            }
            steps{
                sh 'echo "hello"'
            }
        }
    }
}
