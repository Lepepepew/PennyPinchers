package com.example.abraham.loginregister;

import android.test.AndroidTestCase;

import com.android.volley.Response;

import org.junit.Test;
import static org.junit.Assert.*;



import static org.junit.Assert.*;

/**
 * Created by Abraham on 4/20/2017.
 */
public class LoginRequestTest {
    @Test
    public void getParams() throws Exception {
        String u = null;
        String p = null;
        Response.Listener<String> l = null;

        LoginRequest j = new LoginRequest(u,p,l);

        assertNull("Enter User name and Pass", j);

    }

}