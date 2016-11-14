package com.example.lenovo.a1111eventbus;

import android.app.usage.UsageEvents;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import de.greenrobot.event.EventBus;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.btn_jump)
    Button btnJump;
    @InjectView(R.id.btn_tv)
    TextView btnTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        //在哪接收就在哪注册
        EventBus.getDefault().register(this);

    }
    public void onEventMainThread(FirstEvent first){
         btnTv.setText(first.getMessage());
    }


    @OnClick({R.id.btn_jump})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_jump:
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
                break;

        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
}
