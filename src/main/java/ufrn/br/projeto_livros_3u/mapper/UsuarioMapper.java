package ufrn.br.projeto_livros_3u.mapper;

import ufrn.br.projeto_livros_3u.domain.Usuario;
import ufrn.br.projeto_livros_3u.dto.UsuarioRequestDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {
    Usuario toEntity(UsuarioRequestDto usuarioRequestDto);
}
