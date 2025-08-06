package anagramas.service;

import anagramas.util.TestUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class AnagramaServiceTest {

    @InjectMocks
    private AnagramaService service;

    @Test
    void deveGerarAnagramasComVariasLetras() {
        String entrada = "ABCDE";
        List<String> anagramas = service.gerarAnagramas(entrada);

        assertEquals(TestUtils.fatorial(entrada.length()), anagramas.size());
        assertTrue(anagramas.contains("ABCDE"));
        assertTrue(anagramas.contains("EDCBA"));
    }

    @Test
    void deveGerarAnagramaParaUmaLetra() {
        List<String> anagramas = service.gerarAnagramas("Z");

        assertEquals(1, anagramas.size());
        assertEquals("Z", anagramas.get(0));
    }

    @Test
    void deveLancarExcecaoParaEntradaVazia() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            service.gerarAnagramas("");
        });

        assertEquals("A entrada não pode ser vazia.", ex.getMessage());
    }

    @Test
    void deveLancarExcecaoParaCaracterInvalido() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            service.gerarAnagramas("A1B");
        });

        assertEquals("A entrada deve conter apenas letras.", ex.getMessage());
    }

    @Test
    void deveLancarExcecaoParaCaracteresDuplicados() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            service.gerarAnagramas("ABA");
        });

        assertEquals("A entrada deve conter apenas letras distintas.", ex.getMessage());
    }
}
