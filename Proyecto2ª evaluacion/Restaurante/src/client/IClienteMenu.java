package client;

public interface IClienteMenu {
	//modificar nombre
	public String updateName(String Name);
	
	//modifcar dni
	public int updateInt(int dni);

	//modificar edad
	public int updateAge(int edad);
	
	//modificar puntos
	public int updatepoints(int puntos);
	
	//modificar direccion
	public String[] updateaddres(String[] direcciones);
	
}
