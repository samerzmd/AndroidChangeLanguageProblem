package project.buildable.com.myapplication;


import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import android.text.TextUtils;

import java.util.Locale;

public class App extends Application {

    private static App INSTANCE;
    public static final String LANGUAGE = "language";

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
    }

    public static App getInstance() {
        return INSTANCE;
    }



    public static void updateLanguage(Context ctx, String lang) {
        Configuration cfg = new Configuration();
        if (!TextUtils.isEmpty(lang))
            cfg.locale = new Locale(lang);
        else
            cfg.locale = Locale.getDefault();

        Resources resources = ctx.getResources();
        resources.updateConfiguration(cfg, resources.getDisplayMetrics());
        putString(ctx, LANGUAGE, lang);

    }

    public static void putString(Context context, String key, String value) {
        SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(context).edit();
        editor.putString(key, value);
        editor.commit();
    }

    public static String getString(Context context, String key) {
        return PreferenceManager.getDefaultSharedPreferences(context).getString(key,null);
    }

}
