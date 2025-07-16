package mapper;

import domain.Usuario;
import dto.UsuarioRequestDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {
    Usuario toEntity(UsuarioRequestDto usuarioRequestDto);
}
