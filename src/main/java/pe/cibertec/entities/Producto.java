package pe.cibertec.entities;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Double precio;

    //control de concurrencia optimista (modificar el mismo producto)
    @Version
    private Integer version;



}
