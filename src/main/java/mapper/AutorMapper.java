package mapper;

import domain.Autor;
import dto.AutorRequestDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AutorMapper {
    Autor toEntity(AutorRequestDto autorRequestDto);
}
