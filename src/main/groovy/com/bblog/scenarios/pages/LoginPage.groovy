package com.bblog.scenarios.pages

import geb.Page

class LoginPage extends Page {
    static url = "/#/register"

    static content = {
        username(wait: true) { $("input", placeholder: "Username") }
        password(wait: true) { $("input", placeholder: "Password") }
        email(wait: true) { $("input", placeholder: "Email") }
        signInButton(wait: true) { $("button") }
    }

    static at = {
        waitFor {
            signInButton.displayed
        }
    }

    def fillUserName() {
        email << "StanPotolsky${System.currentTimeMillis()}@testBackBase.pl"
    }

    def fillUserPassword() {
        password << "${System.currentTimeMillis()}"
    }

    def fillUserEmail() {
        username << "StanPotolsky${System.currentTimeMillis()}"
    }

    def logIn() {
        signInButton.click()
    }
}
