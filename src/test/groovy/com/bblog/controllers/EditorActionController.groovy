package com.bblog.controllers

import com.bblog.scenarios.pages.ArticlePage
import com.bblog.scenarios.pages.EditorPage
import com.bblog.scenarios.pages.LoginPage
import geb.Browser

trait EditorActionController {
    abstract Browser getBrowser()

    def "log in to bblog"() {
        getBrowser().to(LoginPage) with {
            fillUserName()
            fillUserPassword()
            fillUserEmail()
            logIn()
            logIn()
        }
    }

    def "add article"() {
        getBrowser().to(EditorPage) with {
            fillAbout()
            fillTitle()
            fillBody()
            submitArticle()
        }
    }

    def "assert article added"() {
        getBrowser().at(ArticlePage) with {
            assert isArticleTitleCorrect()
        }
    }
}
