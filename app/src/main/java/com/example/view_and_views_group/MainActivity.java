package com.example.view_and_views_group;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//    private TextView textView;
    Button button;
    ConstraintLayout constraintLayout;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.button_onclick_layout);

        button            =findViewById(R.id.button_onclick);
        constraintLayout  =findViewById(R.id.my_constraint_layout);
        textView          =findViewById(R.id.my_text_view);





//       button.setOnClickListener(new View.OnClickListener() {
//           @Override
//           public void onClick(View view) {
//               constraintLayout.setBackgroundColor(R.color.purple_700);
//               button.setText("change color");
//           }
//       });
        button.setOnClickListener(view ->{
                constraintLayout.setBackgroundColor(R.color.purple_700);
                textView.setTextSize(60);
                textView.setText("what");
        });







    }
}