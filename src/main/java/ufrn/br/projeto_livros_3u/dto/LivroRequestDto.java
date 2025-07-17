package ufrn.br.projeto_livros_3u.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LivroRequestDto {

    private String titulo;
    private String isbn;
    private Integer anoPublicacao;
    private AutorRequestDto autor;
    private EditoraRequestDto editora;
}
