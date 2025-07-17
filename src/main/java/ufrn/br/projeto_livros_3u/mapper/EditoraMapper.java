package ufrn.br.projeto_livros_3u.mapper;

import ufrn.br.projeto_livros_3u.domain.Editora;
import ufrn.br.projeto_livros_3u.dto.EditoraRequestDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EditoraMapper {
    Editora toEntity(EditoraRequestDto editoraRequestDto);
}
