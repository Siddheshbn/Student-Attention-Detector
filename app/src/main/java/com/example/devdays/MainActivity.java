package com.example.devdays;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.LoginFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private TextView TextInfo;
    private Button Login;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText) findViewById(R.id.txt_name);
        Password = (EditText) findViewById(R.id.txt_password);
        TextInfo = (TextView) findViewById(R.id.txt_info);
        Login = (Button) findViewById(R.id.btnlogin);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });
    }

    private void validate(String userName , String userPassword){
        if((userName.equals("admin")) && (userPassword.equals("admin"))){
            Intent mainMenu = new Intent(MainActivity.this , MainMenu.class);
            startActivity(mainMenu);
        }
        else{
            counter--;

            TextInfo.setText("No. of Attempts remaining : " + String.valueOf(counter));

            if(counter == 0){
                Login.setEnabled(false);
            }
        }
    }
}