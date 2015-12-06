package com.dream.foundation;

import android.app.Application;

import com.parse.ParseInstallation;

/**
 * Created by Pancham on 06-Dec-15.
 */
public class Parse extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        com.parse.Parse.initialize(this, "Ywysm8kA3v3X8mwwlbaAwPBF2uWJCzb9SmgtDYQ8", "vDyCPRai2pmLIRfqY8Ygjhpjtaj2UJGi0NQ0Lmlu");
        ParseInstallation.getCurrentInstallation().saveInBackground();
    }
}
