package com.example.android.testing.espresso.BasicSample.steps

import androidx.test.espresso.action.ViewActions.replaceText
import com.example.android.testing.espresso.BasicSample.getText
import com.example.android.testing.espresso.BasicSample.pages.MainPage
import com.example.android.testing.espresso.BasicSample.tap
import com.example.android.testing.espresso.BasicSample.typeText
import org.junit.Assert
import androidx.test.espresso.Espresso.onView

object MainPageSteps {
    fun inputText(text: String):MainPageSteps{
        with(MainPage){
            TEXT_INPUT_FIELD.typeText(text)
        }
        return this
    }
    fun clearText(): MainPageSteps {
        with(MainPage) {
            onView(TEXT_INPUT_FIELD).perform(replaceText(""))
        }
        return this
    }
    fun tapChangeTextBt():MainPageSteps{
        with(MainPage) {
            CHANGE_TEXT_BUTTON.tap()
        }
        return this
    }
    fun tapTextViewBt():MainPageSteps{
        with(MainPage) {
            ACTIVITY_CHANGE_BUTTON.tap()
        }
        return this
    }
    fun checkDisplayedText(text: String):MainPageSteps{
        with(MainPage) {
            Assert.assertEquals(DISPLAYED_TEXT.getText(), text)
        }
        return this
    }
}
