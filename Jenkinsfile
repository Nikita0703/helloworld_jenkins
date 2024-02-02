pipeline {
   agent any
   stages {
      stage ('Clone sources') {
         steps {
            echo 'Cloning ...'
            git url: 'https://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@github.com/Nikita0703/helloworld_jenkins.git'
         }
      }

       stage('Build') {
           steps {
              sh 'mvn clean install'
           }
       }
       stage('Deploy') {
           steps {
              sh 'java -jar target/helloworld_jenkins-0.0.1-SNAPSHOT.jar &'
           }
       }
   }
}
