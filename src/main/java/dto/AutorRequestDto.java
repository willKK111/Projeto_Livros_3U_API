package dto;

import domain.Livro;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AutorRequestDto {
    private String nome;
    private String nacionalidade;
    private List<LivroRequestDto> livros;
}
