package Proyecto.Modulo1;

public class Usuario {
	
	private String nombre;
	private String usuario;
	private String clave;
    private String permisos;
    private int id_user;
    
    public Usuario(int id_user,String nombre, String usuario, String clave, String permisos) {
		this.nombre = nombre;
		this.usuario = usuario;
		this.clave = clave;
		this.permisos = permisos;
		this.id_user = id_user;
	}
    
    public Usuario() {
    	this.id_user = 10;
		this.nombre = "Jose Luis Yedra Padilla";
		this.usuario = "pepe";
		this.clave = "123";
		this.permisos = "Todos";
	}
    
    
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		if( nombre.length() >= 3 )
		{
			this.nombre = nombre;
		}
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		if(clave.length() >= 8)
		{
			this.clave = clave;
		}
		
	}
	public String getPermisos() {
		return permisos;
	}
	public void setPermisos(String permisos) {
		if(permisos == "Lectura" || permisos == "Todos")
		{
			this.permisos = permisos;
		}
	}
	public boolean loogean( String contrasena )
	{
		if(contrasena.equals(this.getClave()))
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		if( id_user > 1)
		{
			this.id_user = id_user;
		}
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", usuario=" + usuario + ", clave=" + clave + ", permisos=" + permisos
				+ ", id_user=" + id_user + "]";
	}
    
	public boolean equals( Object otro) {
		boolean valorRetorno = true;
		if(this == otro)
		{
			valorRetorno = true;
		}
		else if(otro == null)
		{
			valorRetorno = false;
		}
		else 
		{
			if (this.getClass() != otro.getClass())
			{
				valorRetorno = false;
			}
			else
			{
				//Ya se pueden comparar atributo por atributo 
				Usuario nuevoUsuario = (Usuario) otro; //Instancia una casa
				if(this.getId_user() == nuevoUsuario.getId_user())
				{
					valorRetorno = true;
				}
				else
				{
					valorRetorno = false;
				}
				
			}
		}
		return valorRetorno;
	}
	

}
