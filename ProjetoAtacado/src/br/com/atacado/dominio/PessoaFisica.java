package br.com.atacado.dominio;

import java.time.LocalDate;

public class PessoaFisica extends BasePessoa {

    // Atributo privado classe real
    private String cpf;
    private String rg;
    private String sexo;
    private String race;
    private String naturalidade;
    private String nacionalidade;
    private String nomePai;
    private String nomeMae;

    // Métodos getters e setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public PessoaFisica(int codigoPessoa, String nome, String email, String site, LocalDate dataInclusao, String cpf,
            String rg, String sexo, String race, String naturalidade, String nacionalidade, String nomePai,
            String nomeMae) {

        // Construtor do pai o filho precisa tambem = BasePessoa
        super(codigoPessoa, nome, email, site, dataInclusao);

        // Construtor do filho = PessoaFisica
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.race = race;
        this.naturalidade = naturalidade;
        this.nacionalidade = nacionalidade;
        this.nomePai = nomePai;
        this.nomeMae = nomeMae;
        
    }

    @Override
    public void Imprimir() {

        System.out.println("---------- Pessoa Física ----------");

        System.out.println("Código da Pessoa: " + this.codigoPessoa);
        System.out.println("Nome: " + this.nome);
        System.out.println("Email: " + this.email);
        System.out.println("Site: " + this.site);
        System.out.println("Data de Inclusão: " + this.dataInclusao);
        System.out.println("CPF: " + this.cpf);
        System.out.println("RG: " + this.rg);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Raça: " + this.race);
        System.out.println("Nacionalidade: " + this.nacionalidade);
        System.out.println("Naturalidade: " + this.naturalidade);
        System.out.println("Nome do Pai: " + this.nomePai);
        System.out.println("Nome da Mãe: " + this.nomeMae);

    }

    @Override
    public String toString() {
        return "PessoaFisica [" +
                "codigoPessoa=" + codigoPessoa +
                ", nome=" + nome +
                ", email=" + email +
                ", site=" + site +
                ", dataInclusao=" + dataInclusao +
                ", cpf=" + cpf +
                ", rg=" + rg +
                ", sexo=" + sexo +
                ", raca=" + race +
                ", nacionalidade=" + nacionalidade +
                ", naturalidade=" + naturalidade +
                ", nomePai=" + nomePai +
                ", nomeMae=" + nomeMae
                + "]";
    }
    
}
