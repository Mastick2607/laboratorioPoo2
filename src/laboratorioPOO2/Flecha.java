package laboratorioPOO2;

import javax.swing.JOptionPane;

public class Flecha {
	
	int longitud;
	String color;
	
	
	public Flecha() {
		longitud=21;
		color = "negro";
	}

	public Flecha(int logitud, String color) {
	  this.longitud= logitud;
		this.color = color;
	}
	
	public void construirFlecha() {
		
		for(int i =0; i<longitud; i++) {
			
			imprime("-");
			
		}
		imprime(">");
	}

	public void imprime(String simbolo) {
               if(color.equals("negro")) {
            	   System.out.print(simbolo);
               }else {
            	   System.err.print(simbolo);
            	   
               }		
	}
	
	
	public void imprimeEspacio() {

     
     	   System.out.println();
     	   
        		
}
	
	public void ingresarDatos() {
		
		longitud=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la longitud"));
		color=JOptionPane.showInputDialog(null, "Ingrese el color");
	};
}
