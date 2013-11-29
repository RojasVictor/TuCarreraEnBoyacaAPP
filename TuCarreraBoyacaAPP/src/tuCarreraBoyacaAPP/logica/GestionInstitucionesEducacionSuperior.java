/**
 * 
 */
package tuCarreraBoyacaAPP.logica;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import tuCarreraBoyacaAPP.persistencia.InstitucionesEducacionSuperiorDao;
import tuCarreraBoyacaAPP.logica.InstitucionEducacionSuperior;
/**
 * @author harold_patino
 *
 */
public class GestionInstitucionesEducacionSuperior {
//Attributes---------------------------------------
	private ArrayList<InstitucionEducacionSuperior> superiors;
	private InstitucionesEducacionSuperiorDao daoSuperior;
	
//Building-----------------------------------------
	public GestionInstitucionesEducacionSuperior(){
		superiors=new ArrayList<>();
		daoSuperior = new InstitucionesEducacionSuperiorDao();
		superiors = readInstitucionesEducacionSuperior();
	}

//Methods------------------------------------------
	/**
	 * @return the superiors institutes ArrayList
	 */
	public ArrayList<InstitucionEducacionSuperior> getSuperiors() {
		return superiors;
	}

	/**
	 * @param superiors the superiors institutes ArrayList to set
	 */
	public void setSuperiors(ArrayList<InstitucionEducacionSuperior> superiors) {
		this.superiors = superiors;
	}
	/**
	 * 
	 * @param preguntaTest
	 * @return true si la institucion fue creada correctamente
	 */
	public int createInstitucionEducacionSuperior(InstitucionEducacionSuperior iSuperior){
		int respuesta = daoSuperior.insertInstitucion(iSuperior);
		superiors = readInstitucionesEducacionSuperior();
		return respuesta;
		
	}
	/**
	 * 
	 * @return preguntasTest.clone()
	 */
	public ArrayList<InstitucionEducacionSuperior> readInstitucionesEducacionSuperior(){
		
		return (ArrayList<InstitucionEducacionSuperior>) daoSuperior.selectInstitucion();
	}
	
	/**
	 * @return the daoSuperior
	 */
	public InstitucionesEducacionSuperiorDao getDaoSuperior() {
		return daoSuperior;
	}

	/**
	 * 
	 * @param id - identificador del elemento a actualizar
	 * @param nombre - nuevo nombre a asignar en el elemento
	 * @param url - nueva URL a asignar en el elemento
	 * @return true si encontro la institucion y la logro actualizar correctamente
	 */
	public boolean updateInstitucionesEducacionSuperior(int id,String nombre,String url){
		superiors = readInstitucionesEducacionSuperior();
		InstitucionEducacionSuperior actualizar = new InstitucionEducacionSuperior(id, nombre, url);
		if(searchInstucionEducacionSuperior(id)!=null){
			for (int i=0; i<getSuperiors().size();i++){
				if(getSuperiors().get(i).getId() == id){
					daoSuperior.updateInstitucion(actualizar);
					superiors = readInstitucionesEducacionSuperior();
					return true;
				}
			}
		}
		return false;
	}
	/**
	 * 
	 * @param id - identificador del elemento a eliminar
	 * @return true - si el elemento fue eliminado satisfactoriamente del ArrayList
	 */
	public boolean removeInstitucionEducacionSuperior(int id){
		superiors = readInstitucionesEducacionSuperior();
		InstitucionEducacionSuperior elemento = searchInstucionEducacionSuperior(id);
		InstitucionEducacionSuperior busqueda;
		if(elemento != null){
			for(int i=0;i<getSuperiors().size();i++){
				busqueda = getSuperiors().get(i);
				if(busqueda.getId() == elemento.getId()){
					daoSuperior.deleteInstitucion(elemento.getId());
					superiors = readInstitucionesEducacionSuperior();
					return true;
				}
			}
		}
		return false;
	}
	/**
	 * 
	 * @param id
	 * @return la institucion que posee el id del parametro, y en caso de no existir retorna null
	 */
	public InstitucionEducacionSuperior searchInstucionEducacionSuperior(int id){
		superiors = readInstitucionesEducacionSuperior();
		InstitucionEducacionSuperior ies=new InstitucionEducacionSuperior(id, null, null);
		for(int i=0;i<getSuperiors().size();i++){
			ies=getSuperiors().get(i);
			if(ies.getId()==id){
				return ies;
			}
		}
		return null;
	}
}
