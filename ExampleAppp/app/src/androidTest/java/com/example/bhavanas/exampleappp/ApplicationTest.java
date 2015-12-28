package com.example.bhavanas.exampleappp;

import android.app.Application;
import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.test.ApplicationTestCase;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bhavanas.exampleappp.ExampleActivity;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ActivityUnitTestCase<ExampleActivity> {

    ExampleActivity mainActivity;
    TextView tvHello,tvhello1;

    public ApplicationTest() {
        super(ExampleActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        startActivity(new Intent(getInstrumentation().getTargetContext(), ExampleActivity.class), null, null);

        // Getting a reference to the MainActivity of the target application
        mainActivity = (ExampleActivity) getActivity();

        // Getting a reference to the TextView of the MainActivity of the target application
//        tvHello = (TextView) mainActivity.findViewById(in.wptrafficanalyzer.helloworld.R.id.hello_world);
        tvHello = (TextView) mainActivity.findViewById(R.id.txt_vw);
        tvhello1=(TextView) mainActivity.findViewById(R.id.text_vieww);



    }

    @SmallTest
    public void testHello() {
        String actual = tvHello.getText().toString();
        String actualnew=tvhello1.getText().toString();
        String expected = "hell";
        String expectednew="Good";
        assertEquals(actual, expected);
        assertEquals(actualnew,expectednew);
       assertTrue(actual.equals(expected));
    }


    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}