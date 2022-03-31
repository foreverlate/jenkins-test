pipeline {
    agent any
    
    stages {

        stage("init") {
            steps {
  
                echo 'building the app'
            }
        }
        
         stage("build") {
            steps {
                sh './run.sh'
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
