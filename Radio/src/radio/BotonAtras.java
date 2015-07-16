
/*		Ejercicio 12
		Pablo Barreno Kioch 14
		Santiago Solórzano  14619
		
		Clase Radio: contiene todos los atributos y metodos que conforman al radio
*/
public class BotonAtras {
	String estacion;
	double frecuencia;
	
	public BotonAtras()
	{
		estacion = "";
		frecuencia = 0.0;
	}
	public double  Regresar(String estacion, double Frecuencia )
	{
		if(estacion=="FM")
		{
			frecuencia = Frecuencia;
			frecuencia -= 0.2;
			if(frecuencia < 87.9)
				frecuencia = 107.9;
		}
		if(estacion=="AM")
		{
			frecuencia = Frecuencia;
			frecuencia -= 10;
			if(frecuencia < 530)
				frecuencia = 1610;
		}
		return frecuencia;
	}

}
