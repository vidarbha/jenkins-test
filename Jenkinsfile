pipeline {
    agent any
    triggers {
             pollSCM("")
            }
    stages {
        stage('Checkout Source Code') {
            steps {
                checkout scm
                echo "${env.BUILD_NUMBER} The checkout is Successful"
            }
        }
        stage('Build the File System') {
            steps {
                echo "Build is Successfull"
                sh 'chmod -R 777 *'
                sh './gradlew hello'
            }
        }
        stage('Ingration Testing') {
            steps {
                echo "Unit Testing is Succesfull"
            }
        }
        stage('Deploy to UAT') {
            steps {
                echo "Integration Testing is succesfull"
            }
        }
        stage('Pushed to PROD') {
            steps {
               echo "Successfully pushed to Production"
                input message: 'Confirmation', ok: 'OK'
            }
        }
    }
 }
