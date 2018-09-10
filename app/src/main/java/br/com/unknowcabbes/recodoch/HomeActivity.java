package br.com.unknowcabbes.recodoch;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        List registros = new ArrayList();
        registros.add("João");
        registros.add("Fernando");
        registros.add("Vinicius");
        registros.add("Marcela");
        registros.add("Luiz");
        registros.add("Camila");
        registros.add("Rodrigo");
        registros.add("Patricia");

        for (Object registro:registros) {
            TextView texto = (TextView) findViewById(R.id.Registro);
            texto.setTextColor(Color.WHITE);
        }

        /*ListView listaRegistros = (ListView) findViewById(R.id.ListaRegistros);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, registros);
        listaRegistros.setAdapter(adapter);
        Button processaDoc = (Button) findViewById(R.id.ProcessaDoc);*/
    }
}
