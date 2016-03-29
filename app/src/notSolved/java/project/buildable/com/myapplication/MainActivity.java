package project.buildable.com.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void ChangeLanguage(View view) {
        String lang = App.getString(MainActivity.this, App.LANGUAGE);

        App.updateLanguage(MainActivity.this, lang.equals("en") ? "ar" : "en");
        this.recreate();
    }

}
