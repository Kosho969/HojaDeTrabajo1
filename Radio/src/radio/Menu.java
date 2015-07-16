package radio;

/*		Ejercicio 1
		Pablo Barreno Koch 14
		Santiago Solórzano  14619
		Pablo Barreno Kioch 14
		Santiago Sol�rzano  14619
		
		Clase Menu: Main. El controlador del radio
*/
import java.util.Scanner;
public class Menu 
{
	private static Scanner teclado;

	public static void main(String[] args)
	{
		teclado = new Scanner(System.in);
		Radio MiRadio = new Radio();
		int botonGuardarElegido,opcionMenu=0;
		
		while(opcionMenu != 7 )
		{
			System.out.println("RADIO \n 1. Prende el radio \n 2. Cambia de AM a FM a AM \n 3. Avanzar en el dial de las emisoras. Al llegar al final del dial inicia nuevamente. \n 4. Permite guardar una emisora en uno de los 12 botones \n 5. Permite seleccionar la emisora puesta en un bot�n \n 6. Apagar el radio \n 7.Salir del programa ");
			
			opcionMenu = teclado.nextInt();
			
			if(opcionMenu == 1)
			{
				MiRadio.Encender();
				System.out.println("Estoy encendido");
			}
			
			else if(opcionMenu == 2)
			{
				if(MiRadio.obtenerEstado() != false)
				{
										
					System.out.println("El radio estaba en "+ MiRadio.obtenerEstacion());
					MiRadio.establecerEstacion(MiRadio.btnEstacion.btnClick(MiRadio.obtenerEstacion()));
					System.out.println("El radio esta ahora en "+ MiRadio.obtenerEstacion());
				}
			}
			
			else if (opcionMenu == 3)
			{
				if(MiRadio.obtenerEstado() != false)
				{
									
					System.out.println("El radio estaba en "+ MiRadio.obtenerFrecuencia() + " " + MiRadio.obtenerEstacion());
				
					 MiRadio.establecerFrecuencia(MiRadio.btnForward.Adelantar(MiRadio.obtenerEstacion(), MiRadio.obtenerFrecuencia()));
	
					System.out.println("El radio esta ahora en "+ MiRadio.obtenerFrecuencia() + " " + MiRadio.obtenerEstacion());
				}
			
			}
			else if(opcionMenu == 4)
			{
				if(MiRadio.obtenerEstado() != false)
				{
					System.out.println("Ingrese el numero de boton en el que desea guardar la emisora actual <1-12>");
					botonGuardarElegido = (teclado.nextInt()) - 1;
					MiRadio.listaGuardados[botonGuardarElegido].Guardar(MiRadio.obtenerEstacion(), MiRadio.obtenerFrecuencia());
					System.out.println("Listo se guardo en el slot " + botonGuardarElegido + " la emisora " + MiRadio.obtenerEstacion() + MiRadio.obtenerFrecuencia());
			
				}
			}
			
			else if(opcionMenu == 5)
			{
				if(MiRadio.obtenerEstado() != false)
				{
					System.out.println("Ingrese el numero de boton en el que desea cargar la emisora <1-12>");
					botonGuardarElegido = teclado.nextInt();
					MiRadio.establecerFrecuencia(MiRadio.listaGuardados[botonGuardarElegido].CargarFrecuencia());
					MiRadio.establecerEstacion(MiRadio.listaGuardados[botonGuardarElegido].CargarEstacion());
				}
			}
			else if(opcionMenu == 6)
			{
				MiRadio.Apagar();
				System.out.println("Estoy Apagado");
			}
		}
	}
}
