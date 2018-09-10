package br.com.unknowcabbes.recodoch.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

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
}
