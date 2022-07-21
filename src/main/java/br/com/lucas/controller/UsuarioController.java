package br.com.lucas.controller;

import br.com.lucas.module.Usuario;
import br.com.lucas.module.dto.UsuarioDto;
import br.com.lucas.services.UsuarioServices;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {


UsuarioServices services;


@GetMapping("/{id}")
public UsuarioDto detalhar(@PathVariable Long id) {
    return services.detalhar(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario não encontrado"));
}
@PutMapping("/{id}")
@Transactional
public Usuario atualizar(@PathVariable Long id, @Valid UsuarioDto dto) {

    return services.atualizar(id,dto).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario não encontrado"));
}

@DeleteMapping("/{id}")
@Transactional
    public void remover(@PathVariable Long id) {
    services.remover(id);
}

@PostMapping
@Transactional
public Usuario cadastrar (UsuarioDto dto) {
    return services.cadastrar(dto);
}

@GetMapping
    public List<UsuarioDto> lista() {
    return services.lista();
}
}
