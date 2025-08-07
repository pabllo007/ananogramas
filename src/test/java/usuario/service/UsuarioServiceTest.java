package usuario.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import usuario.repository.UsuarioRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class UsuarioServiceTest {

    @Mock
    UsuarioRepository repository;

    @Test
    void deveFalharQuandoNomeForInvalido() {
        UsuarioService service = new UsuarioService(repository);

        IllegalArgumentException excecao = assertThrows(IllegalArgumentException.class, () ->
                service.criarUsuario(null, "teste@testre.com", "xxxxx", "9999")
        );
        assertEquals("Nome é obrigatório.", excecao.getMessage());
        verify(repository, never()).existsByEmail(anyString());
        verify(repository, never()).save(any());
    }
}
