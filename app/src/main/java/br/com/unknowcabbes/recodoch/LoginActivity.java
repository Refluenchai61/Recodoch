package br.com.unknowcabbes.recodoch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button entrar = (Button) findViewById(R.id.Entrar);
        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentVaiPraHome = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(intentVaiPraHome);
            }
        });
    }
}
