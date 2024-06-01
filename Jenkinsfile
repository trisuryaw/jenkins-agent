pipeline {
    agent any
    stages {
        stage("Build"){
            agent {
                label 'jenkins-docker'
            }
            steps{
                sh "docker build -t spring-app ."
            }
        }
    }
}