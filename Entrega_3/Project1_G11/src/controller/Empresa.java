package controller;

import java.util.ArrayList;
import java.util.List;

import model.Admin;

public class Empresa {

    private List<Admin> administradores;

    public void validarU() {
		administradores = new ArrayList<Admin>();
		cargarUsuarios();
	}
	private void cargarUsuarios() {
		Admin administrador= new Administrador("admin1","1234");
		administradores.add(administrador);
	}
    public boolean validarCedencialesAdmin(String login,String contraseña) {
		System.out.println(administradores.size());
		boolean encontre=false;
		for (int i=0;i<administradores.size();i++) {
			System.out.println(login);
			System.out.println(administradores.get(i).getLogin());
			if (administradores.get(i).getLogin().equals(login) ) {
				if (administradores.get(i).getContraseña().equals(contraseña)) {
					encontre=true;
				}
			}
		}
		return encontre;
	}


}
