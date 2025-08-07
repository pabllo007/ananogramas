package usuario.service;

import usuario.dto.Usuario;
import usuario.repository.UsuarioRepository;

public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public Usuario criarUsuario(String nome, String email, String endereco, String telefone) {
        if (campoVazioOuNulo(nome)) {
            throw new IllegalArgumentException("Nome é obrigatório.");
        }
        if (campoVazioOuNulo(email)) {
            throw new IllegalArgumentException("Email é obrigatório.");
        }

        String emailNormalizado = email.trim().toLowerCase();
        if (repository.existsByEmail(emailNormalizado)) {
            throw new IllegalStateException("Email já cadastrado.");
        }

        Usuario usuario = new Usuario(nome.trim(), emailNormalizado, endereco, telefone);
        return repository.save(usuario);
    }

    private boolean campoVazioOuNulo(String valor) {
        return valor == null || valor.trim().isEmpty();
    }
}
