/**
 * 
 */
package tuCarreraBoyacaAPP.logica;


import java.util.ArrayList;
import tuCarreraBoyacaAPP.persistencia.InstitucionesEducacionSuperiorDao;

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
	public boolean createInstitucionEducacionSuperior(InstitucionEducacionSuperior iSuperior){
		daoSuperior.insertInstitucion(iSuperior);
		return getSuperiors().add(iSuperior);
		
	}
	/**
	 * 
	 * @return preguntasTest.clone()
	 */
	public ArrayList<InstitucionEducacionSuperior> readInstitucionesEducacionSuperior(){
		return (ArrayList<InstitucionEducacionSuperior>) superiors.clone();
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
		InstitucionEducacionSuperior actualizar = new InstitucionEducacionSuperior(id, nombre, url);
		if(searchInstucionEducacionSuperior(id)!=null){
			for (int i=0; i<getSuperiors().size();i++){
				if(getSuperiors().get(i).getId() == id){
					daoSuperior.updateInstitucion(actualizar);
					getSuperiors().get(i).setNombre(nombre);
					getSuperiors().get(i).setDireccionURL(url);
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
		InstitucionEducacionSuperior elemento = searchInstucionEducacionSuperior(id);
		InstitucionEducacionSuperior busqueda;
		for(int i=0;i<getSuperiors().size();i++){
			busqueda = getSuperiors().get(i);
			if(busqueda.getId() == elemento.getId()){
				daoSuperior.deleteInstitucion(elemento.getId());
				superiors.remove(i);
				return true;
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
