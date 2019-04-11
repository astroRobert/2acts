package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int value1 = 20;
    int value2 = 12;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView num1 = findViewById(R.id.num1);
        num1.setText(""+ value1);


        TextView num2 = findViewById(R.id.num2);
        num2.setText(""+value2);


        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });
    }
        public void openActivity2(){
            Intent intent = new Intent(this, Activity2.class);
            startActivity(intent);
        }



        public void onSubmitClick (View view){

        TextView Answer = findViewById(R.id.Answer);

            EditText Attempt = findViewById(R.id.Attempt);

            int userAnswer = Integer.parseInt(Attempt.getText().toString());

            if (userAnswer == value1+value2){
                Answer.setText("Correct");
            }
            else{
                Answer.setText("Wrong, correct answer is: "+ (value1+value2));
            }
        }
    }

