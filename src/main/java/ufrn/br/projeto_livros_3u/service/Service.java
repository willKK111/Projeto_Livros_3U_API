package ufrn.br.projeto_livros_3u.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface Service<T> {
    public T criar(T entity);
    public T alterar(T Entity, Long id);
    public Page<T> listarTodos(Pageable pageable);
    public T listarPorId(Long id);
    public void deletarPorId(Long id);

    public T comparar(T entity);

}
