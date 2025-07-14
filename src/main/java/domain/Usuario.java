package domain;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Usuario extends BaseEntity{

    @NotBlank(message = "Nome não pode estar em branco ou vazio.")
    private String nome;

    @Column(unique = true)
    @Email
    private String email;


    private String senha;

    @Enumerated(EnumType.STRING)
    private Role role;
}
