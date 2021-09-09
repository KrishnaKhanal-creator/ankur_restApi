pipeline{
    agent any
    tools {
        /**This is configured with this exact name in 'Manage Jenkins > Global Tool Configuration > Maven'*/
        maven 'maven_3_6_3'
    }

    stages {

        stage('clean'){
            steps{
                echo 'Building............'
                withMaven(maven: 'maven_3_6_3'){
                    sh 'mvn clean'
                }
            }
        }
        stage('build'){
            steps{
                echo 'Building............'
                withMaven(maven: 'maven_3_6_3'){
                    sh 'mvn compile'
                }
            }
        }
        stage('test'){
            steps{
                echo 'Running tests............'
                withMaven(maven: 'maven_3_6_3'){
                    sh 'mvn test'
                    sh 'mvn surefire-report:report'
                }
            }
        }

        stage('run'){
            steps{
                echo 'Installing service..........'

                    // echo """ 'mvn spring-boot:run' | at now + 1 minutes """
                   // sh """ 'nohup mvn spring-boot:run & || true' """
                   //sh """ 'nohup mvn spring-boot:run || true &' """

                withMaven(maven: 'maven_3_6_3'){
                    sh 'mvn install'
                }

            }
        }

            stage('deploy'){
                steps{
                    echo 'Deployment in progress............'
                        //sh """ chmod 777 /Users/ankur/.jenkins/workspace/rest_service_dsl_pipeline/target/RestService-0.0.1-SNAPSHOT.jar """

                        sh """ chmod 777 /Users/ankur/.m2/repository/com/ankur/RestService/0.0.1-SNAPSHOT/RestService-0.0.1-SNAPSHOT.jar """



                        //sh """ 'java -jar RestService-0.0.1-SNAPSHOT.jar' """

                         withMaven(maven: 'maven_3_6_3'){
                           sh """ nohup mvn spring-boot:run || true"""
                           sh """ echo true """
                        }

                }
            }

    }
}
///Users/krishnakhanal/Desktop/File/Tools/Maven/apache-maven-3.8.2

// 'FROM BASH_PROFILE'
// /usr/local/mysql-8.0.23-macos10.15-x86_64/bin
// export JENKINS_HOME=/Users/krishnakhanal/Desktop/File/Tools/Jenkins/JenkinsHome
// export JAVA_HOME=`/usr/libexec/java_home -v 1.8`
// export M2_HOME=/User/krishnakhanal/Desktop/File/Tools/Maven/maven_3.8
// PATH=$PATH:$JAVA_HOME/bin:$M2_HOME/bin
// export PATH

