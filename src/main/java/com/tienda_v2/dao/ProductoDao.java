package com.tienda_v2.dao;

import com.tienda_v2.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductoDao extends 
        JpaRepository<Producto, Long>{
    
    
    //Método que usa Query un listado de producto filtrado por precio, ordenado por descripcion
    public List<Producto> findByPrecioBetweenOrderByDescripcion (double precioInf, double precioSup);
    

    //Método que usa JPQL un listado de producto filtrado por precio, ordenado por descripcion
    @Query(value="Select a from Producto a where a.precio between :precioInf and :precioSup order by a.descripcion asc")
    public List<Producto> consultaJPQL (double precioInf, double precioSup);
    
    //Método que usa SQL un listado de producto filtrado por precio, ordenado por descripcion
    @Query(nativeQuery= true, value="Select * from Producto a where a.precio between :precioInf and :precioSup order by a.descripcion asc")
    public List<Producto> consultaSQL (double precioInf, double precioSup);
    
}
