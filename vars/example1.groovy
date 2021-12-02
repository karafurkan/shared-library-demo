def call(String name = "Alice") {
    script {
        sh """
            echo Hi ${name}
        """
    }
}


def action(){
    println "deneme action"
}