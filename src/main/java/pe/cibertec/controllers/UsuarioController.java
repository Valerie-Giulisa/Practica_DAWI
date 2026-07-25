package pe.cibertec.controllers;


import org.springframework.web.bind.annotation.*;
import pe.cibertec.entities.Producto;
import pe.cibertec.entities.Usuario;
import org.springframework.http.ResponseEntity;
import pe.cibertec.repository.ProductoRepository;
import pe.cibertec.repository.UsuarioRepository;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    private final UsuarioRepository usuarioRepository;
    private final ProductoRepository productoRepository;

    //Constructor para inicializar repository
    public UsuarioController(UsuarioRepository usuarioRepository, ProductoRepository productoRepository) {
        this.usuarioRepository = usuarioRepository;
        this.productoRepository = productoRepository;
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


