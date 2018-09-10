package br.com.unknowcabbes.recodoch.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ImagemDAO extends SQLiteOpenHelper{
    public ImagemDAO(Context context) {
        super(context, "recodochDB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE Imagem (id INTEGER PRIMARY KEY, nome TEXT NOT NULL, endereco TEXT, documentoId INTEGER NOT NULL," +
                     " FOREIGN KEY(documentoId) REFERENCES Documento(id));";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS Imagem";
        db.execSQL(sql);
        onCreate(db);
    }
}
