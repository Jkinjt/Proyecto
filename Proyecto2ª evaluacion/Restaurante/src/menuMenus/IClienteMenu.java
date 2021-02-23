package client;

public interface IClienteMenu {
	//recibe un string de nombre y devuelve un string
	public String updateName(String Name);
	
	//recibe un dni y devuelve el int 
	public int updateInt(int dni);

	//recibe un dni y devuelve el int 
	public int updateAge(int edad);
	
	//recibe un dni y devuelve el int 
	public int updatepoints(int puntos);
	
	//recibe una lista de direcciones y devuelve una lista nueva
	public String[] updateaddres(String[] direcciones);
	
}
