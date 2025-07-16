package mapper;

import domain.Livro;
import dto.LivroRequestDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LivroMapper {
    Livro toEntity(LivroRequestDto livroRequestDtodto);
}
