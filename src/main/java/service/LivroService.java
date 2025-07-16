package service;

import domain.Livro;
import repository.LivroRepository;

public class LivroService extends GenericoService<Livro,LivroRepository> {

    public LivroService(LivroRepository repository){
        super(repository);
    }
}
