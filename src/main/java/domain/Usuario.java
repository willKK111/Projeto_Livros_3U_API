package domain;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;


@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@SQLDelete(sql = "UPDATE usuario SET deleted_at = CURRENT_TIMESTAMP where id=?")
@SQLRestriction("deleted_at is null")

public class Usuario extends BaseEntity{

    @NotBlank(message = "Nome não pode estar em branco ou vazio.")
    private String nome;

    @Column(unique = true)
    @Email
    private String email;

    @NotBlank(message = "a senha não pode estar em branco")
    private String senha;

    @Enumerated(EnumType.STRING)
    private Role role;
}
