pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'pwd'
                checkout scm
            }
        }
        stage('RUn the gradle task') {
            steps {
                sh 'chmod -R 777 *'
                sh './gradlew hello'
            }
        }
    }
}
