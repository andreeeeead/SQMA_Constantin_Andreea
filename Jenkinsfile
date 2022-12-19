pipeline {
    agent any

    stages {
        stage('IntegralistTest') {
            steps {
                sh 'mvn -Dtest=IntegralistTest test'
            }
        }
        stage('CalculMedieTest') {
            steps {
                sh 'mvn -Dtest=CalculMedieTest test'
            }
        }

    }
}