package br.com.unknowcabbes.recodoch.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ClienteComplementoDAO extends SQLiteOpenHelper {
    public ClienteComplementoDAO(Context context) {
        super(context, "RecodochDB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE ClienteComplemento (id INTEGER PRIMARY KEY, clienteId INTEGER NOT NULL, tipoDocumentoId INTEGER NOT NULL," +
                " FOREIGN KEY(clienteId) REFERENCES Cliente(id), FOREIGN KEY(tipoDocumentoId) REFERENCES tipoDocumento(id));";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        String sql = "DROP TABLE IF EXISTS ClienteComplemento";
        db.execSQL(sql);
        onCreate(db);
    }
}
