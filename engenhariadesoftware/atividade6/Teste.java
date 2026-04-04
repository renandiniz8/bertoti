import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Teste {

    @Test
    void test(){
        Petshop petshop = new Petshop();

        petshop.cadastrarProduto(new Produto("Remédio de Verme", "Cachorro"));

        assertEquals(1, petshop.getProdutos().size());

        List<Produto> encontrados = petshop.buscarNomeProduto("Remédio de Verme");

        assertEquals("Cachorro", encontrados.get(0).getPet());
    }
}
