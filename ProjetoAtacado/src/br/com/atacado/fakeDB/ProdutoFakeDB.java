package br.com.atacado.fakeDB;

import java.time.LocalDate;
import br.com.atacado.dominio.Produto;

public class ProdutoFakeDB extends BaseFakeDB<Produto> {

    @Override
    public void AutoFill() {
        this.tabela.add(new Produto(1, 1, "Papinha Infantil de Ameixa NESTLÉ", 0.0, LocalDate.now()));
        this.tabela.add(new Produto(2, 1, "Papinha Infantil de Banana NESTLÉ", 0.0, LocalDate.now()));
        this.tabela.add(new Produto(3, 1, "Papinha Infantil de Goiaba NESTLÉ", 0.0, LocalDate.now()));
        this.tabela.add(new Produto(4, 1, "Papinha Infantil de Frutas Sortidas NESTLÉ", 0.0, LocalDate.now()));
        this.tabela.add(new Produto(5, 1, "Papinha Infantil de Maçã e Ameixa NESTLÉ", 0.0, LocalDate.now()));
    }
    
}
