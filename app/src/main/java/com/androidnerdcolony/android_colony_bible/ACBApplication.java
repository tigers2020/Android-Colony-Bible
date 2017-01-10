package com.androidnerdcolony.android_colony_bible;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

import timber.log.Timber;

/**
 * Created by tiger on 1/9/2017.
 */

public class ACBApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (LeakCanary.isInAnalyzerProcess(this)){
            return;
        }
        LeakCanary.install(this);

        Timber.plant(new Timber.DebugTree());
    }
}
