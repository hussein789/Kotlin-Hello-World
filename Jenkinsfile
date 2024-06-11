pipeline {
    agent any
    environment {
        ANDROID_HOME = '/Users/hussein.khozym/Library/Android/sdk'
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/hussein789/Kotlin-Hello-World.git'
            }
        }
        stage('Build') {
            steps {
                sh './gradlew assembleDebug'
            }
        }
        stage('Test') {
            steps {
                sh './gradlew test'
            }
        }
    }
}