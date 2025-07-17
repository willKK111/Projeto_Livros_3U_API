package ufrn.br.projeto_livros_3u.mapper;

import org.mapstruct.Mapping;
import ufrn.br.projeto_livros_3u.domain.Livro;
import ufrn.br.projeto_livros_3u.dto.LivroRequestDto;
import ufrn.br.projeto_livros_3u.dto.LivroResponseDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LivroMapper {
    Livro toEntityLivro(LivroRequestDto livroRequestDtodto);

    @Mapping(target = "autor", source = "autor.nome")
    @Mapping(target = "editora", source = "editora.nome")
    LivroResponseDto toDtoLivro(Livro livro);
}
