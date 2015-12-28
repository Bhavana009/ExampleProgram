package com.example.bhavanas.mynewapptest;


import android.content.Intent;
import android.test.ActivityUnitTestCase;
import android.test.ApplicationTestCase;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.TextView;
public class ApplicationTest extends ActivityUnitTestCase<MainActivity> {

    MainActivity mainActivity;
    TextView txt_view;

    public ApplicationTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();

        startActivity(new Intent(getInstrumentation().getTargetContext(), MainActivity.class), null, null);

        // Getting a reference to the MainActivity of the target application
        mainActivity = (MainActivity) getActivity();

        // Getting a reference to the TextView of the MainActivity of the target application
//        tvHello = (TextView) mainActivity.findViewById(in.wptrafficanalyzer.helloworld.R.id.hello_world);
        txt_view = (TextView) mainActivity.findViewById(R.id.tv_Hello);


    }

	//Testing Methods
    @SmallTest
    public void testHello() {
        String actual = txt_view.getText().toString();
        String expected = "Hello world!";
        assertEquals(actual, expected);
    }


    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}