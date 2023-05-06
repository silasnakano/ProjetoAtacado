package br.com.atacado.repositorio;

import br.com.atacado.dominio.Categoria;
import br.com.atacado.fakeDB.CategoriaFakeDB;

public class CategoriaRepositorio extends BaseRepositorio<Categoria> {

    public CategoriaRepositorio() {
        this.tabela = new CategoriaFakeDB().getTabela();
    }

    @Override
    public Categoria Create(Categoria obj) {

        int chave = 0;

        // Confere se a tabela está vazia senão add incrementando o codigo em +1
        if (this.tabela.size() == 0) {
            chave++;
        } else {
            int tamanho = this.tabela.size();
            chave = this.tabela.get(tamanho - 1).getCodigo() + 1;
        }

        // Add "codigo"
        obj.setCodigo(chave);
        // Add "descrição" a tabela
        this.tabela.add(obj);

        return obj;

    }

    @Override
    public Categoria Read(int chave) {

        Categoria res = new Categoria();

        for (Categoria tupla : this.tabela) {

            if (tupla.getCodigo() == chave) {
                res = tupla;
                break;
            } else {
                res = null;
            }

        }

        return res;

    }

    @Override
    public Categoria Update(Categoria obj) {

        Categoria alteracao = this.Read(obj.getCodigo());

        if (alteracao != null) {
            alteracao.setDescricao(obj.getDescricao());
        }

        return alteracao;

    }

}
