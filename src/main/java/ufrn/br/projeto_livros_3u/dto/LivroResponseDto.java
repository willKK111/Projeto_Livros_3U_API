package ufrn.br.projeto_livros_3u.dto;

import ufrn.br.projeto_livros_3u.controller.LivroController;
import lombok.Data;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
//import controller.LivroController;
import ufrn.br.projeto_livros_3u.domain.Livro;

@Data
public class LivroResponseDto extends RepresentationModel<LivroResponseDto>{
    private String titulo;
    private String autor;
    private String editora;

    public void loadLinks(Livro livro){
        this.add(WebMvcLinkBuilder.linkTo(LivroController.class).slash(livro.getId()).withSelfRel());
        this.add(WebMvcLinkBuilder.linkTo(LivroController.class).withRel("livros"));
        this.add(WebMvcLinkBuilder.linkTo(LivroController.class).slash(livro.getId()).withRel("delete"));

            //Links extras e tem que rever essa parte, pq acho que se encaixa no crud lá que ele pediu
        //this.add(WebMvcLinkBuilder.linkTo(LivroController.class).slash(livro.getId()).withRel("editar"));
        //this.add(WebMvcLinkBuilder.linkTo(LivroController.class).slash(livro.getId()).withRel("avaliar"));
    }
}
