package controlador;

import modelo.Comercial;
import modelo.Ejecutivo;
import modelo.Empleado;
import modelo.Gerente;
import modelo.Mantenimiento;
import modelo.Persona;
import modelo.Tecnologia;


public class Principal {
	
	private static Empleado empleado1;
	private static Gerente gerente1;
	private static Mantenimiento mantenimiento1;
	private static Tecnologia tecnologia1;
	private static Ejecutivo ejecutivo1;
	private static Comercial comercial1;

	public static void main(String[] args) 
	{
		empleado1 =  new Empleado("Daniel Alejandro Chimbi León", 18);
	    empleado1.correr();
	    empleado1.cobrar();
	    empleado1.salario();
	    
	    gerente1 = new Gerente(" Mateo", 25);
	    gerente1.dormir();
	    gerente1.PersonasCargo();
	    gerente1.trabajo();
	    
	    mantenimiento1 =  new Mantenimiento("Jesus ", 46);
	   mantenimiento1.compro();
	    mantenimiento1.reparar();
	    mantenimiento1.herramientas();
	    
	    tecnologia1 = new Tecnologia("Santiago", 29 );
	    tecnologia1.investigar();
	    tecnologia1.ver();
	    tecnologia1.computadores();
	    
	    ejecutivo1 = new Ejecutivo(" Leonardo", 42);
	    ejecutivo1.gestiono();
	    ejecutivo1.gestion();
	    ejecutivo1.empresas();
	    
	    comercial1 = new Comercial("Paula", 56);
	    comercial1.distribuir();
	    comercial1.distri();
	    comercial1.camion();
	    
	}

}
