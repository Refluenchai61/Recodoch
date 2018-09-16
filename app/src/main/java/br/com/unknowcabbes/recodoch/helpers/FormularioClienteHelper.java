package br.com.unknowcabbes.recodoch.helpers;

import android.widget.EditText;

import br.com.unknowcabbes.recodoch.R;
import br.com.unknowcabbes.recodoch.forms.FormularioClienteActivity;
import br.com.unknowcabbes.recodoch.forms.FormularioTipoDocumentoActivity;
import br.com.unknowcabbes.recodoch.model.Cliente;
import br.com.unknowcabbes.recodoch.model.TipoDocumento;

public class FormularioClienteHelper {
    private final EditText campoNome;
    private final EditText campoNomeFantasia;
    private final EditText campoTelefone;
    private final EditText campoAtivo;

    public FormularioClienteHelper(FormularioClienteActivity formularioClienteActivity) {
        campoNome = (EditText) formularioClienteActivity.findViewById(R.id.form_nome_cliente);
        campoNomeFantasia = (EditText) formularioClienteActivity.findViewById(R.id.form_nome_fantasia_cliente);
        campoTelefone = (EditText) formularioClienteActivity.findViewById(R.id.form_telefone_cliente);
        campoAtivo = (EditText) formularioClienteActivity.findViewById(R.id.form_ativo_cliente);
    }

    public Cliente pegaTipoDocumento() {
        Cliente cliente = new Cliente();
        cliente.setNome(campoNome.getText().toString());
        cliente.setNomeFantasia(campoNomeFantasia.getText().toString());
        cliente.setTelefone(campoTelefone.getText().toString());
        cliente.setAtivo(Boolean.valueOf(String.valueOf(campoAtivo)));

        return cliente;
    }

    public Cliente pegaCliente() {
        Cliente cliente = new Cliente();
        cliente.setNome(campoNome.getText().toString());
        cliente.setNomeFantasia(campoNomeFantasia.getText().toString());
        cliente.setTelefone(campoTelefone.getText().toString());
        cliente.setAtivo(Boolean.valueOf(String.valueOf(campoAtivo)));

        return cliente;
    }
}
