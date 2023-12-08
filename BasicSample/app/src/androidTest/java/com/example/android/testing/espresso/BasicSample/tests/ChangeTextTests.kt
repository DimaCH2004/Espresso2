package com.example.android.testing.espresso.BasicSample.tests
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.android.testing.espresso.BasicSample.MainActivity
import com.example.android.testing.espresso.BasicSample.data.Data
import com.example.android.testing.espresso.BasicSample.steps.ActivityChangePageSteps
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import com.example.android.testing.espresso.BasicSample.steps.MainPageSteps

@RunWith(AndroidJUnit4::class)
class ChangeTextTests {

    @get:Rule
    var activityRule = activityScenarioRule<MainActivity>()

    @Test
    fun testChangeText() {
        with(MainPageSteps) {
            inputText(Data.NAME)
                .tapChangeTextBt()
                .checkDisplayedText(Data.NAME)
        }
    }
    @Test
    fun testChangeTextTwice() {
        with(MainPageSteps) {
            inputText(Data.MOVIE_NAME_ONE)
                .tapChangeTextBt()
                .checkDisplayedText(Data.MOVIE_NAME_ONE)
                .clearText()
                .inputText(Data.MOVIE_NAME_TWO)
                .tapTextViewBt()
        }
        with(ActivityChangePageSteps) {
            checkTextViewText(Data.MOVIE_NAME_TWO)
        }
    }
}
