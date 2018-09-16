package br.com.unknowcabbes.recodoch.helpers;

import android.widget.EditText;

import br.com.unknowcabbes.recodoch.R;
import br.com.unknowcabbes.recodoch.forms.FormularioUsuarioActivity;
import br.com.unknowcabbes.recodoch.model.TipoUsuario;
import br.com.unknowcabbes.recodoch.model.Usuario;

public class FormularioUsuarioHelper {
    private final EditText campoNome;
    private final EditText campoLogin;
    private final EditText campoSenha;
    private final EditText campoTipoUsuarioId;
    private final EditText campoAtivo;
    private final EditText campoClienteId;

    public FormularioUsuarioHelper(FormularioUsuarioActivity formularioUsuarioActivity) {
        campoNome = (EditText) formularioUsuarioActivity.findViewById(R.id.form_nome_usuario);
        campoLogin = (EditText) formularioUsuarioActivity.findViewById(R.id.form_login_usuario);
        campoSenha = (EditText) formularioUsuarioActivity.findViewById(R.id.form_senha_usuario);
        campoTipoUsuarioId = (EditText) formularioUsuarioActivity.findViewById(R.id.form_tipo_usuario_id_usuario);
        campoAtivo = (EditText) formularioUsuarioActivity.findViewById(R.id.form_ativo_usuario);
        campoClienteId = (EditText) formularioUsuarioActivity.findViewById(R.id.form_cliente_id_usuario);
    }

    public Usuario pegaUsuario() {
        Usuario usuario = new Usuario();
        usuario.setLogin(campoLogin.getText().toString());
        usuario.setNome(campoNome.getText().toString());
        usuario.setSenha(campoSenha.getText().toString());
        usuario.setTipoUsuarioId(campoTipoUsuarioId.getId());
        usuario.setAtivo(Boolean.valueOf(String.valueOf(campoAtivo)));
        usuario.setClienteId(campoClienteId.getId());

        return usuario;
    }
}
