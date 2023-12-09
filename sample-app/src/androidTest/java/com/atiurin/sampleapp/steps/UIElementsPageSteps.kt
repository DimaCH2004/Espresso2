package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.pages.UiElementsPage
import com.atiurin.ultron.extensions.isDisplayed
import com.atiurin.ultron.extensions.isNotChecked
import com.atiurin.ultron.extensions.isNotDisplayed
import com.atiurin.ultron.extensions.tap

object UIElementsPageSteps {
    fun validatePageIsOpen() {
        with(UiElementsPage) {
            checkBoxEnabled.isDisplayed()
            checkBoxClickable.isDisplayed()
        }
    }
    fun unCheckEnableButton() {
        with(UiElementsPage) {
            checkBoxEnabled.tap()
        }
    }
    fun unCheckClickableButton() {
        with(UiElementsPage) {
            checkBoxClickable.tap()
        }
    }
    fun checkInvisibleRadioButton(){
        with(UiElementsPage){
            radioInvisibleButton.tap()
        }
    }
    fun validateEnableButtonIsUnchecked() {
        with(UiElementsPage) {
            checkBoxEnabled.isNotChecked()
        }
    }
    fun validateClickableButtonIsUnchecked() {
        with(UiElementsPage) {
            checkBoxClickable.isNotChecked()
        }
    }
    fun validateButtonIsInvisible(){
        with(UiElementsPage){
            button.isNotDisplayed()
        }
    }
}
