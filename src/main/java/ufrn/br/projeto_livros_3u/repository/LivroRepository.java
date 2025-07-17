package ufrn.br.projeto_livros_3u.repository;

import ufrn.br.projeto_livros_3u.domain.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
