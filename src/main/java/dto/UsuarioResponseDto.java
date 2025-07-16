package dto;

import lombok.Data;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilderFactory;
// import controller.UsuarioController;
import domain.Usuario;
import java.util.List;

public class UsuarioResponseDto extends RepresentationModel<UsuarioResponseDto> {
    private String nome;
    private String email;
    private String senha;
    private RoleDTO role;

    // this.add(WebMvcLinkBuilderFactory.linkTo(UsuarioController.class).slash(usuario.getId()).withSelfRel());
    // this.add(WebMvcLinkBuilderFactory.linkTo(UsuarioController.class).withRel("usuarios"));
    // this.add(WebMvcLinkBuilderFactory.linkTo(UsuarioController.class).slash(usuario.getId()).withRel("delete"));
}
