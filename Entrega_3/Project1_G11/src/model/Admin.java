package model;

import java.io.File;

public class Admin implements User {

    private String tipo;

	public String getTipo() {
        return tipo;
    }

    //constructor de la clase Admin
    public Admin(String Tipo, String string) {
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

	@Override
	public String getNombreCompleto() {
		throw new UnsupportedOperationException("Unimplemented method 'getNombreCompleto'");
	}

	@Override
	public String getLogin() {
		throw new UnsupportedOperationException("Unimplemented method 'getLogin'");
	}

	@Override
	public String getContraseña() {
		throw new UnsupportedOperationException("Unimplemented method 'getContraseña'");
	}
}

