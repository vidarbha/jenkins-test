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
            }
        }
        stage("Production Deploy") {
      //restore previously saved files
      unstash 'build'
      //do deploy stuff
      sh("deploy shell command might go here")
    }
  }
     catch(Error|Exception e) {
        mail(to: 'EMAIL@example.com',
        subject: "${currentBuild.fullDisplayName} failed!"
        body: "URL: ${env.BUILD_URL}, Error: ${e}")
        //Finish failing the build after telling someone about it
        throw e
        }
    }
}
