package gr.academic.city.sdmd.espresso;


import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.filters.LargeTest;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.AllOf.allOf;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsInstanceOf.instanceOf;

/**
 * Created by trumpets on 4/14/16.
 */
@RunWith(AndroidJUnit4ClassRunner.class)
@LargeTest
public class AdapterActivityTest {

    @Rule
    public ActivityScenarioRule<AdapterActivity> activityTestRule = new ActivityScenarioRule<>(AdapterActivity.class);

    @Test
    public void clickProperName() {
        String word = "Paladin";

        onData(allOf(is(instanceOf(String.class)),
                is(word))).perform(click());

        onView(withId(R.id.tv_result)).check(matches(is(withText(word))));
    }
}
