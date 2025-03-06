pipeline {

    stages {
        stage('Build') {
          agent {
              docker {
                  image 'maven:3.9.9-eclipse-temurin-23'
                  args '-u root'
                    }
            }
            steps {
                echo 'Start Clean package'
                echo 'mvn -v'
                sh 'mvn clean package spring-boot:repackage -DskipTests=true'
                echo 'End Clean package'
            }
        }
        stage('Test') {
          agent {
            docker {
                image 'maven:3.9.9-eclipse-temurin-23'
                args '-u root'
            }
          }
            steps {
                echo 'Start Test'
                sh 'mvn test'
                echo 'End Test'
            }
        }
    }
}
