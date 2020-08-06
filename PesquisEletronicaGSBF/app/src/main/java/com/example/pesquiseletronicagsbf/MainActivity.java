package com.example.pesquiseletronicagsbf;

import android.content.Intent;
import android.graphics.Color;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner estado = (Spinner)findViewById(R.id.spinner1);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.spinner1, android.R.layout.simple_spinner_dropdown_item);
        estado.setAdapter(adapter);

        ListView listaGovernador = (ListView)findViewById(R.id.list1);
        ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this, R.array.list1, android.R.layout.simple_dropdown_item_1line);
        listaGovernador.setAdapter(adapter2);



        EditText edte1 = (EditText)findViewById(R.id.ed1);
        final String edtext1 = edte1.getText().toString();
        EditText edte2 = (EditText)findViewById(R.id.ed2);
        final int edtext2 = Integer.parseInt(edte2.getText().toString());
        EditText edte3 = (EditText)findViewById(R.id.ed3);
        final String edtext3 = edte1.getText().toString();
        EditText edte4 = (EditText)findViewById(R.id.ed4);
        final String edtext4 = edte1.getText().toString();
        EditText edte5 = (EditText)findViewById(R.id.ed5);
        final String edtext5 = edte1.getText().toString();
        EditText edte6 = (EditText)findViewById(R.id.ed6);
        final String edtext6 = edte1.getText().toString();
        Spinner spinnerc = (Spinner)findViewById(R.id.spinner1);
        RadioButton botaoradio1 = (RadioButton)findViewById(R.id.rb1);
        CheckBox check1 = (CheckBox)findViewById(R.id.check1);
        CheckBox check2 = (CheckBox)findViewById(R.id.check2);
        CheckBox check3 = (CheckBox)findViewById(R.id.check3);

        Button botao = (Button)findViewById(R.id.botao1);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main2);

                Intent intent1 = new Intent(MainActivity.this, Main2Activity.class);
                Bundle bundle1 = new Bundle();

                bundle1.putString("Nome", edtext1);
                bundle1.putInt("Titulo", edtext2);
                bundle1.putString("Zona", edtext3);
                bundle1.putString("Secao", edtext4);
                bundle1.putString("Cidade", edtext5);
                bundle1.putString("Governador", edtext6);

                intent1.putExtras(bundle1);
                startActivity(intent1);

            }
        });
    }
}
