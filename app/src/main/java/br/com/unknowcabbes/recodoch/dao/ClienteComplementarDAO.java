package br.com.unknowcabbes.recodoch.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import br.com.unknowcabbes.recodoch.model.Cliente;
import br.com.unknowcabbes.recodoch.model.ClienteComplementar;

public class ClienteComplementarDAO extends SQLiteOpenHelper {
    public ClienteComplementarDAO(Context context) {
        super(context, "RecodochDB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE ClienteComplementar (id INTEGER PRIMARY KEY, clienteId INTEGER NOT NULL, tipoDocumentoId INTEGER NOT NULL," +
                " FOREIGN KEY(clienteId) REFERENCES Cliente(id), FOREIGN KEY(tipoDocumentoId) REFERENCES tipoDocumento(id));";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        String sql = "DROP TABLE IF EXISTS ClienteComplementar";
        db.execSQL(sql);
        onCreate(db);
    }

    public void insere(ClienteComplementar ClienteComplementar) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues dados = new ContentValues();
        dados.put("clienteId", ClienteComplementar.getClienteId());
        dados.put("tipoDocumentoId", ClienteComplementar.getTipoDocumentoId());
        db.insert("ClienteComplementar", null, dados);
    }
}
