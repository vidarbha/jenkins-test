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
                sh 'scp -i /home/ec2-user/vid_jenkins_ec2.pem /home/ec2-user/workspace/Demo/demo/* ec2-user@172.31.12.184:/var/www/html/.'
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
                sh 'scp -i /home/ec2-user/vid_jenkins_ec2.pem /home/ec2-user/workspace/Demo/demo/* ec2-user@172.31.1.22:/var/www/html/.'
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
                sh 'scp -i /home/ec2-user/vid_jenkins_ec2.pem /home/ec2-user/workspace/Demo/demo/* ec2-user@172.31.0.46:/var/www/html/.'
            echo "This is been pushed Successful"
            }
        }
    }
 }
