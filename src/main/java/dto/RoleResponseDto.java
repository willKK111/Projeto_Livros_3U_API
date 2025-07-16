package dto;

import lombok.Data;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilderFactory;
// import controller.RoleController;
import domain.Role;

@Data
public class RoleResponseDto extends RepresentationModel<RoleResponseDto> {
    private String role;

    // this.add(WebMvcLinkBuilderFactory.linkTo(RoleController.class).slash(role.getId()).withSelfRel());
    // this.add(WebMvcLinkBuilderFactory.linkTo(RoleController.class).withRel("roles"));
    // this.add(WebMvcLinkBuilderFactory.linkTo(RoleController.class).slash(role.getId()).withRel("delete"));
}
