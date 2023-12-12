package com.atiurin.sampleapp.steps

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.R
import com.atiurin.sampleapp.helper.tap
import com.atiurin.sampleapp.pages.UIElementPage
import org.hamcrest.Matcher
import org.hamcrest.Matchers

object MenuPageSteps {
    fun clickMenuButton() {
        with(UIElementPage) {
            mainManuBtn.tap(5)
        }
    }

    fun clickCustomItem(itemTxt: String) {
        val customClickBtn: Matcher<View> by lazy {
            Matchers.allOf(
                withId(R.id.design_menu_item_text),
                withText(itemTxt)
            )
        }

        customClickBtn.tap()
    }
}
