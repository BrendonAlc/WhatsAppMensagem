package com.example.mensagemwhatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    public TextInputEditText telephone;

    public TextInputEditText message;

    public Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        telephone = findViewById(R.id.InpTelefone);
        message = findViewById(R.id.InpMensagem);
        enviar = findViewById(R.id.btnEnviar);



        enviar.setOnClickListener(view -> {
            String tel1 = telephone.getText().toString();
            String msg1 = message.getText().toString();

            Uri pag = Uri.parse("https://wa.me/"+tel1+"?text="+msg1);

            Intent webIntent = new Intent(Intent.ACTION_VIEW, pag);
            startActivity(webIntent);
        } );


    }
}