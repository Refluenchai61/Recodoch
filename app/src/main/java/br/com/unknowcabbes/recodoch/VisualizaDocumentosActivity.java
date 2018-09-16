package br.com.unknowcabbes.recodoch;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;

public class VisualizaDocumentosActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualiza_documentos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_visualiza_documentos);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        toolbar.setSubtitle(R.string.visualiza_documentos);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_visualiza_documentos, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
