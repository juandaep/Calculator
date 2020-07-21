package com.kodingnext.calculator;

import androidx.test.rule.ActivityTestRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    /*@Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.kodingnext.calculator", appContext.getPackageName());
    }*/

    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule
            = new ActivityTestRule<>(MainActivity.class);

    /*@Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.mukminullah.calculator", appContext.getPackageName());
    }*/

    @Test
    public void add(){
        onView(withId(R.id.first_number_et)).perform(typeText("10"));
        onView(withId(R.id.second_number_et)).perform(typeText("10"));
        onView(withId(R.id.plus_btn)).perform(click());
        onView(withId(R.id.result_tv)).check(matches(withText("20.0")));
    }

    @Test
    public void minus() {
        onView(withId(R.id.first_number_et)).perform(typeText("10"));
        onView(withId(R.id.second_number_et)).perform(typeText("10"));
        onView(withId(R.id.min_btn)).perform(click());
        onView(withId(R.id.result_tv)).check(matches(withText("0.0")));
    }

    @Test
    public void multiply(){
        onView(withId(R.id.first_number_et)).perform(typeText("10"));
        onView(withId(R.id.second_number_et)).perform(typeText("10"));
        onView(withId(R.id.multi_btn)).perform(click());
        onView(withId(R.id.result_tv)).check(matches(withText("100.0")));
    }

    @Test
    public void division(){
        onView(withId(R.id.first_number_et)).perform(typeText("10"));
        onView(withId(R.id.second_number_et)).perform(typeText("10"));
        onView(withId(R.id.div_btn)).perform(click());
        onView(withId(R.id.result_tv)).check(matches(withText("1.0")));
    }
}
