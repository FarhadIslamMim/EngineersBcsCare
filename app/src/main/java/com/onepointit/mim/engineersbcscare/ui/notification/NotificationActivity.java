package com.onepointit.mim.engineersbcscare.ui.notification;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.onepointit.mim.engineersbcscare.App;
import com.onepointit.mim.engineersbcscare.R;

public class NotificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        App.getComponent().inject(this);
    }
}