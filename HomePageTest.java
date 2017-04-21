package com.example.abraham.loginregister;

import org.junit.Test;
import android.widget.Button;

import static org.junit.Assert.*;

/**
 * Created by ManOnPath on 4/20/17.
 */
public class HomePageTest extends HomePage {
    @Test
    //Test bBudget/"Budgets" button, and click it
    public void testButtonClick (){
        Button testButton;
        testButton = (Button) findViewById(R.id.bBudget);
        testButton.performClick();
    }
}