pipeline {
    agent any
    triggers {
                pollSCM("")
            }
    stages {
        stage('Build') {
            steps {
                deleteDir()
                checkout scm
                echo "${env.BUILD_NUMBER} This is to test"
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
