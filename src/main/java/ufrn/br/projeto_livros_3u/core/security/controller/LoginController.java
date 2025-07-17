package ufrn.br.projeto_livros_3u.core.security.controller;

import ufrn.br.projeto_livros_3u.dto.LoginDto;
import ufrn.br.projeto_livros_3u.core.security.service.TokenService;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@AllArgsConstructor
public class LoginController {

    private final TokenService service;
    private final AuthenticationManager authenticationManager;


    @PostMapping("/token")
    public String getToken(@RequestBody LoginDto loginDto){
        Authentication authentication = authenticationManager
                .authenticate(
                        new UsernamePasswordAuthenticationToken(loginDto.username(), loginDto.password())
                );

        return service.generateToken(authentication);
    }

}