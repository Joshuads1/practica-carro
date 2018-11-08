/**
 * 
 */
package es.indra.aplicacioncarritocompra.beans;

/**
 * @author P.era-1
 *
 */
public class Productos extends Categorias{
	
	private int id;
	private String nombre;
	private String descripcion;
	private double precio;
	private int stock;
	
	
	
	/**
	 * 
	 */
	public Productos() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param nombre
	 * @param descripcion
	 * @param precio
	 * @param stock
	 */
	public Productos(int id, String nombre, String descripcion, double precio, int stock) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
	}
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
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	/**
	 * @return the stock
	 */
	public int isStock() {
		return stock;
	}
	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
	

}
