package ejerccio04;

public class Contacto {

	private String nombre;
	private String telefono;
	private int id;
	
	public Contacto(String nombre, String telefono, int id) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
