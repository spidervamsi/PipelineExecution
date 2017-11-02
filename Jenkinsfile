pipeline { 
    agent any  
    stages { 
        stage('Build') { 
            steps { 
               echo 'This is a minimal pipeline.'    
                sh 'make' 
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: 
            }
        }
    }
}
