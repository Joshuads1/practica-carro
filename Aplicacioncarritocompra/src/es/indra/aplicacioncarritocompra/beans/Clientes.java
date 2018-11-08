/**
 * 
 */
package es.indra.aplicacioncarritocompra.beans;

/**
 * @author P.era-1
 *
 */
public class Clientes {
	
	private int id;
	private String nombre;
	private String apellidos;
	private String direccion;
	private int telefono;
	private Productos producto [];
	
	
	
	/**
	 * 
	 */
	public Clientes() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param nombre
	 * @param apellidos
	 * @param direccion
	 * @param telefono
	 * @param producto
	 */
	public Clientes(int id, String nombre, String apellidos, String direccion, int telefono, Productos[] producto) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.telefono = telefono;
		this.producto = producto;
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
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	/**
	 * @return the telefono
	 */
	public int getTelefono() {
		return telefono;
	}
	
	
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
	/**
	 * @return the producto
	 */
	public Productos[] getProducto() {
		return producto;
	}
	
	
	/**
	 * @param producto the producto to set
	 */
	public void setProducto(Productos[] producto) {
		this.producto = producto;
	}
	

}
