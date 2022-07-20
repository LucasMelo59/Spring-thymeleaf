package br.com.lucas.services.impl;

import br.com.lucas.module.Usuario;
import br.com.lucas.module.dto.UsuarioDto;
import br.com.lucas.repositories.UsuarioRepository;
import br.com.lucas.services.UsuarioServices;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UsuarioServicesImpl implements UsuarioServices {

    @Autowired
    UsuarioRepository repository;
    @Override
    public Usuario cadastrar(UsuarioDto dto) {
    Usuario usuario = new Usuario();
    usuario.setName(dto.getName());
    usuario.setAge(dto.getAge());
    usuario.setCpf(dto.getCpf());
    usuario.setProfissao(dto.getProfissao());
        return repository.save(usuario);
    }

    @Override
    public Optional<UsuarioDto> detalhar(Long id) {
        return repository.findByIdOp;
    }

    @Override
    public Optional<Usuario> atualizar(Long id, UsuarioDto dto) {

        Optional<Usuario> usuario = repository.findById(id);
        usuario.ifPresent(t->{
            t.setProfissao(dto.getProfissao());
            t.setCpf(dto.getCpf());
            t.setName(dto.getName());
            t.setAge(dto.getAge());
            repository.save(t);
        });

        return usuario;
    }

    @Override
    public void remover(Long id) {
        Optional<Usuario> user = repository.findById(id);
        if(user.isPresent()) {
         repository.deleteById(id);
        }
    }

    @Override
    public List<UsuarioDto> lista() {
        return repository.findAll().stream().map(UsuarioDto::new).collect(Collectors.toList());
    }
}
