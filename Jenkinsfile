@Library('definex-shared-library') _
import com.definex.*

pipeline {
    agent any
    stages {
        stage("init") {
            steps {
                script {
                    log.info("Stage -> init started.");
                    // Initialize subscriptions

                    // if ConfigurationValidation is caught --> log warning message
                    Notification.initConfigurationValidation(this)
                    // if other Exceptions are caught --> log error message and fail pipeline
                    Notification.initOtherExceptions(this)
                    log.info("Stage -> init ended!");
                }
            }
        }
        stage("build") {
            steps {
                script {
                    log.info("Stage -> build started.");
                    action(false);
                    log.info("Stage -> build ended!");
                }
            }
        }
        stage("test") {
            steps {
                script {
                    log.info("Stage -> test started.");
                    action(true);
                    log.info("Stage -> test ended!");
                }
            }
        }
        stage("deploy") {
            steps {
                script {
                    log.info("Stage -> deploy started.");
                    log.info("Stage -> deploy ended!");
                }
            }
        }
    }   
}