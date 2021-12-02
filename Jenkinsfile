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
                    // if parameter is false then publish non-fail pipeline event --> configuration-validation
                    action(false);
                    log.info("Stage -> build ended!");
                }
            }
        }
        stage("test") {
            steps {
                script {
                    log.info("Stage -> test started.");
                    // if parameter is true then publish fail pipeline event --> other-exceptions
                    // after the action(true) function call, pipeline fails
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