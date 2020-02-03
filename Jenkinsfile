pipeline{
    agent any

    stages {


            stage('test'){
                steps{
                    echo 'Running tests............'
                    withMaven(maven: 'maven_3_5_0'){
                        sh 'mvn test'
                    }
                }
            }

            stage('deploy'){
                steps{
                    echo 'Deployment in progress............'
                    withMaven(maven: 'maven_3_5_0'){
                        sh 'mvn deploy'
                    }
                }
            }
        }
    }

