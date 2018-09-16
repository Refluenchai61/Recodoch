package br.com.unknowcabbes.recodoch.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import br.com.unknowcabbes.recodoch.model.Cliente;

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

    public void insere(Cliente cliente) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues dados = new ContentValues();
        dados.put("nome", cliente.getNome());
        dados.put("nomeFantasia", cliente.getNomeFantasia());
        dados.put("telefone", cliente.getTelefone());
        dados.put("ativo", cliente.getAtivo());
        db.insert("Cliente", null, dados);
    }
}
