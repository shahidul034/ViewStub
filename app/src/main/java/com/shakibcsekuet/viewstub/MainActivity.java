package com.shakibcsekuet.viewstub;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;

public class MainActivity extends Activity {
    ViewStub simpleViewStub;
    Button showButton, hideButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleViewStub = ((ViewStub) findViewById(R.id.simpleViewStub)); // get the reference of ViewStub
        simpleViewStub.inflate(); // inflate the layout
        showButton = (Button) findViewById(R.id.showButton); // get the reference of show button
        hideButton = (Button) findViewById(R.id.hideButton); // get the reference of hide buttton
// perform click event on show button
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// set VISIBLE visibility of ViewStub
                simpleViewStub.setVisibility(View.VISIBLE);
            }
        });
// perform click event on hide button
        hideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// set GONE visibility of ViewStub
                simpleViewStub.setVisibility(View.GONE);
            }
        });
    }
}