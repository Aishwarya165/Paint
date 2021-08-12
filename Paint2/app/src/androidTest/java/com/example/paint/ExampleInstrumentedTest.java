package com.example.paint;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {

        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.paint", appContext.getPackageName());
    }
}
