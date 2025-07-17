package ufrn.br.projeto_livros_3u.dto;

import lombok.Data;
import org.springframework.hateoas.RepresentationModel;
//import controller.EditoraController;
import java.util.List;

@Data
public class EditoraResponseDto extends RepresentationModel<EditoraResponseDto> {
    private String nome;
    private String cidade;
    private List<LivroResponseDto> livrosTitulos; // pode trocar para List<String> se quiser e  tem que ver se isso aqui ta certo mesmo

    // this.add(WebMvcLinkBuilderFactory.linkTo(EditoraController.class).slash(editora.getId()).withSelfRel());
    // this.add(WebMvcLinkBuilderFactory.linkTo(EditoraController.class).withRel("editoras"));
    // this.add(WebMvcLinkBuilderFactory.linkTo(EditoraController.class).slash(editora.getId()).withRel("delete"));
}
