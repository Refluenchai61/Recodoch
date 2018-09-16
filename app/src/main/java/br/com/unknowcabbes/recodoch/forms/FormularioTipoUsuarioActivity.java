package br.com.unknowcabbes.recodoch.forms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import br.com.unknowcabbes.recodoch.R;
import br.com.unknowcabbes.recodoch.dao.TipoUsuarioDAO;
import br.com.unknowcabbes.recodoch.helpers.FormularioTipoDocumentoHelper;
import br.com.unknowcabbes.recodoch.helpers.FormularioTipoUsuarioHelper;
import br.com.unknowcabbes.recodoch.model.TipoUsuario;

public class FormularioTipoUsuarioActivity extends AppCompatActivity {

    private FormularioTipoUsuarioHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_tipo_usuario);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_form_tipo_usuario);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.form_tipo_usuario);

        helper = new FormularioTipoUsuarioHelper(this);

        Button salvar = (Button) findViewById(R.id.form_salvar_tipo_usuario);
        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TipoUsuario tipoUsuario = helper.pegaTipoUsuario();
                TipoUsuarioDAO dao = new TipoUsuarioDAO(FormularioTipoUsuarioActivity.this);
                dao.insere(tipoUsuario);
                dao.close();
                Toast.makeText(FormularioTipoUsuarioActivity.this, "Tipo de usuário |" + tipoUsuario.getNome() + "| foi cadastrado com sucesso!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
