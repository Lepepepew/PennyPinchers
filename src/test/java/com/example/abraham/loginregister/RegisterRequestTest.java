package com.example.abraham.loginregister;

import android.test.AndroidTestCase;

import com.android.volley.Response;


import org.junit.Test;

import static org.junit.Assert.*;


public class RegisterRequestTest extends AndroidTestCase {

    @Test
    public void registerFail_When_Null()
    {
        String n = null;
        String u = null;
        String a = null;
        String p = null;
        Response.Listener<String>  l = null;
        RegisterRequest j = new RegisterRequest(n,u,a,p,l);

        assertNull("Fill all of the fields", j);


    }

}