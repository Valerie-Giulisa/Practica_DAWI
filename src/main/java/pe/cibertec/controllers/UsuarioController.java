package pe.cibertec.controllers;


import org.springframework.web.bind.annotation.*;
import pe.cibertec.entities.Usuario;
import org.springframework.http.ResponseEntity;
import pe.cibertec.repository.UsuarioRepository;

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

    public ResponseEntity<Usuario> registrar(@RequestBody Usuario usuario){

        Usuario usuarioRegistrado = usuarioRepository.save(usuario);

        return ResponseEntity.ok(usuarioRegistrado);

    }
    //función para mostrar todos los usuarios registrados
    @GetMapping
    public List<Usuario> listar(){

        return usuarioRepository.findAll();
    }


}