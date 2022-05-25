package produtos.validadores;

import produtos.models.PedidoVenda;

public class ValidadorQuantidade implements IValidadorPedidoVenda {


    @Override
    public String validar(PedidoVenda pedidoVenda) {

        if (pedidoVenda.getQuantidade() > pedidoVenda.getEstoque().getQuantidade()) {
            return "Quantidade indisponivel no estoque";
        }


        return null;
    }
}
