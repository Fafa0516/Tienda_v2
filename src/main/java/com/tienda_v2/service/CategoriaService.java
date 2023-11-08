package com.tienda_v2.service;

import com.tienda_v2.domain.Categoria;
import java.util.List;

public interface CategoriaService {
   
    //Se obtiene un array list con todas las categorias de la tabla
    public List<Categoria> getCategorias (boolean activo); //Va a devolver un array list de objetos categoria
    
    //Se obtiene una Categoria según el Id pasado por parámetro
    public Categoria getCategoria(Categoria categoria);
    
    //Se actualiza una categoria o se inserta una nuieva...(Si no hay id es un insert)
    public void save(Categoria categoria);
    
    //Se elimina una categoria según el id pasado
    public void delete(Categoria categoria);
}
