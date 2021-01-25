package com.bblog.scenarios.pages

import geb.Page


class ArticlePage extends Page {
    static content = {
        articleTitle(wait: true) { $("h1") }
    }

    static at = {
        waitFor {
            articleTitle.displayed
        }
    }

    def isArticleTitleCorrect(){
        println(articleTitle.text())
        sleep(3000)
        articleTitle.text()=="Title"
    }
}
