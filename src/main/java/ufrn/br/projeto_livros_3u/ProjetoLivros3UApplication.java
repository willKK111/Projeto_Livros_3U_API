package ufrn.br.projeto_livros_3u;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import ufrn.br.projeto_livros_3u.core.security.RsaKeyProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class ProjetoLivros3UApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetoLivros3UApplication.class, args);
    }
}