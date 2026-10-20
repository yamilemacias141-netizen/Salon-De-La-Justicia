package Principal;

import java.util.ArrayList;

import DAO.DAO;

public class App {

	public static void main(String[] args) {
		DAO miPrimerDAO = new DAO();
	
		ArrayList<String> resultado = miPrimerDAO.consultar();
		for(String n :resultado )
		{
			System.out.println(n);
		}


	}

}
