def buildApp() {
    echo 'building the application...'
} 

def testApp() {
    echo 'testing the application...'
} 

def deployApp() {
    echo 'deplying the application...'
    echo "deploying version ${params.VERSION}"
}

def echoTest(String echoString){
    echo "echoTest fundtion...  ${echoString}"
}

return this