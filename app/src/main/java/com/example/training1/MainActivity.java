package com.example.training1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button saveBtn;
    private Button kembaliBtn;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        saveBtn = findViewById(R.id.btn_save);
        saveBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                textView = findViewById(R.id.text);
                textView.setText("Saved");
            }
        });

        kembaliBtn = findViewById(R.id.btn_back);
        kembaliBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                setContentView(R.layout.user);
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
    }

}
