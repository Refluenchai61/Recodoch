package br.com.unknowcabbes.recodoch.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DocumentoDAO extends SQLiteOpenHelper {
    public DocumentoDAO(Context context) {
        super(context, "recodochDB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE Documento (id INTEGER PRIMARY KEY, registroId INTEGER NOT NULL, tipoDocumentoId INTEGER NOT NULL, informacoes TEXT, quantidade INTEGER," +
                     "FOREIGN KEY(registroId) REFERENCES Registro(id), FOREIGN KEY(tipoDocumentoId) REFERENCES tipoDocumento(id));";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS Documento";
        db.execSQL(sql);
        onCreate(db);

    }
}
