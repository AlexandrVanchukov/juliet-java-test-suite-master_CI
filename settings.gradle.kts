rootProject.name = "juliet"

plugins {
    `gradle-enterprise`
    id("org.ajoberstar.reckon.settings") version "0.18.0"
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.6.0"
}

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
    }
}

extensions.configure<org.ajoberstar.reckon.gradle.ReckonExtension> {
    setDefaultInferredScope("patch")
    snapshots()
    setScopeCalc(calcScopeFromProp().or(calcScopeFromCommitMessages()))
    setStageCalc(calcStageFromProp())
}

fun myInclude(name: String) {
    include(name)
    project(":$name").projectDir = file("${rootProject.name}-$name")
}

myInclude("support")
myInclude("cwe89") //'SQL Injection
myInclude("cwe90") //Improper Neutralization of Special Elements used in an LDAP Query ('LDAP Injection')
myInclude("cwe113")
myInclude("cwe209") // Information Exposure Through an Error Message
myInclude("cwe259") 
myInclude("cwe319") //Cleartext Transmission of Sensitive Information
myInclude("cwe321") //Use of Hard-coded Cryptographic Key
myInclude("cwe325") // Missing Cryptographic Step
myInclude("cwe327")  //Use of a Broken or Risky Cryptographic Algorithm
myInclude("cwe328")  //Use of Weak Hash
myInclude("cwe338") //Use of Cryptographically Weak Pseudo-Random Number Generator (PRNG)
myInclude("cwe470") //Use of Externally-Controlled Input to Select Classes or Code ('Unsafe Reflection')
myInclude("cwe598") //Use of GET Request Method With Sensitive Query Strings
myInclude("cwe601") //URL Redirection to Untrusted Site ('Open Redirect')
myInclude("cwe613")
myInclude("cwe614") //Sensitive Cookie in HTTPS Session Without 'Secure' Attribute
myInclude("cwe643") //XPath Injection
