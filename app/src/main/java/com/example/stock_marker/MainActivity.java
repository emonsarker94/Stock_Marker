package com.example.stock_marker;

//package com.example.stockexchange;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText usernameEditText,passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameEditText=findViewById(R.id.n);
        passwordEditText=findViewById(R.id.p);
        loginButton=findViewById(R.id.login);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username= usernameEditText.getText().toString();
                String password=passwordEditText.getText().toString();

                if(username.equals("admin")&& password.equals("1234")){
                    finish();
                    Intent intent= new Intent(MainActivity.this,ListViewDemo.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(getApplicationContext(),"Enter Right Information",Toast.LENGTH_LONG).show();
                }

            }
        });
    }

}