package br.com.atacado.dominio;

import java.time.LocalDate;

public class Veiculo extends Frota{

    protected int codigoFrota;
    protected String placa;

    public Veiculo() {
    }
    
    public Veiculo(int codigo, String descricao, LocalDate dataInsert, int codigoFrota, String placa) {
        
        super(codigo, descricao, dataInsert);
    
        this.codigoFrota = codigoFrota;
        this.placa = placa;

    }

}
