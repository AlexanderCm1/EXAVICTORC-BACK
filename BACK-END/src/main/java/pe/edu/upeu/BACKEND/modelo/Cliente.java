package pe.edu.upeu.BACKEND.modelo;

public class Cliente {
	private int idcliente;
	private int dni;
	private String nombre;
	private String fechanac;
	private String sexo;
	private String observacion;
	public Cliente() {

	
	}
	public Cliente(int idcliente, int dni, String nombre, String fechanac, String sexo, String observacion) {
		super();
		this.idcliente = idcliente;
		this.dni = dni;
		this.nombre = nombre;
		this.fechanac = fechanac;
		this.sexo = sexo;
		this.observacion = observacion;
	}
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFechanac() {
		return fechanac;
	}
	public void setFechanac(String fechanac) {
		this.fechanac = fechanac;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	
	
}
