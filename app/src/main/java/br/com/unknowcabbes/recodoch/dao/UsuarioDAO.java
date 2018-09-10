package br.com.unknowcabbes.recodoch.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class UsuarioDAO extends SQLiteOpenHelper{
    public UsuarioDAO(Context context) {
        super(context, "recodochDB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE Usuario (id INTEGER PRIMARY KEY, nome TEXT NOT NULL, login TEXT NOT NULL, senha TEXT NOT NULL, tipoUsuarioId INTEGER NOT NULL, ativo BOOLEAN, clienteId INTEGER NOT NULL," +
                "FOREIGN KEY(tipoDocumentoId) REFERENCES tipoDocumento(id), FOREIGN KEY(clienteId) REFERENCES Cliente(id));";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS Usuario";
        db.execSQL(sql);
        onCreate(db);

    }
}
