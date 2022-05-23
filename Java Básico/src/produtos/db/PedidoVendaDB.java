package produtos.db;

import produtos.models.PedidoVenda;

import java.util.ArrayList;
import java.util.List;

public class PedidoVendaDB {

    private List<PedidoVenda> pedidoVendas = new ArrayList<>();

    public List<PedidoVenda> getPedidoVendas() {
        return pedidoVendas;
    }

    public void addNovoPedidoVenda(PedidoVenda novoPedido) {
        int id = pedidoVendas.size() + 1;
        novoPedido.setId(id);
        pedidoVendas.add(novoPedido);
    }
}
