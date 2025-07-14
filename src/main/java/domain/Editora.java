package domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Objects;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Editora extends BaseEntity {

    private String nome;
    private String cidade;

    @OneToMany(mappedBy = "editora")
    private List<Livro> livros;
}

