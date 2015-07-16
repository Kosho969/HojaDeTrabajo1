package radio;

/*		Ejercicio 1
		Pablo Barreno Koch 14
		Santiago Solórzano  14619
		
		Clase Radio: contiene todos los atributos y metodos que conforman al radio
*/
public class BotonGuardados 
{
	String estacion;
	double frecuencia;
	
	public BotonGuardados()
	{
		estacion="";
		frecuencia=0.0;
		
	}
	
	public void Guardar(String Estacion, double Frecuencia)
	{
		estacion=Estacion;
		frecuencia=Frecuencia;
	}
	public String CargarEstacion()
	{
		return estacion;

	}
	public double CargarFrecuencia()
	{
		return frecuencia;
	}
}
