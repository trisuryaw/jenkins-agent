pipeline {
    agent any
    stages {
        stage("Build"){
            agent {
                label 'jenkins-docker'
            }
            steps{
                sh "docker --version"
            }
        }
    }
}