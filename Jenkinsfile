pipeline{
    agent any
    tools {
            /**This is configured with this exact name in 'Manage Jenkins > Global Tool Configuration > Maven'*/
            maven 'maven_3_6_3'
        }

    stages {

          stage('build'){
                steps{
                    echo 'Building............'
                    withMaven(maven: 'maven_3_6_3'){
                        sh 'mvn clean compile'
                    }
                }
            }
            stage('test'){
                steps{
                    echo 'Running tests............'
                    withMaven(maven: 'maven_3_6_3'){
                        sh 'mvn test'
                    }
                }
            }

/*
            stage('deploy'){
                steps{
                    echo 'Deployment in progress............'
                    withMaven(maven: 'maven_3_6_3'){
                        sh 'mvn deploy'
                    }
                }
            }
*/
        }
    }

