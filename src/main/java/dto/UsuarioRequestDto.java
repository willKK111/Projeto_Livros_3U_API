package dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioRequestDto {
    private String nome;
    private String email;
    private String senha;
    private RoleDTO role;
}
