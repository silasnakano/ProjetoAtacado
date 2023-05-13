package br.com.atacado.teste;

import java.time.LocalDate;
import java.util.List;

import br.com.atacado.dominio.Categoria;
import br.com.atacado.servico.CategoriaServico;

public class CategoriaTeste extends BaseTeste<Categoria> {

    public CategoriaTeste() {
        super();
        this.servico = new CategoriaServico();
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

        Categoria cat = new Categoria(0, "Bandeja", LocalDate.now());
        Categoria novo = this.servico.Criar(cat);

        System.out.println(novo.toString());

        return novo.getCodigo();

    }

    @Override
    protected void TestarLeitura(int chave) {

        Categoria cat = this.servico.Ler(chave);

        System.out.println(cat.toString());

    }

    @Override
    protected void TestarLeituraVarios() {

        List<Categoria> lista = this.servico.Ler();

        for (Categoria cat : lista) {
            System.out.println(cat.toString());
        }

    }

    @Override
    protected void TestarAtualizacao(int chave) {

        System.out.println("Agora testando Atualização: ");

        Categoria antigo = this.servico.Ler(chave);

        antigo.setDescricao("Granada de mão");

        Categoria alterada = this.servico.Atualizar(antigo);

        System.out.println(alterada.toString());

    }

    @Override
    protected void TestarDeletar(int chave) {

        System.out.println("Agora testando Deletar: ");

        Categoria alvo = this.servico.Ler(chave);

        Categoria excluido = this.servico.Deletar(alvo.getCodigo());

        System.out.println(excluido.toString());

    }

}
