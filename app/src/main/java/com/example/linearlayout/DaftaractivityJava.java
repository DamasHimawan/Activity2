package com.example.linearlayout;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.R;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ListResourceBundle;

public class DaftaractivityJava extends AppCompatActivity {

    EditText edtNama, edtAlamat, edtEmail, edtPassword, edtrepass;

    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(Bundle savedInstanceState);
        setContentView(R.layout.activity_daftar);
fab.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if (edtNama.getText().toString().isEmpty() ||
                edtAlamat.getText().toString().isEmpty() ||
                edtEmail.getText().toString().isEmpty() ||
                edtPassword.getText().toString().isEmpty() ||
                edtrepass.getText().toString().isEmpty())
        {
            Snackbar.make(view, text"Wajib Isi Seluruh Data !!!", Snackbar.LENGTH_LONG).show();

        }
         else
        {
            if (edtPassword.getText().toString().equals(edtrepass.getText().toString()))
            {
                Toast.makeText(getApplicationContext()) text: "Pendaftaran Berhasil...",
                        Toast.LENGTH_LONG(i);
            }
            else
            {

                Snackbar.make(view, text:"Password dan Repassword Harus Sama!!!",
                        Snackbar.LENGTH_LONG.show();

        }
}
         );
