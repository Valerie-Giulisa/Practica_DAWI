package controllers;


import entities.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.UsuarioRepository;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    private final UsuarioRepository usuarioRepository;

//Constructor para inicializar repository
    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
// funcion para registrar un nuevo usuario
    @PostMapping("/registrar")
    public ResponseEntity registrar(Usuario usuario){

        Usuario usuarioRegistrado = usuarioRepository.save(usuario);

        return ResponseEntity.ok(usuarioRegistrado);

    }
    //función para mostrar todos los usuarios registrados
    @GetMapping
    public List<Usuario> listar(){

        return usuarioRepository.findAll();
    }


}