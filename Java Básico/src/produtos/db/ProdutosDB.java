package produtos.db;

import produtos.models.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProdutosDB {
    private Map<Integer, Produto> produtoMap = new HashMap<>();

    public List<Produto> getProdutoList() {
        List<Produto> produtos = new ArrayList<>();
        for (Map.Entry<Integer, Produto> produto : produtoMap.entrySet()) {
            produtos.add(produto.getValue());
        }
        return produtos;
    }

   public void addNovoProduto(Produto produto) {
        produtoMap.put(produto.getId(), produto);
   }
   public Produto getProdutoPorId(int id) {
      return produtoMap.get(id);
   }

}
