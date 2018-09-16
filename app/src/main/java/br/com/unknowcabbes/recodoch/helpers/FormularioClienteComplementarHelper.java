package br.com.unknowcabbes.recodoch.helpers;

import android.widget.EditText;

import br.com.unknowcabbes.recodoch.R;
import br.com.unknowcabbes.recodoch.forms.FormularioClienteComplementarActivity;
import br.com.unknowcabbes.recodoch.model.ClienteComplementar;

public class FormularioClienteComplementarHelper {
    private final EditText campoClienteId;
    private final EditText campoTipoDocumentoId;;

    public FormularioClienteComplementarHelper(FormularioClienteComplementarActivity formularioClienteActivity) {
        campoClienteId = (EditText) formularioClienteActivity.findViewById(R.id.form_cliente_id_cliente_complementar);
        campoTipoDocumentoId = (EditText) formularioClienteActivity.findViewById(R.id.form_nome_fantasia_cliente);
    }

    public ClienteComplementar pegaClienteComplemento() {
        ClienteComplementar clienteComplemento = new ClienteComplementar();
        clienteComplemento.setClienteId(campoClienteId.getId());
        clienteComplemento.setTipoDocumentoId(campoTipoDocumentoId.getId());

        return clienteComplemento;
    }
}
