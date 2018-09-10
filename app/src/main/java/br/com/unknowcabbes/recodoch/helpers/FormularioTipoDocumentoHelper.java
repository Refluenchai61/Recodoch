package br.com.unknowcabbes.recodoch.helpers;

import android.widget.EditText;
import br.com.unknowcabbes.recodoch.R;
import br.com.unknowcabbes.recodoch.forms.FormularioTipoDocumentoActivity;
import br.com.unknowcabbes.recodoch.model.TipoDocumento;

public class FormularioTipoDocumentoHelper {
    private final EditText campoNome;
    private final EditText campoDescricao;

    public FormularioTipoDocumentoHelper(FormularioTipoDocumentoActivity formularioTipoDocumentoActivity) {
       campoNome = (EditText) formularioTipoDocumentoActivity.findViewById(R.id.formulario_nome);
       campoDescricao = (EditText) formularioTipoDocumentoActivity.findViewById(R.id.formulario_descricao);
    }

    public TipoDocumento pegaTipoDocumento() {
        TipoDocumento tipoDocumento = new TipoDocumento();
        tipoDocumento.setNome(campoNome.getText().toString());
        tipoDocumento.setDescricao(campoDescricao.getText().toString());

        return tipoDocumento;
    }
}
