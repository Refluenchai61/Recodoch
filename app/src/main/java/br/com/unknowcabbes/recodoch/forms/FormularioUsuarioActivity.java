package br.com.unknowcabbes.recodoch.forms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import br.com.unknowcabbes.recodoch.R;
import br.com.unknowcabbes.recodoch.dao.TipoUsuarioDAO;
import br.com.unknowcabbes.recodoch.dao.UsuarioDAO;
import br.com.unknowcabbes.recodoch.helpers.FormularioTipoUsuarioHelper;
import br.com.unknowcabbes.recodoch.helpers.FormularioUsuarioHelper;
import br.com.unknowcabbes.recodoch.model.TipoUsuario;
import br.com.unknowcabbes.recodoch.model.Usuario;

public class FormularioUsuarioActivity extends AppCompatActivity {

    private FormularioUsuarioHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_usuario);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_form_usuario);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.form_usuario);

        helper = new FormularioUsuarioHelper(this);

        Button salvar = (Button) findViewById(R.id.form_salvar_usuario);
        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Usuario usuario = helper.pegaUsuario();
                UsuarioDAO dao = new UsuarioDAO(FormularioUsuarioActivity.this);
                dao.insere(usuario);
                dao.close();
                Toast.makeText(FormularioUsuarioActivity.this, "Tipo de usuário |" + usuario.getNome() + "| foi cadastrado com sucesso!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
