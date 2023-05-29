package com.example.viewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.viewbinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        activityMainBinding.button.setText("버튼 1");
        activityMainBinding.button2.setText("버튼 2");

        BtnClickListener listener = new BtnClickListener();
        activityMainBinding.button.setOnClickListener(listener);
        activityMainBinding.button2.setOnClickListener(listener);
    }

    class BtnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Button pushedBtn = (Button) v;
            String name = (String) pushedBtn.getText();

            activityMainBinding.textView.setText(name + " 버튼이 눌렸습니다.");
        }
    }
}