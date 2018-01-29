package com.waioz.waioz;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath(getString(R.string.typeface_regular))
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
