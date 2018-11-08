/**
 * 
 */
package es.indra.aplicacioncarritocompra.beans;

/**
 * @author P.era-1
 *
 */
public class Categorias {

	
	private int id;
	private String nombre;
	private Productos [] productos;
	
	
	
	/*
	 * 							CONSTUCTORES 							*
	 */

	public Categorias() {
		super();
		
	}


	/**
	 * @param id
	 * @param nombre
	 * @param productos
	 */
	public Categorias(int id, String nombre, Productos[] productos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.productos = productos;
	}

	/*
	 * 							METODOS SET Y GET 							*
	 */

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	/**
	 * @return the productos
	 */
	public Productos[] getProductos() {
		return productos;
	}
	
	
	/**
	 * @param productos the productos to set
	 */
	public void setProductos(Productos[] productos) {
		this.productos = productos;
	}
	
	
}
