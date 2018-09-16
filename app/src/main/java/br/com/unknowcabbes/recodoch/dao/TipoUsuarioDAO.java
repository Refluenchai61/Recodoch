package br.com.unknowcabbes.recodoch.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import br.com.unknowcabbes.recodoch.model.TipoUsuario;

public class TipoUsuarioDAO extends SQLiteOpenHelper{
    public TipoUsuarioDAO(Context context) {
        super(context, "recodochDB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE TipoUsuario(id INTEGER PRIMARY KEY, nome TEXT NOT NULL, descricao TEXT NOT NULL);";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS TipoUsuario";
        db.execSQL(sql);
        onCreate(db);
    }

    public void insere(TipoUsuario tipoUsuario) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues dados = new ContentValues();
        dados.put("nome", tipoUsuario.getNome());
        dados.put("descricao", tipoUsuario.getDescricao());
        db.insert("TipoUsuario", null, dados);
    }
}
