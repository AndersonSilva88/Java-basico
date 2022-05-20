package bank.db;

import bank.models.Conta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContasDB {

    private Map<Integer, Conta> contaMap = new HashMap<>();

    public List<Conta> getContaList() {
        List<Conta> contas = new ArrayList<>();

        for (Map.Entry<Integer, Conta> conta : contaMap.entrySet()) {
            contas.add(conta.getValue());
        }
        return contas;
    }

    public void addNovaConta(Conta conta) {
        contaMap.put((int) conta.getNumero(), conta);
    }

    public Conta getAgenciaId(int agencia) {
        return contaMap.get(agencia);
    }


}
