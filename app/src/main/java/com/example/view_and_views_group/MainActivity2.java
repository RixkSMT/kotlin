package com.example.view_and_views_group;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_onclick_layout2);
        textView = findViewById(R.id.myTextView1);

//        textView.setOnClickListener(view -> {
//            textView.setText("Code wall");
//
//        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Code wall");

            }
        });
    }
    public void btnClick(View view){
        textView.setText("ok");
        textView.setTextSize(20.0f);
        button= findViewById(R.id.button27);
        button.setText("alredy clicked");
        Toast.makeText(this,"This button is clicked",Toast.LENGTH_SHORT).show();
    }
}