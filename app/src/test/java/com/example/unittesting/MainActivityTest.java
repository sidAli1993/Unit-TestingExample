package com.example.unittesting;

import static org.junit.Assert.*;

import android.view.LayoutInflater;

import androidx.annotation.LayoutRes;
import androidx.constraintlayout.widget.ConstraintLayout;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    @Test
    public void testhead() {
        assertDimensions((ConstraintLayout.LayoutParams) getInflater().getViewById(R.id.textView).getLayoutParams());
    }

    private ConstraintLayout getInflater() {
        return inflate(R.layout.activity_main);
    }

    private ConstraintLayout inflate(@LayoutRes int constraintlayout) {
        return (ConstraintLayout) LayoutInflater.from(RuntimeEnvironment.systemContext).inflate(constraintlayout, null);
    }

    private void assertDimensions(ConstraintLayout.LayoutParams params) {
        assertEquals(0, params.width);
        assertEquals(ConstraintLayout.LayoutParams.WRAP_CONTENT, params.height);
    }
}