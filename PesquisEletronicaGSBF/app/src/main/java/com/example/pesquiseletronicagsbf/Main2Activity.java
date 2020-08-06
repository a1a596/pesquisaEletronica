package com.example.pesquiseletronicagsbf;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent2 = getIntent();
        Bundle bundle2 = intent2.getExtras();
        String nome = bundle2.getString("Nome");
        //Integer titulo = bundle2.getInt("Titulo");
        String zona = bundle2.getString("Zona");
        String secao = bundle2.getString("Secao");
        String cidade = bundle2.getString("Cidade");
        String governador = bundle2.getString("Governador");
        TextView tevi1 = (TextView)findViewById(R.id.tv11);
        TextView tevi2 = (TextView)findViewById(R.id.tv22);
        TextView tevi3 = (TextView)findViewById(R.id.tv33);
        TextView tevi4 = (TextView)findViewById(R.id.tv44);
        TextView tevi5 = (TextView)findViewById(R.id.tv55);
        TextView tevi6 = (TextView)findViewById(R.id.tv66);
        TextView tevi7 = (TextView)findViewById(R.id.tv77);
        TextView tevi8 = (TextView)findViewById(R.id.tv88);
        tevi1.setText("Nome:" + nome);
        tevi1.setTextColor(Color.GREEN);
        tevi2.setText("Zona:" + zona);
        tevi2.setTextColor(Color.GREEN);
        tevi3.setText("Seção:" + secao);
        tevi3.setTextColor(Color.GREEN);
        tevi4.setText("Cidade:" + cidade);
        tevi4.setTextColor(Color.GREEN);
        tevi6.setText("Governador:" + governador);
        tevi6.setTextColor(Color.GREEN);
    }
}
