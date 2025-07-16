package domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;

import java.util.List;


@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@SQLDelete(sql = "UPDATE autor SET deleted_at = CURRENT_TIMESTAMP where id=?")
@SQLRestriction("deleted_at is null")

public class Autor extends BaseEntity {

    @NotBlank(message = "o nome não pode estar em branco")
    private String nome;
    @NotBlank(message = "a nacionalidade não pode estar em branco")
    private String nacionalidade;

    @OneToMany(mappedBy = "autor")
    private List<Livro> livros;

}
