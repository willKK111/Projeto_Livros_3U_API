package ufrn.br.projeto_livros_3u.dto;

import org.springframework.hateoas.RepresentationModel;
// import controller.UsuarioController;


public class UsuarioResponseDto extends RepresentationModel<UsuarioResponseDto> {
    private String nome;
    private String email;
    private String senha;
    private RoleDTO role;

    // this.add(WebMvcLinkBuilderFactory.linkTo(UsuarioController.class).slash(usuario.getId()).withSelfRel());
    // this.add(WebMvcLinkBuilderFactory.linkTo(UsuarioController.class).withRel("usuarios"));
    // this.add(WebMvcLinkBuilderFactory.linkTo(UsuarioController.class).slash(usuario.getId()).withRel("delete"));
}
