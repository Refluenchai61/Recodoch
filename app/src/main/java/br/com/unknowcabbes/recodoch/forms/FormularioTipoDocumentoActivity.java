package br.com.unknowcabbes.recodoch.forms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import br.com.unknowcabbes.recodoch.R;
import br.com.unknowcabbes.recodoch.dao.TipoDocumentoDAO;
import br.com.unknowcabbes.recodoch.helpers.FormularioTipoDocumentoHelper;
import br.com.unknowcabbes.recodoch.model.TipoDocumento;

public class FormularioTipoDocumentoActivity extends AppCompatActivity {

    private FormularioTipoDocumentoHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_tipo_documento);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_form_tipo_documento);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.form_tipo_documento);

        helper = new FormularioTipoDocumentoHelper(this);

        Button salvar = (Button) findViewById(R.id.form_salvar_tipo_documento);
        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TipoDocumento tipoDocumento = helper.pegaTipoDocumento();
                TipoDocumentoDAO dao = new TipoDocumentoDAO(FormularioTipoDocumentoActivity.this);
                dao.insere(tipoDocumento);
                dao.close();
                Toast.makeText(FormularioTipoDocumentoActivity.this, "Tipo de documento |" + tipoDocumento.getNome() + "| foi cadastrado corretamente!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
