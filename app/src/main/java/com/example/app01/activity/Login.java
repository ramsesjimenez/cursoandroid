package com.example.app01.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.app01.MainActivity;
import com.example.app01.R;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        Button buttonok = findViewById(R.id.buttonok);
        EditText txtUsuario = findViewById(R.id.txtUsuario);llll
        EditText txtPass = findViewById(R.id.txtPass);


        buttonok.setOnClickListener(v-> {

            if(txtUsuario.getText().toString().isEmpty()) {
                Toast.makeText(this, "Debe introducir un usuario", Toast.LENGTH_SHORT).show();
            } else if(txtPass.getText().toString().isEmpty()) {
                Toast.makeText(this, "Debe introducir un password", Toast.LENGTH_SHORT).show();

            } else {
                Intent VentanaPrincipal = new Intent(this, Alumno.class);

                startActivity(VentanaPrincipal);
            }



        });







        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}