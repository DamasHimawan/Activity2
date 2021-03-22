package com.example.linearlayout;

import android.os.Bundle;
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

public class ActivityKedua extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle saveInstanceState )
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activty_kedua);

        txEmail = findViewById(R.id.tvEmail)

        txPassword = findViewById(R.id.tvPassword)

        Bundle bundle = getIntent().getExtras();

        String email = bundle.getString( key:"a");

        String pass = bundle.getString( key: "b")

        txEmail.setText(email);

        txPassword.setText(pass);

}
