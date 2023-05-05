package br.com.atacado.dominio;

import java.time.LocalDate;

public class Produto {

    private int codigo;
    private int codigoSubcategoria;
    private int codigoCategoria;
    private String descricao;
    private double valor;
    private LocalDate dataDeInclusao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoSubcategoria() {
        return codigoSubcategoria;
    }

    public void setCodigoSubcategoria(int codigoSubcategoria) {
        this.codigoSubcategoria = codigoSubcategoria;
    }

    public int getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(int codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataDeInclusao() {
        return dataDeInclusao;
    }

    public void setDataDeInclusao(LocalDate dataDeInclusao) {
        this.dataDeInclusao = dataDeInclusao;
    }

    public Produto() {
    }

    public Produto(int codigo, int codigoSubcategoria, String descricao, double valor, LocalDate dataDeInclusao) {
        this.codigo = codigo;
        this.codigoSubcategoria = codigoSubcategoria;
        this.descricao = descricao;
        this.valor = valor;
        this.dataDeInclusao = dataDeInclusao;
    }

    public Produto(int codigo, int codigoSubcategoria, int codigoCategoria, String descricao,
            LocalDate dataDeInclusao) {
        this.codigo = codigo;
        this.codigoSubcategoria = codigoSubcategoria;
        this.codigoCategoria = codigoCategoria;
        this.descricao = descricao;
        this.valor = 0.0;
        this.dataDeInclusao = dataDeInclusao;
    }

    @Override
    public String toString() {
        return "Produto [codigo=" + codigo + ", codigoSubcategoria=" + codigoSubcategoria + ", descricao=" + descricao
                + ", valor=" + valor + ", dataDeInclusao=" + dataDeInclusao + "]";
    }

}
