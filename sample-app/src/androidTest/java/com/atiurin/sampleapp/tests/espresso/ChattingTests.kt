package com.atiurin.sampleapp.tests.espresso

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.data.ChatsData
import com.atiurin.sampleapp.steps.ChatPageStep
import com.atiurin.sampleapp.steps.FriendsPageStep
import com.atiurin.sampleapp.steps.MenuPageSteps
import com.atiurin.sampleapp.steps.UIElementsPageSteps
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ChattingTests {

    @get:Rule
    val activityTestRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun scrollToEmmetAndText() {
        with(FriendsPageStep) {
            findFriend(ChatsData.nameOfFirstChatter)
        }
        with(ChatPageStep) {
            checkChatPageName(ChatsData.nameOfFirstChatter)
            enterMessage(ChatsData.message)
            validateMessageText(ChatsData.message)
        }
    }

    @Test
    fun scrollToFriend17AndText() {
        with(FriendsPageStep) {
            findFriend(ChatsData.nameOfSecondChatter)
        }
        with(ChatPageStep) {
            checkChatPageName(ChatsData.nameOfSecondChatter)
            enterMessage(ChatsData.secondMessage)
            validateMessageText(ChatsData.secondMessage)
        }
    }

    @Test
    fun dashboardUIElementsVisibilityTest() {
        with(FriendsPageStep) {
            checkDashboardIsLoaded()
        }
        with(MenuPageSteps) {
            clickMenuButton()
            clickCustomItem(ChatsData.textForUIElements)
        }
        with(UIElementsPageSteps) {
            validatePageIsOpen()
            unCheckEnableButton()
            unCheckClickableButton()
            validateEnableButtonIsUnchecked()
            validateClickableButtonIsUnchecked()
            checkInvisibleRadioButton()
            validateButtonIsInvisible()
        }
    }
}
