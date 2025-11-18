#!/usr/bin/env groovy

// https://groovy-lang.org/documentation.html

String WORKSPACE = "/var/your/mum"
String BUILD_ID = "12345"

def hello() {
    return "${WORKSPACE}"
}

hello = hello()
println(WORKSPACE)
