package ufrn.br.projeto_livros_3u.service;

import org.springframework.stereotype.Service;
import ufrn.br.projeto_livros_3u.domain.Livro;
import ufrn.br.projeto_livros_3u.repository.LivroRepository;

@Service
public class LivroService extends GenericoService<Livro,LivroRepository> {

    public LivroService(LivroRepository repository){
        super(repository);
    }
}
