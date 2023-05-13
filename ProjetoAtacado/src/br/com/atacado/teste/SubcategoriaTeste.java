package br.com.atacado.teste;

import java.util.List;

import br.com.atacado.dominio.Subcategoria;
import br.com.atacado.servico.SubcategoriaServico;

public class SubcategoriaTeste extends BaseTeste<Subcategoria> {

    public SubcategoriaTeste() {
        super();
        this.servico = new SubcategoriaServico();
    }

    @Override
    public void Executar() {

        int valorChave = this.TestarCriacao();

        this.TestarAtualizacao(valorChave);
        this.TestarDeletar(valorChave);
        // this.TestarLeitura();
        // this.TestarLeituraVarios();

    }

    @Override
    protected int TestarCriacao() {

        System.out.println("Agora testando Criação: ");

        Subcategoria cat = new Subcategoria(0, null, null, 0);
        Subcategoria novo = this.servico.Criar(cat);

        System.out.println(novo.toString());

        return novo.getCodigo();

    }

    @Override
    protected void TestarLeitura(int chave) {

        Subcategoria cat = this.servico.Ler(chave);

        System.out.println(cat.toString());
    }

    @Override
    protected void TestarLeituraVarios() {

        List<Subcategoria> lista = this.servico.Ler();

        for (Subcategoria cat : lista) {
            System.out.println(cat.toString());
        }
    }

    @Override
    protected void TestarAtualizacao(int chave) {

        System.out.println("Agora testando Atualização: ");

        Subcategoria antigo = this.servico.Ler(chave);

        antigo.setDescricao("Granada de mão");

        Subcategoria alterada = this.servico.Atualizar(antigo);

        System.out.println(alterada.toString());
    }

    @Override
    protected void TestarDeletar(int chave) {

        System.out.println("Agora testando Deletar: ");

        Subcategoria alvo = this.servico.Ler(chave);

        Subcategoria excluido = this.servico.Deletar(alvo.getCodigo());

        System.out.println(excluido.toString());
    }

}
