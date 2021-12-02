@Library('definex-shared-library') _
import com.definex.*

pipeline {
    agent any
    stages {
        stage("init") {
            steps {
                script {
                    // Initialize subscriptions

                    // if ConfigurationValidation is caught --> log warning message
                    Notification.initConfigurationValidation(this)
                    // if other Exceptions are caught --> log error message and fail pipeline
                    Notification.initOtherExceptions(this)
                }
            }
        }
        stage("build") {
            steps {
                script {
                    log.info("Stage -> build");
                    action();
                }
            }
        }
        stage("test") {
            steps {
                script {
                    log.info("Stage -> test");
                }
            }
        }
        stage("deploy") {
            steps {
                script {
                    log.info("Stage -> deploy");
                }
            }
        }
    }   
}