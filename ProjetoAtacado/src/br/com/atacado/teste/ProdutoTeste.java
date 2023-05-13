package br.com.atacado.teste;

import br.com.atacado.dominio.Produto;
import br.com.atacado.servico.ProdutoServico;

public class ProdutoTeste extends BaseTeste<Produto> {

    public ProdutoTeste() {
        super();
        this.servico = new ProdutoServico();
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

        Produto cat = new Produto(0, 0, 0, null, null);
        Produto novo = this.servico.Criar(cat);

        System.out.println(novo.toString());

        return novo.getCodigo();
    }

    @Override
    protected void TestarLeitura(int chave) {

        Produto cat = this.servico.Ler(chave);

        System.out.println(cat.toString());
    }

    @Override
    protected void TestarLeituraVarios() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'TestarLeituraVarios'");
    }

    @Override
    protected void TestarAtualizacao(int chave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'TestarAtualizacao'");
    }

    @Override
    protected void TestarDeletar(int chave) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'TestarDeletar'");
    }

}
