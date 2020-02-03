pipeline{
    agent any
    tools {
            maven 'maven_3_6_3'
        }

    stages {


            stage('test'){
                steps{
                    echo 'Running tests............'
                    withMaven(maven: 'maven_3_6_3'){
                        sh 'mvn test'
                    }
                }
            }

            stage('deploy'){
                steps{
                    echo 'Deployment in progress............'
                    withMaven(maven: 'maven_3_6_3'){
                        sh 'mvn deploy'
                    }
                }
            }
        }
    }

