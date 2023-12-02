package com.example.android.testing.espresso.BasicSample.steps

import com.example.android.testing.espresso.BasicSample.getText
import com.example.android.testing.espresso.BasicSample.pages.ActivityChangePage
import org.junit.Assert

class ActivityChangePageSteps {
    fun checkTextViewText(text: String):ActivityChangePageSteps{
        with(ActivityChangePage) {
            Assert.assertEquals(TEXT_VIEW.getText(), text)
        }
        return this
    }
}