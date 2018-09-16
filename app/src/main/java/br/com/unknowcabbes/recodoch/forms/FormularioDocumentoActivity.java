package br.com.unknowcabbes.recodoch.forms;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import br.com.unknowcabbes.recodoch.R;

public class FormularioDocumentoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_documento);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_form_documento);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(R.string.form_documento);
    }
}
