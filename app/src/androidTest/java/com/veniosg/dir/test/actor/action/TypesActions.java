package com.veniosg.dir.test.actor.action;

import android.widget.EditText;

import com.veniosg.dir.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.equalTo;

public class TypesActions {
    public void pickFileName(String fileName) {
        onView(allOf(
                withParent(withId(R.id.pickBar)),
                withClassName(equalTo(EditText.class.getName())),
                isDisplayed()
        )).perform(typeText(fileName));
    }

    public void inputFileName(String fileName) {
        onView(allOf(
                withId(R.id.foldername),
                isDisplayed()
        )).perform(typeText(fileName));
    }
}