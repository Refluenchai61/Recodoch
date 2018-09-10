package br.com.unknowcabbes.recodoch.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class RegistroDAO extends SQLiteOpenHelper{
    public RegistroDAO(Context context) {
        super(context, "recodochDB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE Registro (id INTEGER PRIMARY KEY, usuarioId INTEGER NOT NULL, dataCriacao DATETIME, clienteId INTEGER NOT NULL," +
                     "FOREIGN KEY(usuarioId) REFERENCES Usuario(id), FOREIGN KEY(clienteId) REFERENCES Cliente(id));)";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS Registro";
        db.execSQL(sql);
        onCreate(db);

    }
}
