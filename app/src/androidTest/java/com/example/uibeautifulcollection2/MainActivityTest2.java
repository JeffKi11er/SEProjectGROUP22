package com.example.uibeautifulcollection2;


import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.pressImeActionButton;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest2 {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void mainActivityTest2() {
        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.btn_register), withText("Register"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        3),
                                0),
                        isDisplayed()));
        appCompatButton.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.btn_register), withText("Register"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        3),
                                0),
                        isDisplayed()));
        appCompatButton2.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.edt_full_name),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.lin_center),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText.perform(click());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.edt_full_name),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.lin_center),
                                        0),
                                0),
                        isDisplayed()));
        appCompatEditText2.perform(replaceText("uio"), closeSoftKeyboard());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.edt_user_name),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.lin_center),
                                        1),
                                0),
                        isDisplayed()));
        appCompatEditText3.perform(replaceText("uio"), closeSoftKeyboard());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.edt_email_resist),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.lin_center),
                                        2),
                                0),
                        isDisplayed()));
        appCompatEditText4.perform(replaceText("p@g"), closeSoftKeyboard());

        ViewInteraction appCompatEditText5 = onView(
                allOf(withId(R.id.edt_email_resist), withText("p@g"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.lin_center),
                                        2),
                                0),
                        isDisplayed()));
        appCompatEditText5.perform(click());

        ViewInteraction appCompatEditText6 = onView(
                allOf(withId(R.id.edt_email_resist), withText("p@g"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.lin_center),
                                        2),
                                0),
                        isDisplayed()));
        appCompatEditText6.perform(replaceText("op@g"));

        ViewInteraction appCompatEditText7 = onView(
                allOf(withId(R.id.edt_email_resist), withText("op@g"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.lin_center),
                                        2),
                                0),
                        isDisplayed()));
        appCompatEditText7.perform(closeSoftKeyboard());

        ViewInteraction appCompatEditText8 = onView(
                allOf(withId(R.id.edt_email_resist), withText("op@g"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.lin_center),
                                        2),
                                0),
                        isDisplayed()));
        appCompatEditText8.perform(click());

        ViewInteraction appCompatEditText9 = onView(
                allOf(withId(R.id.edt_email_resist), withText("op@g"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.lin_center),
                                        2),
                                0),
                        isDisplayed()));
        appCompatEditText9.perform(replaceText("oop@g"));

        ViewInteraction appCompatEditText10 = onView(
                allOf(withId(R.id.edt_email_resist), withText("oop@g"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.lin_center),
                                        2),
                                0),
                        isDisplayed()));
        appCompatEditText10.perform(closeSoftKeyboard());

        ViewInteraction appCompatEditText11 = onView(
                allOf(withId(R.id.edt_email_resist), withText("oop@g"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.lin_center),
                                        2),
                                0),
                        isDisplayed()));
        appCompatEditText11.perform(click());

        ViewInteraction appCompatEditText12 = onView(
                allOf(withId(R.id.edt_email_resist), withText("oop@g"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.lin_center),
                                        2),
                                0),
                        isDisplayed()));
        appCompatEditText12.perform(replaceText("oop@gmail.com"));

        ViewInteraction appCompatEditText13 = onView(
                allOf(withId(R.id.edt_email_resist), withText("oop@gmail.com"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.lin_center),
                                        2),
                                0),
                        isDisplayed()));
        appCompatEditText13.perform(closeSoftKeyboard());

        ViewInteraction appCompatEditText14 = onView(
                allOf(withId(R.id.edt_password_resist),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.lin_center),
                                        3),
                                0),
                        isDisplayed()));
        appCompatEditText14.perform(replaceText("111111"), closeSoftKeyboard());

        ViewInteraction appCompatEditText15 = onView(
                allOf(withId(R.id.edt_confirm),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.lin_center),
                                        4),
                                0),
                        isDisplayed()));
        appCompatEditText15.perform(replaceText("111111"), closeSoftKeyboard());

        ViewInteraction appCompatEditText16 = onView(
                allOf(withId(R.id.edt_confirm), withText("111111"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.lin_center),
                                        4),
                                0),
                        isDisplayed()));
        appCompatEditText16.perform(pressImeActionButton());

        ViewInteraction appCompatRadioButton = onView(
                allOf(withId(R.id.rbtn_male), withText("Male"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        0),
                                1),
                        isDisplayed()));
        appCompatRadioButton.perform(click());

        pressBack();

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.btn_register_signup), withText("Register"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        1),
                                0),
                        isDisplayed()));
        appCompatButton3.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ViewInteraction appCompatEditText17 = onView(
                allOf(withId(R.id.edt_name_profile),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        appCompatEditText17.perform(replaceText("Tren"), closeSoftKeyboard());

        ViewInteraction appCompatImageView = onView(
                allOf(withId(R.id.img_cameras),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatImageView.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ViewInteraction appCompatButton4 = onView(
                allOf(withId(R.id.btn_save), withText("Save"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                3),
                        isDisplayed()));
        appCompatButton4.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ViewInteraction appCompatTextView = onView(
                allOf(withId(R.id.tv_btn_next), withText("Next"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        appCompatTextView.perform(click());

        // Added a sleep statement to match the app's execution delay.
        // The recommended way to handle such scenarios is to use Espresso idling resources:
        // https://google.github.io/android-testing-support-library/docs/espresso/idling-resource/index.html
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ViewInteraction bottomNavigationItemView = onView(
                allOf(withId(R.id.bottom_favorite), withContentDescription("Favorite"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.bottom_nav),
                                        0),
                                1),
                        isDisplayed()));
        bottomNavigationItemView.perform(click());

        ViewInteraction appCompatImageView2 = onView(
                allOf(withId(R.id.img_buttons),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.card),
                                        0),
                                0),
                        isDisplayed()));
        appCompatImageView2.perform(click());

        ViewInteraction textView = onView(
                allOf(withText("Huy Quang"),
                        childAtPosition(
                                childAtPosition(
                                        IsInstanceOf.<View>instanceOf(android.widget.RelativeLayout.class),
                                        0),
                                1),
                        isDisplayed()));
        textView.check(matches(withText("Huy Quang")));
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
