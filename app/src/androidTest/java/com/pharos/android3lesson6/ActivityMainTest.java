package com.pharos.android3lesson6;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class ActivityMainTest {
    @Rule
    public ActivityScenarioRule rule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void addClickTest() {
        onView(withId(R.id.et_operator_one)).perform(typeText("1"));
        onView(withId(R.id.et_operator_two)).perform(typeText("2"));
        onView(withId(R.id.btn_add)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("3")));
    }

    @Test
    public void subClickTest() {
        onView(withId(R.id.et_operator_one)).perform(typeText("2"));
        onView(withId(R.id.et_operator_two)).perform(typeText("1"));
        onView(withId(R.id.btn_sub)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("1")));
    }

    @Test
    public void mulClickTest() {
        onView(withId(R.id.et_operator_one)).perform(typeText("3"));
        onView(withId(R.id.et_operator_two)).perform(typeText("6"));
        onView(withId(R.id.btn_mul)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("18")));
    }

    @Test
    public void divClickTest() {
        onView(withId(R.id.et_operator_one)).perform(typeText("6"));
        onView(withId(R.id.et_operator_two)).perform(typeText("3"));
        onView(withId(R.id.btn_div)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("2")));
    }
    @Test
    public void reverseWordsTest() {
        onView(withId(R.id.et_operator_one)).perform(typeText("One Two"));
        onView(withId(R.id.btn_reverse)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("Two One")));
    }


}
