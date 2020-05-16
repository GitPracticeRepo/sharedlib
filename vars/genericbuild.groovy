def call(Map config=[:]){
    node {
        stage('scm') {
            git 'https://github.com/GitPracticeRepo/multibranchspc.git'
        }
        stage('build') {
            sh 'mvn clean package'
        }
    }
}