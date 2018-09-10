package br.com.unknowcabbes.recodoch.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ClienteDAO extends SQLiteOpenHelper{
    public ClienteDAO(Context context) {
        super(context, "RecodochDB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE Cliente (id INTEGER PRIMARY KEY, nome TEXT NOT NULL, nomeFantasia TEXT NOT NULL, telefone TEXT NOT NULL, ativo BOOLEAN);";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS Cliente";
        db.execSQL(sql);
        onCreate(db);
    }
}
