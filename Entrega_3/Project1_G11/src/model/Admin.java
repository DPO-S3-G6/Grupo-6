package model;

import java.io.File;

public class Admin {

    private String tipo;

	public String getTipo() {
        return tipo;
    }

    //constructor de la clase Admin
    public Admin(String Tipo) {
		this.tipo = Tipo;
	}

	public String RegistroVeh() { 
		return "";
	}

    public String ModVeh() { 
		return "";
	}
    
	public String GestionSede() { 
		return ""; 
	}
	public String GestionEmple() { 
		return ""; 

	}
	public String RegistroEmple() { 
		return ""; 
	}
	public String IngresoApp() { 
		return "";
	}
}

