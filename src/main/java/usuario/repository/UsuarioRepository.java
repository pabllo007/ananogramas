package usuario.repository;

import usuario.dto.Usuario;

public interface UsuarioRepository {

    boolean existsByEmail(String email);
    Usuario save(Usuario user);
}
