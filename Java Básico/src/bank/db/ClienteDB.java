package bank.db;

import bank.models.Cliente;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClienteDB {

   private Map<String, Cliente> clienteMap = new HashMap<>();

   public Map<String, Cliente> getClienteMap() {
      return clienteMap;
   }

   public List<Cliente> getCliente() {
      List<Cliente> clientes = new ArrayList<>();

      for (Map.Entry<String, Cliente> cliente : clienteMap.entrySet()) {
         clientes.add(cliente.getValue());
      }

      return clientes;
   }

   public void addNovoCliente(Cliente cliente) {
      clienteMap.put(cliente.getId(), cliente);
   }

   public Cliente getClienteId(int id) {
      return clienteMap.get(String.valueOf(id));
   }

}
