pipeline {
   agent any
   stages{
      stage ('Clone sources) {
         steps {
            echo 'Cloning ...'
            git url: 'https://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@github.com/Nikita0703/helloworld_jenkins.git'
         }
      }

      stage ('Build') {
         steps {
            sh 'mvn clean install'
         }
      }

      stage ('Deploy') {
          steps {
             echo 'Deploying ...'
             sh 'ls'
             dir("target") {
                script{
                    withEnv(['JENKINS_NODE_COOKIE = dontkill']) {
                       echo "&"
                       sh "java -jar helloworld_jenkins-0.0.1-SNAPSHOT.jar &"
                    }
                }
             }
          }
      }
}