package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.pages.FriendsListPage

object FriendsPageStep {
    fun checkDashboardIsLoaded() {
        with(FriendsListPage) {
            assertPageDisplayed()
        }
    }

    fun openChat(chatter: String) {
        with(FriendsListPage) {
            openChat(chatter)
        }
    }
}
