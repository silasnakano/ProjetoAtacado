package br.com.atacado.teste;

import java.util.List;

import br.com.atacado.dominio.Categoria;
import br.com.atacado.repositorio.CategoriaRepositorio;

public class TesteCategoriaRepositorio {

    private CategoriaRepositorio repositorio;

    public TesteCategoriaRepositorio() {
        this.repositorio = new CategoriaRepositorio();
    }

    public void Executar() {

        List<Categoria> categorias = this.repositorio.Read();

        for (Categoria tupla : categorias) {
            System.out.println(tupla.toString());
        }

    }

}
