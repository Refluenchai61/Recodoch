package br.com.unknowcabbes.recodoch;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import br.com.unknowcabbes.recodoch.forms.FormularioClienteActivity;
import br.com.unknowcabbes.recodoch.forms.FormularioClienteComplementosActivity;
import br.com.unknowcabbes.recodoch.forms.FormularioDocumentoActivity;
import br.com.unknowcabbes.recodoch.forms.FormularioTipoDocumentoActivity;
import br.com.unknowcabbes.recodoch.forms.FormularioTipoUsuarioActivity;
import br.com.unknowcabbes.recodoch.forms.FormularioUsuarioMainActivity;

public class HomeActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
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
        registros.add("Bianca");

        for (Object registro:registros) {
            TextView texto = (TextView) findViewById(R.id.Registro);
            texto.setTextColor(Color.WHITE);
        }

        /*ListView listaRegistros = (ListView) findViewById(R.id.ListaRegistros);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, registros);
        listaRegistros.setAdapter(adapter);
        Button processaDoc = (Button) findViewById(R.id.ProcessaDoc);*/
    }

   @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_home, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.form_cliente:
                Toast.makeText(HomeActivity.this, "OK", Toast.LENGTH_SHORT).show();
                Intent FormClienteGo = new Intent(this, FormularioClienteActivity.class);
                startActivity(FormClienteGo);
            break;
            case R.id.form_cliente_complementar:
                Intent FormClienteCGo = new Intent(this, FormularioClienteComplementosActivity.class);
                startActivity(FormClienteCGo);
            break;
            case R.id.form_usuario:
                Intent FormUsuarioGo = new Intent(HomeActivity.this, FormularioUsuarioMainActivity.class);
                startActivity(FormUsuarioGo);
                break;
            case R.id.form_tipo_usuario:
                Intent FormTipoUGo = new Intent(HomeActivity.this, FormularioTipoUsuarioActivity.class);
                startActivity(FormTipoUGo);
                break;
            case R.id.form_documento:
                Intent FormDocumentoGo = new Intent(HomeActivity.this, FormularioDocumentoActivity.class);
                startActivity(FormDocumentoGo);
            break;
            case R.id.form_tipo_documento:
                Intent FormTipoDGo = new Intent(HomeActivity.this, FormularioTipoDocumentoActivity.class);
                startActivity(FormTipoDGo);
            break;
        }
        return super.onOptionsItemSelected(item);
    }
}
