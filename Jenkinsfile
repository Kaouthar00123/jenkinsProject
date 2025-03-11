pipeline {

    agent none
    triggers { 
        githubPush() 
    }
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
                stash includes: '*', name: 'app'
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
        stage('Deploy'){
            agent any 
            steps{
                unstash 'app'
                sh 'docker build . -t img'
                echo 'End deploy'
                //sh 'docker run -t img -p 8010:8010'
            }
        }
    }
}
