package pe.cibertec.entities;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "items_lista")
public class ItemLista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nombreProducto;
    private Integer cantidad;
    private String estado;




}
