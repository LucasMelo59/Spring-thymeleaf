package br.com.lucas.module;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;
@Entity
@Getter
@Setter
public class Usuario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long cpf;
    private int age;
    private String profissao;




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return age == usuario.age && Objects.equals(name, usuario.name) && Objects.equals(cpf, usuario.cpf) && Objects.equals(profissao, usuario.profissao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cpf, age, profissao);
    }
}
