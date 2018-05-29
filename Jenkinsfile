pipeline {
    agent any

    environment {
        NameSpace='simonhe'
        WebServer='172.31.12.139'
        port='8060'
    }

    stages {
        stage('Checkout') {
            steps {
                step([$class: 'WsCleanup'])
                git  poll: true,  url: 'https://github.com/siheq/spring-boot-basic.git', branch: 'master'
            }
        }
        stage('Sonar') {
            steps {
                sh './gradlew sonarqube'
            }
        }

        stage('test') {
            steps {
                sh './gradlew test'
            }
        }

        stage('Build') {
            steps {
                sh './gradlew build'
            }
        }

        stage('Deploy') {
            steps {
                withCredentials([sshUserPrivateKey(credentialsId: "training_pem", keyFileVariable: 'keyfile')]) {
                    sh './deploy.sh'
                }
            }
        }
    }
}