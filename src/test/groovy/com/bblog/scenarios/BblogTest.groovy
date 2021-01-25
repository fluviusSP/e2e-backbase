package com.bblog.scenarios

import com.bblog.controllers.EditorActionController
import geb.junit4.GebReportingTest
import org.junit.Test

class BblogTest extends GebReportingTest implements EditorActionController {

    @Test
    void should_add_article() {
        "log in to bblog"()
        "add article"()
    }
}
