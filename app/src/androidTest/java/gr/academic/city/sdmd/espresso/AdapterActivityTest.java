package gr.academic.city.sdmd.espresso;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.AllOf.allOf;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsInstanceOf.instanceOf;

/**
 * Created by trumpets on 4/14/16.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class AdapterActivityTest {

    @Rule
    public ActivityTestRule<AdapterActivity> activityTestRule = new ActivityTestRule<>(AdapterActivity.class);

    @Test
    public void clickProperName() {
        String word = "Paladin";

        onData(allOf(is(instanceOf(String.class)),
                is(word))).perform(click());

        onView(withId(R.id.tv_result)).check(matches(is(withText(word))));
    }
}
