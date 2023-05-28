package com.example.viewbasic;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button1;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView); // add textview
        button1 = findViewById(R.id.button1); // add buttons
        button2 = findViewById(R.id.button2);

        button1.setText("위로 이동");
        button2.setText("아래로 이동");

        BtnListener listener = new BtnListener(); // create listener
        button1.setOnClickListener(listener); // link listener
        button2.setOnClickListener(listener);
    }

    class BtnListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Button pushedBtn = (Button) v;
            textView.setText(pushedBtn.getText() + " 버튼이 눌렸습니다.");
        }
    }
}