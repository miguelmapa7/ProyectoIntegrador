/**
  * Clase: ControladorPaisDAO.java
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

package edu.cecar.controlador;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;



import edu.cecar.componentesReutilizables.ConectarMySQL;
import edu.cecar.interfaces.InterfazDAO;
import edu.cecar.modelo.Pais;

/**
  * Clase que controla las operaciciones CRUD sobre la tabla
  * Paises
  *
  */

public class ControladorPaisDAO 
				implements InterfazDAO<Pais> {
	
	private String nombreTabla = "paises";

	public String guardar(Pais Pais) {
		
		String resultado  = "OK";
		try {
			PreparedStatement preparedStatement 
			= ConectarMySQL.getConexion().prepareStatement("insert into" + nombreTabla + " values (?,?,?)");
			
			preparedStatement.setString(1, Pais.getNombre());
			preparedStatement.setString(2, Pais.getCapital());
			preparedStatement.setString(3, Pais.getContinente());
			preparedStatement.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}

	public String actualizar(Pais Pais) {
		// TODO Auto-generated method stub
		return null;
	}

	public Pais consulta(String... criteriosBusqueda) {
		// TODO Auto-generated method stub
		return null;
	}

	public String eliminar(String... criteriosBusqueda) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Pais> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}



