/**
 * 
 */
package tuCarreraBoyacaAPP.logica;

import java.util.ArrayList;
import tuCarreraBoyacaAPP.persistencia.CategoriaDao;

/**
 * @author GandalfXI
 *
 */
public class GestionCategorias {

	//Attributes---------------------------------------	
		private ArrayList<Categoria> categorias;
		private CategoriaDao categoriaDao;
		
		//Building---------------------------------------
	public GestionCategorias() {
		categoriaDao = new CategoriaDao();
		categorias = new ArrayList<Categoria>();
		categorias = readCategorias();
	}

		/**
		 * @return
		 */
		private ArrayList<Categoria> readCategorias() {
			return categoriaDao.selectCategorias();
		}

		/**
		 * @return the categorias
		 */
		public ArrayList<Categoria> getCategorias() {
			return categorias;
		}

		/**
		 * @param categorias the categorias to set
		 */
		public void setCategorias(ArrayList<Categoria> categorias) {
			this.categorias = categorias;
		}

		/**
		 * @return the categoriaDao
		 */
		public CategoriaDao getCategoriaDao() {
			return categoriaDao;
		}

		/**
		 * @param categoriaDao the categoriaDao to set
		 */
		public void setCategoriaDao(CategoriaDao categoriaDao) {
			this.categoriaDao = categoriaDao;
		}
		
		

}
