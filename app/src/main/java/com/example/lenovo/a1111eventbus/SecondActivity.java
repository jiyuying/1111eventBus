package com.example.lenovo.a1111eventbus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import de.greenrobot.event.EventBus;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button sec = (Button) findViewById(R.id.second);
        sec.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        EventBus.getDefault().post(new FirstEvent("123"));
    }
});

    }
}
