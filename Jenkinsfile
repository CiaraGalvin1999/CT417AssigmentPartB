pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('clean') {
            steps {
                bat './gradlew clean'
            }
        }
        stage('build') {
            steps {
                bat './gradlew build'
            }
        }
        stage('deploy'){
            steps {
                bat './gradlew war'
                bat 'echo hello'
            }
        }
    }
    post {
        always {
            archiveArtifacts artifacts: 'build/libs/*.war', fingerprint: true
        }
    }
}