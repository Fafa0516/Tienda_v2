package com.tienda_v2.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="categoria") //Que la clase Categoria mapea a la tabla categoria
public class Categoria implements Serializable{
    
    private static final long serialVersionUID = 1L; //Esto es para asiganrle los valores a la constante idCategoria
    
    @Id //Se identifica que idCategoria se usa como identificador
    @GeneratedValue(strategy = GenerationType.IDENTITY) //La generación de los valores va a ser tomado de la identidad
    @Column(name ="id_categoria") //Se le dice que id_categoria está asociado a idCategoria, no es totalmente necesario
    private Long idCategoria;
    private String descripcion;
    private String rutaImagen;
    private boolean activo;

    public Categoria() {
    }
    
    public Categoria(String descripcion, Boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }
    
    
}
