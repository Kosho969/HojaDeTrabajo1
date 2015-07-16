package radio;

/*		Ejercicio 12
		Pablo Barreno Kioch 14
		Santiago Solórzano  14619
		
		Clase Radio: contiene todos los atributos y metodos que conforman al radio
*/
public class BotonAdelante 
{
	String estacion;
	double frecuencia;
	
	
	public BotonAdelante()
	{
		estacion = "";
		frecuencia = 0.0;
	}
	
	public double Adelantar(String estacion,double Frecuencia)
	{
		if(estacion=="FM")
		{
			frecuencia = Frecuencia ;
			frecuencia += 0.2;
			if(frecuencia > 107.9)
				frecuencia = 87.9;
		}
		else if(estacion=="AM")
		{
			frecuencia = Frecuencia;
			frecuencia += 10;
			if(frecuencia > 1610)
				frecuencia = 530;
		}
		return frecuencia;
	}
}
