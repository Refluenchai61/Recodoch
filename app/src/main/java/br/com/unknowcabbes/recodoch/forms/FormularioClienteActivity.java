package br.com.unknowcabbes.recodoch.forms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import br.com.unknowcabbes.recodoch.R;
import br.com.unknowcabbes.recodoch.dao.ClienteDAO;
import br.com.unknowcabbes.recodoch.helpers.FormularioClienteHelper;
import br.com.unknowcabbes.recodoch.model.Cliente;

public class FormularioClienteActivity extends AppCompatActivity {

    private FormularioClienteHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_cliente);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_form_cliente);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.form_cliente);

        helper = new FormularioClienteHelper(this);

        Cliente cliente = new Cliente();
        Button salvar = (Button) findViewById(R.id.form_salvar_cliente);
        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cliente cliente = helper.pegaCliente();
                ClienteDAO dao = new ClienteDAO(FormularioClienteActivity.this);
                dao.insere(cliente);
                dao.close();
                Toast.makeText(FormularioClienteActivity.this, "Cliente |" + cliente.getNomeFantasia() + "| foi cadastrado corretamente!", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
