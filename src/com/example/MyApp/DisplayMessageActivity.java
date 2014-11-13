package com.example.MyApp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by DongHo on 2014-11-03.
 */
public class DisplayMessageActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActionBar().setDisplayHomeAsUpEnabled(true);

        //Get Message from Intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(BaseActivity.EXTRA_MESSAGE);

        //Create the Text View
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        //Set Text View as the activity layout
        setContentView(textView);
    }

}