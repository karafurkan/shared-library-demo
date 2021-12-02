@Library('definex-shared-library') _
import com.definex.*

def gv
//def action

pipeline {
    agent any
    stages {
        stage("init") {
            steps {
                script {
                    Notification.init(this)
                    log.warning("aaa")
                    gv = load "script.groovy"
                }
            }
        }
        stage("build") {
            steps {
                script {
                    //gv.buildApp()
                    gv.echoTest(AnotherConst.SLACK_MESSAGE_NEW)
                    action()
                    action
                    //error "error message"
                }
            }
        }
        stage("test") {
            when {
                expression {
                    params.executeTests
                }
            }
            steps {
                script {
                    gv.testApp()
                    AnotherConst.deneme()
                }
            }
        }
        stage("deploy") {
            steps {
                script {
                    gv.deployApp()
                }
            }
        }
    }   
}