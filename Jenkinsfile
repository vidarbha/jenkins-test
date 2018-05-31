pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'pwd'
                checkout scm
                echo "${BUILD_NUMBER}"
            }
        }
        stage('RUn the gradle task') {
            steps {
                sh 'pwd'
                sh 'id'
                sh 'chmod -R 777 *'
                sh './gradlew hello'
            }
        }
    }
}
