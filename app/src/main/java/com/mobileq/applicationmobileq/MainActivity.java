package com.mobileq.applicationmobileq;

import android.content.Context;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;


public class MainActivity extends MyAppFonts {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(base));
    }

}



