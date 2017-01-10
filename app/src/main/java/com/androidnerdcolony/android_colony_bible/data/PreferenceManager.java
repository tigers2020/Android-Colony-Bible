package com.androidnerdcolony.android_colony_bible.data;

import android.content.Context;
import android.content.SharedPreferences;

import com.androidnerdcolony.android_colony_bible.R;

/**
 * Created by tiger on 1/9/2017.
 */

public class PreferenceManager {

    private String bibleVersion;
    private String bookMark;

    void setBibleVersion(Context context, String bibleVersion){
        SharedPreferences preference = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = preference.edit();

        editor.putString(context.getString(R.string.preference_bible_version), bibleVersion);
        editor.apply();

    }

    void setDefaultPreferences(Context context){
        SharedPreferences preferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = preferences.edit();

        editor.putString(context.getString(R.string.preference_bible_version), context.getString(R.string.default_bible_version));
        editor.apply();
    }
}
