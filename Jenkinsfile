pipeline {
    agent { label 'aws_jenkins' }
    stages {
        stage('Checkout Source Code') {
            steps {
                checkout scm
                echo "${env.BUILD_NUMBER} The checkout is Successful"
            }
        }
        stage('Build') {
            steps {
                sh 'gradle -q compile'
                  }
        }
        stage('Push to Dev') {
            steps {
                sh 'scp -i /home/ec2-user/vid_jenkins_ec2.pem /home/ec2-user/workspace/Demo/demo/* ec2-user@52.221.188.84:/var/www/html/.'
               echo "Pushed Successfully"
                
            }
        }
        stage('Integration Testing') {
            steps {
                echo "Integration Testing is Successful"
            }
        }
        stage('Approval') {
            steps {
               echo "Approval is required"
                input message: 'Confirmation', ok: 'OK'
            }
        }
    }
 }
