package ufrn.br.projeto_livros_3u.domain;

import jakarta.persistence.*;
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
@SQLDelete(sql = "UPDATE livro SET deleted_at = CURRENT_TIMESTAMP where id=?")
@SQLRestriction("deleted_at is null")
public class Livro extends BaseEntity {

    @NotBlank(message = "o titulo não pode estar em branco")
    private String titulo;
    @NotBlank(message = "o isbn não pode estar em branco")
    private String isbn;
    @NotBlank(message = "o ano de publicação não pode estar em branco")
    private Integer anoPublicacao;

    private boolean ativo = true;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;

    @ManyToOne
    @JoinColumn(name = "editora_id")
    private Editora editora;

}
