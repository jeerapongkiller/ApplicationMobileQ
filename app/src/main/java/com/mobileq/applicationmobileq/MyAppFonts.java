package com.mobileq.applicationmobileq;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;


public class MyAppFonts extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
    }
    private void iniFont(){
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/54.TTF")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
