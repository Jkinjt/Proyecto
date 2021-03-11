package menuMenus;

import java.util.List;

public interface IMenuEdicionCliente {
	//modificar nombre
	public String updateName(String Name);
	
	//modifcar dni
	public String updateDni(String dni);

	//modificar edad
	public int updateAge(int edad);
	
	//modificar puntos
	public int updatepoints(int puntos);
	
	//modificar direccion
	public List<String> updateaddres(String address);
	
}
