pipeline {
    agent any

    stages {
        stage('IntegralistTest') {
            steps {
                bat 'mvn -Dtest=IntegralistTest test'
            }
        }
        stage('CalculMedieTest') {
            steps {
                bat 'mvn -Dtest=CalculMedieTest test'
            }
        }

    }
}