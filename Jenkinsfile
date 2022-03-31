def gv

pipeline {
    agent any
    
    stages {

        stage("init") {
            steps {
                script {
                        gv = load "script1.groovy"
                    }
                echo 'building the app'
            }
        }
        
         stage("build") {
            steps {
              script {
                        gv.buildApp()
                    }
                echo 'building the app'
            }
        }
        
        stage("test") {
               steps {
                echo 'testing the app'
            }
        }
        stage("deploy") {
               steps {
                echo 'deploying the app'
              }
            
        }
    }   
}
