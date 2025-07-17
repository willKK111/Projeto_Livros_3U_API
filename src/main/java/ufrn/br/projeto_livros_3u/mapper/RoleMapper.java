package ufrn.br.projeto_livros_3u.mapper;

import ufrn.br.projeto_livros_3u.domain.Role;
import ufrn.br.projeto_livros_3u.dto.RoleDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    Role toEntity(RoleDTO roleDTO);
}

