package br.com.lucas.services;

import br.com.lucas.module.Usuario;
import br.com.lucas.module.dto.UsuarioDto;

import java.util.List;
import java.util.Optional;

public interface UsuarioServices {

    public Usuario cadastrar(UsuarioDto dto);

    public UsuarioDto detalhar(Long id);

    public Optional<Usuario> atualizar(Long id, UsuarioDto dto );

    public void remover(Long id);

    public List<UsuarioDto> lista();
}
