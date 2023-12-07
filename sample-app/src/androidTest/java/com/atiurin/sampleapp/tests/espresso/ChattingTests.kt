package com.atiurin.sampleapp.tests.espresso

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.data.ChatsData
import com.atiurin.sampleapp.steps.ChatPageStep
import com.atiurin.sampleapp.steps.CustomClicksPageSteps
import com.atiurin.sampleapp.steps.FriendsPageStep
import com.atiurin.sampleapp.steps.MenuPageSteps
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ChattingTests {

    @get:Rule
    val activityTestRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun openChatSendMessageCheck() {
        with(FriendsPageStep) {
            checkDashboardIsLoaded()
            openChat(ChatsData.nameOfChatter)
        }
        with(ChatPageStep) {
            checkChatPageName(ChatsData.nameOfChatter)
            enterMessage(ChatsData.message)
            validateMessageText(ChatsData.message)
        }
    }

    @Test
    fun checkCustomButtonClicks() {
        with(FriendsPageStep) {
            checkDashboardIsLoaded()
        }
        with(MenuPageSteps) {
            clickMenuButton()
            clickCustomItem(ChatsData.textForCustomClicks)
        }
        with(CustomClicksPageSteps) {
            validatePageIsOpen()
            tapOnButtons()
            validateButtonTaps()
        }
    }
}
