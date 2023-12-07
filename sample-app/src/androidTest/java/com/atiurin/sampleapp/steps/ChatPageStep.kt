package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.pages.ChatPage

object ChatPageStep {
    fun checkChatPageName(name: String) {
        with(ChatPage) {
            assertToolbarTitle(name)
        }
    }
    fun enterMessage(message: String) {
        with(ChatPage) {
            sendMessage(message)
        }
    }
    fun validateMessageText(message: String) {
        with(ChatPage) {
            assertMessageDisplayed(message)
        }
    }
}
