package br.com.atacado.dominio;

import java.time.LocalDate;

public class PessoaJuridica extends BasePessoa {

    private String cnpj;
    private String inscricaoMunicipal;
    private String inscricaoEstadual;
    private String nomeFantasia;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public PessoaJuridica(int codigoPessoa, String nome, String email, String site, LocalDate dataInclusao, String cnpj,
            String inscricaoMunicipal, String inscricaoEstadual, String nomeFantasia) {

        // Contrutor obrigatorio do pai = BasePessoa
        super(codigoPessoa, nome, email, site, dataInclusao);

        // Valores do contrutor do filho
        this.cnpj = cnpj;
        this.inscricaoMunicipal = inscricaoMunicipal;
        this.inscricaoEstadual = inscricaoEstadual;
        this.nomeFantasia = nomeFantasia;
    }

    @Override
    public void Imprimir() {

        System.out.println("------------- Pessoa Jurídica --------------");

        System.out.println("Código da Pessoa: " + this.codigoPessoa);
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("Site: " + this.site);
        System.out.println("Data de Inclusão: " + this.dataInclusao);
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("Inscrição Estadual: " + this.inscricaoEstadual);
        System.out.println("Inscrição Municipal: " + this.inscricaoMunicipal);
        System.out.println("Nome Fantasia: " + this.nomeFantasia);

    }

    @Override
    public String toString() {
        return "PessoaJuridica [" +
                "codigoPessoa=" + codigoPessoa +
                ", nome=" + nome +
                ", email=" + email +
                ", site=" + site +
                ", dataInclusao=" + dataInclusao +
                ", cnpj=" + cnpj +
                ", inscricaoEstadual=" + inscricaoEstadual +
                ", inscricaoMunicipal=" + inscricaoMunicipal +
                ", nomeFantasia=" + nomeFantasia +
                "]";
    }

}
