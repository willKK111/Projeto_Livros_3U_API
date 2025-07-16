package mapper;

import domain.Editora;
import dto.EditoraRequestDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EditoraMapper {
    Editora toEntity(EditoraRequestDto editoraRequestDto);
}
