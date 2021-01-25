package com.bblog.scenarios.pages

import geb.Page

class EditorPage extends Page {
    static url = "/#/editor"
    static content = {
        articleTitle(wait: true) { $("input", placeholder: "Article Title") }
        about(wait: true) { $("input", placeholder: "What's this article about?") }
        body(wait: true) { $("input", placeholder: "What's this article about?") }
        addArticleButon(wait: true) { $("button") }

    }

    static at = {
        waitFor {
            addArticleButon.isDisplayed()
        }
    }

    def fillTitle() {
        articleTitle << "Title"
    }

    def fillAbout() {
        about << "About"
    }

    def fillBody() {
        body << "body"
    }

    def submitArticle() {
        addArticleButon.click()
    }


}
