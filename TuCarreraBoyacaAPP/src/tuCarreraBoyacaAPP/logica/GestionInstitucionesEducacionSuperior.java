/**
 * 
 */
package tuCarreraBoyacaAPP.logica;

import java.util.ArrayList;

/**
 * @author harold_patino
 *
 */
public class GestionInstitucionesEducacionSuperior {
//Attributes---------------------------------------
	private ArrayList<InstitucionEducacionSuperior> superiors;
	
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
	 * 
	 * @param id
	 * @param nombre
	 * @param url
	 * @return true si encontro la institucion y la logro actualizar correctamente
	 */
	public boolean updateInstitucionesEducacionSuperior(int id,String nombre,String url){
		if(searchInstucionEducacionSuperior(id)!=null){
			
		}
		return true;
	}
	/**
	 * 
	 * @param id
	 * @return
	 */
	public boolean removeInstitucionEducacionSuperior(int id){
		return false;
	}
	/**
	 * 
	 * @param id
	 * @return la institucion que posee el id del parametro, y en caso de no existir retorna null
	 */
	public InstitucionEducacionSuperior searchInstucionEducacionSuperior(int id){
		InstitucionEducacionSuperior ies=new InstitucionEducacionSuperior();
		for(int i=0;i<getSuperiors().size();i++){
			ies=getSuperiors().get(i);
			if(ies.getId()==id){
				return ies;
			}
		}
		return null;
	}
}
