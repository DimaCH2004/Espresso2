package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.helper.swiper
import com.atiurin.sampleapp.pages.FriendsListPage
import com.atiurin.sampleapp.pages.UIElementPage

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
    fun findFriend(name: String) {
        var i = 0
        with(UIElementPage) {
            while (!nameEmmet.isViewDisplayed() && i <= 5) {
                scroll()
                i++
            }
        }
        openChat(name)
    }

    private fun scroll() {
        swiper(250, 100, 20)
    }
}
