

/*		Ejercicio 12
		Pablo Barreno Kioch 14
		Santiago Solórzano  14619
		
		Clase Radio: contiene todos los atributos y metodos que conforman al radio
*/
public class BotonEstado 
{
	boolean estado;
	
	public BotonEstado()
	{
		estado = false;
	}
	
	public boolean Encender()
	{
		estado = true;
		return estado;
	}
	
	public boolean Apagar()
	{
		estado = false;
		return estado;
	}
	
	public boolean obtenerEstado()
	{
		return estado;
	}

}
