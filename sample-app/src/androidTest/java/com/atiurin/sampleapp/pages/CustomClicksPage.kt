package com.atiurin.sampleapp.pages
import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher
object CustomClicksPage {
    val radioBtn1: Matcher<View> by lazy { withId(R.id.rB_top_left) }
    val radioBtn2: Matcher<View> by lazy { withId(R.id.rB_top_right) }
    val radioBtn3: Matcher<View> by lazy { withId(R.id.rB_bottom_right) }
    val radioBtn4: Matcher<View> by lazy { withId(R.id.rB_bottom_left) }
}
