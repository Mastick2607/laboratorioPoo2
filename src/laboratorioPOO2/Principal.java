package laboratorioPOO2;

public class Principal{

	
	Flecha flecha1,flecha2,flecha3, flecha4;

	public static void main(String arg[]) {
		Principal mip = new Principal();
	
	}


	public Principal() {
		flecha1 =new Flecha();
		flecha1.construirFlecha();
        flecha1.imprimeEspacio();
        
        
    	flecha2 =new Flecha();
    	flecha2.longitud=30;
    	flecha2.color="rojo";
		flecha2.construirFlecha();
        flecha2.imprimeEspacio();
        
        flecha3 =new Flecha(50,"verde");
		flecha3.construirFlecha();
        flecha3.imprimeEspacio();
        
        flecha4=new Flecha();
        flecha4.ingresarDatos();
		flecha4.construirFlecha();
        flecha4.imprimeEspacio();
        
        
        
		
	}
}
