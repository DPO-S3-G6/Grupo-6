package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App 

{

    public void ejecutarAplicacion()
	{
		System.out.println("BIENVENIDO AL SISTEMA DE RESERVA Y ALQUILER DE CARROS \n");

		boolean pedido = false;
		
		boolean continuar = true;
		
		while (continuar)
		{
			try
			{
				
				System.out.println("\nOpciones de la aplicación\n");
				System.out.println("1. Crear Uusario");
                System.out.println("2. Ingresar al sistema");
                System.out.println("3. Mostrar el menu");
				System.out.println("4. Crear una Reserva");
				System.out.println("5. Cancelar Reserva");
				System.out.println("6. Confirmar la reserva y guardar la factura");
				System.out.println("7. Salir de la aplicacion");
				
				
				int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
				
                
                if (opcion_seleccionada == 1)
				{
					
				}
                
                else if (opcion_seleccionada == 2)
				{
					
				}

                else if (opcion_seleccionada == 3)
				{
					mostrarMenu();
				}

                else if (opcion_seleccionada == 4)
				{
					
				}

                else if (opcion_seleccionada == 5)
				{
					
				}
				
                else if (opcion_seleccionada == 6)
				{
					
				}

				
				else if (opcion_seleccionada == 7)
				{
					System.out.println("Saliendo de la aplicación ...");
					continuar = false;
				}

				
				else	
				{
					System.out.println("\nPor favor seleccione una opción válida.");
				}
			}
			catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los números de las opciones.");
			}
		}

    }










    public void mostrarMenu()
	
    {
        System.out.println("\nBIENVENIDO AL SISTEMA DE RESERVA Y ALQUILER DE CARROS. \n");



    }



























    public static void main(String[] args)
	{
		App consola = new App();
		consola.ejecutarAplicacion();
	}
	
	
	
	public String input(String mensaje)
	{
		try
		{
			System.out.print(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		}
		catch (IOException e)
		{
			System.out.println("Error leyendo de la consola");
			e.printStackTrace();
		}
		return null;
	}

}
