package ufrn.br.projeto_livros_3u.controller;


import ufrn.br.projeto_livros_3u.domain.Livro;
import ufrn.br.projeto_livros_3u.dto.LivroResponseDto;
import ufrn.br.projeto_livros_3u.mapper.LivroMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ufrn.br.projeto_livros_3u.service.LivroService;


@RestController
@RequestMapping("/livros")
public class LivroController {

    final LivroMapper mapper;
    final LivroService service;

    public LivroController(LivroMapper mapper, LivroService service) {
        this.mapper = mapper;
        this.service = service;
    }

    @GetMapping("/livros")
    public Page<LivroResponseDto> listarTodos(Pageable pageable){

        Page<Livro> livrosPage = service.listarTodos(pageable);
        return livrosPage.map(mapper::toDtoLivro);
    }









}
