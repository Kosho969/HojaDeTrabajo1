package radio;

/*		Ejercicio 12
		Pablo Barreno Kioch 14
		Santiago Solórzano  14619
		
		Clase Radio: contiene todos los atributos y metodos que conforman al radio
*/
public class BotonEstacion 
{
	String estacionActual;
	
	public BotonEstacion()
	{
		estacionActual = "FM";

	}
	
	public String  btnClick(String estacion)
	{
		if(estacion.equals("AM"))
		{
			estacionActual = "FM";
		}
		else if(estacion.equals("FM"))
		{
			estacionActual = "AM";
		}
		return estacionActual;
	}

}

