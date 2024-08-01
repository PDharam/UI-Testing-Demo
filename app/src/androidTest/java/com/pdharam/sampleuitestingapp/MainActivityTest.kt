package com.pdharam.sampleuitestingapp

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.activityScenarioRule
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @get:Rule
    val activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun testSubmitButton_expectedCorrectValue() {
        onView(withId(R.id.edt_name)).perform(typeText("Hello Pravin"))
        onView(withId(R.id.edt_desc)).perform(
            typeText("You are fantastic Android Developer."),
            closeSoftKeyboard()
        )

        onView(withId(R.id.btn_submit)).perform(click())

        onView(withId(R.id.tv_result)).check(matches(withText("Title : Hello Pravin | Desc : You are fantastic Android Developer.")))
    }
}