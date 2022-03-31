def gv

pipeline {
    agent any
    
    stages {

        stage("init") {
            steps {
                script {
                    gv = load ".script.groovy"
                }
                echo 'building the app'
            }
        }
        
         stage("build") {
            steps {
                script {
                    gv.runProc()
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
