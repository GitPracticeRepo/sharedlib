@NonCPS
def call(
    Map config=[
        giturl: 'https://github.com/GitPracticeRepo/multibranchspc.git', 
        gitbranch: 'master', mvngoal: 'package']){
    node {
        stage('scm') {
            git url: config.giturl, branch: config.gitbranch
        }
        stage('build') {
            sh "mvn ${config.mvngoal}"
        }

    }
}