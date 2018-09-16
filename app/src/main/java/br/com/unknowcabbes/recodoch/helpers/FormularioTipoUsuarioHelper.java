package br.com.unknowcabbes.recodoch.helpers;

import android.widget.EditText;

import br.com.unknowcabbes.recodoch.R;
import br.com.unknowcabbes.recodoch.forms.FormularioTipoUsuarioActivity;
import br.com.unknowcabbes.recodoch.model.TipoUsuario;

public class FormularioTipoUsuarioHelper {
    private final EditText campoNome;
    private final EditText campoDescricao;

    public FormularioTipoUsuarioHelper(FormularioTipoUsuarioActivity formularioTipoDocumentoActivity) {
        campoNome = (EditText) formularioTipoDocumentoActivity.findViewById(R.id.form_nome_tipo_usuario);
        campoDescricao = (EditText) formularioTipoDocumentoActivity.findViewById(R.id.form_descricao_tipo_usuario);
    }

    public TipoUsuario pegaTipoUsuario() {
        TipoUsuario tipoUsuario = new TipoUsuario();
        tipoUsuario.setNome(campoNome.getText().toString());
        tipoUsuario.setDescricao(campoDescricao.getText().toString());

        return tipoUsuario;
    }
}
