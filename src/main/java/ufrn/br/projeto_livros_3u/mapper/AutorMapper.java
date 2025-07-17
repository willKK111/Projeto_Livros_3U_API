package ufrn.br.projeto_livros_3u.mapper;

import ufrn.br.projeto_livros_3u.domain.Autor;
import ufrn.br.projeto_livros_3u.dto.AutorRequestDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AutorMapper {
    Autor toEntity(AutorRequestDto autorRequestDto);
}
