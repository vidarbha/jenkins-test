pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo "$pwd"
                checkout scm
            }
        }
        stage('Test') {
            steps {
                sh './gradlew hello'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
