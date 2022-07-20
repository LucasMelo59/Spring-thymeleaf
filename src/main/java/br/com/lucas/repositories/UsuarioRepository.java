package br.com.lucas.repositories;

import br.com.lucas.module.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>
{


}
