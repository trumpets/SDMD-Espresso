package gr.academic.city.sdmd.espresso;


import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.filters.LargeTest;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.is;


/**
 * Created by trumpets on 4/14/16.
 */
@RunWith(AndroidJUnit4ClassRunner.class)
@LargeTest
public class GreetingActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void greetPerson() {
        String name = "Test Name";
        String expectedGreeting = "Hello Test Name!";

        onView(withId(R.id.txt_name)).perform(typeText(name), closeSoftKeyboard());
        onView(withId(R.id.btn_say_hello)).perform(click());

        onView(withId(R.id.tv_greeting)).check(matches(is(withText(expectedGreeting))));
    }
}
