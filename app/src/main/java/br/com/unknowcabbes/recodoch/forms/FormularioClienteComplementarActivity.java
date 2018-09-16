package br.com.unknowcabbes.recodoch.forms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import br.com.unknowcabbes.recodoch.R;
import br.com.unknowcabbes.recodoch.dao.ClienteComplementarDAO;
import br.com.unknowcabbes.recodoch.helpers.FormularioClienteComplementarHelper;
import br.com.unknowcabbes.recodoch.model.Cliente;
import br.com.unknowcabbes.recodoch.model.ClienteComplementar;

public class FormularioClienteComplementarActivity extends AppCompatActivity {

    private FormularioClienteComplementarHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_cliente_complementar);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_form_cliente_complementar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.form_cliente_complementar);

        helper = new FormularioClienteComplementarHelper(this);

        Cliente cliente = new Cliente();
        Button salvar = (Button) findViewById(R.id.form_salvar_cliente_complementar);
        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClienteComplementar cliente = helper.pegaClienteComplemento();
                ClienteComplementarDAO dao = new ClienteComplementarDAO(FormularioClienteComplementarActivity.this);
                dao.insere(cliente);
                dao.close();
                Toast.makeText(FormularioClienteComplementarActivity.this, "Cliente Complementar cadastrado com sucesso!", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }

}
