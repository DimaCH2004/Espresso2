package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.helper.isChecked
import com.atiurin.sampleapp.pages.CustomClicksPage
import com.atiurin.ultron.extensions.isClickable
import com.atiurin.ultron.extensions.isDisplayed
import com.atiurin.ultron.extensions.tap

object CustomClicksPageSteps {
    fun validatePageIsOpen() {
        with(CustomClicksPage) {
            radioBtn1.isDisplayed()
            radioBtn1.isClickable()
        }
    }

    fun tapOnButtons() {
        with(CustomClicksPage) {
            radioBtn1.tap()
            radioBtn2.tap()
            radioBtn3.tap()
            radioBtn4.tap()
        }
    }

    fun validateButtonTaps() {
        with(CustomClicksPage) {
            radioBtn1.isChecked()
            radioBtn2.isChecked()
            radioBtn3.isChecked()
            radioBtn4.isChecked()
        }
    }
}
