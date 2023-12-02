package com.example.android.testing.espresso.BasicSample.pages
import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.android.testing.espresso.BasicSample.R
import org.hamcrest.Matcher

object MainPage {
    val TEXT_INPUT_FIELD: Matcher<View> by lazy { withId(R.id.editTextUserInput) }
    val CHANGE_TEXT_BUTTON: Matcher<View> by lazy { withId(R.id.changeTextBt) }
    val DISPLAYED_TEXT: Matcher<View> by lazy { withId(R.id.textToBeChanged) }
    val ACTIVITY_CHANGE_BUTTON: Matcher<View> by lazy { withId(R.id.activityChangeTextBtn) }
}