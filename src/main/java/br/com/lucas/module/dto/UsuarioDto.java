package br.com.lucas.module.dto;

import br.com.lucas.module.Usuario;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class UsuarioDto {

    private Long id;


    @NotNull
    @NotEmpty
    private String name;
    @NotNull
    private int age;
    @NotNull
    @NotEmpty
    private String profissao;
    @NotNull
    private Long cpf;

    public UsuarioDto(Usuario usuario) {
        this.id = usuario.getId();
        this.name = usuario.getName();
        this.age = usuario.getAge();
        this.profissao = usuario.getProfissao();
    }
}
