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

        String lang = App.getString(MainActivity.this, App.LANGUAGE);

        App.updateLanguage(MainActivity.this, lang.equals("en") ? "ar" : "en");

        setContentView(R.layout.activity_main);
    }

    public void ChangeLanguage(View view) {
        MainActivity.startActivity(this);
    }

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK
                | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        context.startActivity(intent);
    }

}
