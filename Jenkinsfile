pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'pwd'
                checkout scm
                echo "${env.BUILD_NUMBER} This is to test"
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
