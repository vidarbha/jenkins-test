pipeline {
    agent { label 'aws_jenkins' }
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
        stage('Build') {
            steps {
                echo "Build is Successful"
                  }
        }
        stage('Push to Dev') {
            steps {
               echo "Pushed Successfully"
            }
        }
        stage('Integration Testing') {
            steps {
                echo "Integration Testing is Successful"
            }
        }
        stage('Deploy to UAT') {
            steps {
                echo "Pushed to UAT Environment"
            }
        }
        stage('Approval') {
            steps {
               echo "Approval is required"
                input message: 'Confirmation', ok: 'OK'
            }
        }
        stage('Pushed to Prod') {
            steps {
            echo "This is been pushed Successful"
            }
        }
    }
 }
