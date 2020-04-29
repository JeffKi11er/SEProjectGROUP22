package com.example.uibeautifulcollection2;

import androidx.test.filters.LargeTest;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class SignUpActivityTest {
    @Rule
    public ActivityRule<SignUpActivity>mSignUpActivityTestRule = new ActivityRule<>(SignUpActivity.class);
    @Test
    public void signUpActivityTest(){
        onView(withId(R.id.tv_login)).perform(click());
    }
}
