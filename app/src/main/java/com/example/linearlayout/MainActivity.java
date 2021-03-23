package com.example.linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;

    EditText edemail, edpassword;

    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin=findViewById(R.id.btnSignin);

        edemail=findViewById(R.id.edEmail);

        edpassword=findViewById(R.id.edPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                nama = edemail.getText().toString();
                password = edpassword.getText().toString();

                String email = "admin@mail.com";
                String password = "123";

                if(edemail.getText().toString().equals("admin@mail.com") && edpassword.getText().toString().equals("123")) {
                    Toast t = Toast.makeText(getApplicationContext(),
                            "LOGIN SUKSES || email : " + nama + " password : " + password + "", Toast.LENGTH_LONG);
                    t.show();
                }else {
                    if (nama.equals(email) && password.equals(password)) {
                        Toast t = Toast.makeText(getApplicationContext(),
                                 "LOGIN SUKSES"
                                 Toast.LENGTH_LONG
                        t.show();

                        Bundle b = new Bundle();

                        b.putString("a", nama.trim());
                        b.putString("b", password());

                        intent i = new Intent(getApplicationContext(),
                                ActivityHasil.class);
                        ((Intent) i).putExtras(b);
                        startActivity(i);
                }
                else{
                    Toast.makeText((getApplicationContext()),
                            "LOGIN GAGAL",
                            Toast.LENGTH_SHORT).show();
                    t.show();
                }
            }
        });
    }
}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        if (item.getItemId() == R.id.mnDaftar)
    }
        return super.onCreateOptionsMenu(menu);
    }
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}