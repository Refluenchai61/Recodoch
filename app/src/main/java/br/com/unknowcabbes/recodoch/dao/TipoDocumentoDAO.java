package br.com.unknowcabbes.recodoch.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import br.com.unknowcabbes.recodoch.model.TipoDocumento;

public class TipoDocumentoDAO extends SQLiteOpenHelper {

    public TipoDocumentoDAO(Context context) { super(context, "recodochDB", null, 1); }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE TipoDocumento(id INTEGER PRIMARY KEY, nome TEXT NOT NULL, descricao TEXT);";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS TipoDocumento";
        db.execSQL(sql);
        onCreate(db);
    }

    public void insere(TipoDocumento tipoDocumento) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues dados = new ContentValues();
        dados.put("nome", tipoDocumento.getNome());
        dados.put("descricao", tipoDocumento.getDescricao());
        db.insert("TipoDocumento", null, dados);
    }
}