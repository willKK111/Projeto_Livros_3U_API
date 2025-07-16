package dto;

import lombok.Data;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilderFactory;
// import controller.AutorController;
import domain.Autor;
import java.util.List;

@Data
public class AutorResponseDto extends RepresentationModel<AutorResponseDto> {
    private String nome;
    private String nacionalidade;
    private List<LivroResponseDto> livros;// tem que ver se isso aqui ta certo mesmo

    // this.add(WebMvcLinkBuilderFactory.linkTo(AutorController.class).slash(autor.getId()).withSelfRel());
    // this.add(WebMvcLinkBuilderFactory.linkTo(AutorController.class).withRel("autores"));
    // this.add(WebMvcLinkBuilderFactory.linkTo(AutorController.class).slash(autor.getId()).withRel("delete"));
}
