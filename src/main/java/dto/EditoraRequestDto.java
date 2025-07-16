package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EditoraRequestDto {
    private String nome;
    private String cidade;
    private List<LivroRequestDto> livros;
}
