package clasesDatos;

public class Empleado {
	private String dni;
	private String nombre;
	private String apellidos;
	private String categ;
	private int edad;
	private boolean clubSocial; //indica si el empleado esta en el club social de la empresa
	private float sueldo;
	
	////////////////////// CONSTRUCTORES ////////////////////
	/**
	 * Constructor completo
	 * @param dni
	 * @param nombre
	 * @param apellidos
	 * @param categ
	 * @param edad
	 * @param clubSocial
	 * @param sueldo
	 */
	public Empleado(String dni, String nombre, String apellidos, String categ, int edad, boolean clubSocial,
			float sueldo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.categ = categ;
		this.edad = edad;
		this.clubSocial = clubSocial;
		this.sueldo = sueldo;
	}	

	public Empleado() {
		super();
		this.dni = "";
		this.nombre = "***************";
		this.apellidos = "************";
		this.categ = "Base";
		this.edad = 0;
		this.clubSocial = false;
		this.sueldo = (float) 0.0;

	}
}