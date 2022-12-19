pipeline {
    agent any
    stages {
        stage('Checkout codebase') {
            steps {
                cleanWs()
                checkout scm: [$class: 'GitSCM', branches: [[name: '*/main']],
                userRemoteConfigs: [[url: 'https://github.com/andreeeeead/SQMA_Constantin_Andreea.git']]]
            }
        }

        stage('Test'){
            steps{
                set PATH=%PATH%;D:\workspace\apache-maven-3.8.6-bin\apache-maven-3.8.6\bin
                mvn test
            }
        }
    }
}