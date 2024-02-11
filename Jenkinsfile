pipeline {

   agent any

   tools {
      maven 'maven 3.9.6'
   }

   stages {
      stage ('Clone sources'){
         steps {
            echo 'Cloning ...'
            git url: 'https://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@github.com/Nikita0703/helloworld_jenkins.git'
         }
      }

      stage ('Build'){
         steps {
            bat 'mvn clean install'
         }
      }

      stage ('Build docker image'){
         steps{
            script{
                bat 'docker build -t nikita0703/jenkins .'
            }
         }
      }

      stage ('Push image to Hub'){
         steps{
            script{
                withCredentials([string(credentialsId: 'dockerhub-pwd1', variable: 'dockerhubpwd1')]) {
                    bat 'docker login -u nikita0703 -p ${dockerhubpwd}'
                    bat 'docker push nikita0703/jenkins'
                }
            }
         }
      }

      stage ('Deploy'){
         steps {
            echo 'Deploying ...'
            bat 'ls'
            dir("target") {
                withEnv(['JENKINS_NODE_COOKIE=dontkill']) {
                  echo "&"
                  bat "java -jar helloworld_jenkins-0.0.1-SNAPSHOT.jar &"
                }
            }
         }
      }
   }

}
