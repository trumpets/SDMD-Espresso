package gr.academic.city.sdmd.espresso;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.Is.is;

/**
 * Created by trumpets on 4/14/16.
 */
@RunWith(AndroidJUnit4.class)
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
