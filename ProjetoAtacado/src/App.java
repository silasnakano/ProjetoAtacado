/* 
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
*/
import br.com.atacado.dominio.*;
import br.com.atacado.fakeDB.*;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * PessoaFisica p1 = new PessoaFisica(1, "Mateus", "mateus@ceu.com.br",
         * "ceu.com.br", LocalDate.now(), "123",
         * "456", "M", "Pardo", "Jerusalem",
         * "Hebreu", "Pai", "Mae");
         * 
         * p1.Imprimir();
         * System.out.println();
         * 
         * PessoaJuridica pj1 = new PessoaJuridica(2, "ACME LTDA",
         * "gerente@acme.com.br",
         * "acme.com.br", LocalDate.now(), "123456", "36345612",
         * "369632145", "Piupiu e Frajola Bar e Lanches");
         * 
         * pj1.Imprimir();
         * System.out.println();
         */

        /*
        Categoria c1 = new Categoria(1, "Laticínios", LocalDate.now());

        Subcategoria s1 = new Subcategoria(1, 1, "Queijos", LocalDate.now());
        Subcategoria s2 = new Subcategoria(2, 1, "Iogurte", LocalDate.now());

        Produto p1 = new Produto(1, 1, "Mussarela", 45.5, LocalDate.now());
        Produto p2 = new Produto(2, 1, "Provolone", 50.75, LocalDate.now());
        Produto p3 = new Produto(3, 2, "Grego", 7.25, LocalDate.now());
        Produto p4 = new Produto(4, 2, "Natural", 5, LocalDate.now());

        List<Produto> prods1 = new ArrayList<>();
        List<Produto> prods2 = new ArrayList<>();

        prods1.add(p1);
        prods1.add(p2);
        s1.setProdutos(prods1);

        prods2.add(p3);
        prods2.add(p4);
        s2.setProdutos(prods2);

        List<Subcategoria> subs = new ArrayList<>();

        subs.add(s1);
        subs.add(s2);

        c1.setSubcategorias(subs);
        */

        CategoriaFakeDB db1 = new CategoriaFakeDB();
        for (Categoria c : db1.getTabela()) {
            System.out.println(c.toString());
        }

        SubcategoriaFakeDB db2 = new SubcategoriaFakeDB();
        for (Subcategoria c : db2.getTabela()) {
            System.out.println(c.toString());
        }
        
        ProdutoFakeDB db3 = new ProdutoFakeDB();
        for (Produto c : db3.getTabela()) {
            System.out.println(c.toString());
        }

    }

}
