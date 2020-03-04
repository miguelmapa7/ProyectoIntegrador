/**
  * Clase: InterfazDAO.java
  *
  * @version: 0.1
  *
  * Fecha de Creación: 4/03/2020
  *
  * Fecha de Modificación: 
  *
  * @author: 1102838994
  *
  * Copyright: CECAR
  *
  */

package edu.cecar.interfaces;

import java.util.List;

import edu.cecar.modelo.Pais;

/**
  * Interfaz generica que define las operaciones CRUD sobre
  * una tabla de una base de datos. 
  *
  */

public interface InterfazDAO<T> {
	
	String guardar(T t);
	String actualizar(T t);
	T consulta(String ... criteriosBusqueda);
	String eliminar(String ... criteriosBusqueda);
	List<T> listar();
}



