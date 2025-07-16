package mapper;

import domain.Livro;
import dto.LivroRequestDto;
import dto.LivroResponseDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LivroMapper {
    Livro toEntityLivro(LivroRequestDto livroRequestDtodto);
    LivroResponseDto toDtoLivro(Livro livro);
}
