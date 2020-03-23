/**
 * 
 */
package EjerciciosMikel;

/**
 * @author Thranduyl
 *
 */

class circuloMain{
    public static void main(String[] args) {
        //TODO prueba los diferentes constructores y metodos de la clase circulo
    Circulo miCirculo = new Circulo();
    //System.out.println("Id del circulo "+ miCirculo.getId());
   // miCirculo.imprimirDatosCirculo();
    Circulo circulos[] = new Circulo[4];
 	/*int z=0;
    circulos[0]=miCirculo;
    circulos[1]=new Circulo(20.2);
    circulos[2]=new Circulo(3.5, "Azul");
    circulos[3]=new Circulo(9.8, "Morado");*/
    
	/*		    for (int i=0;i<circulos.length;i++) {
			    switch (z) {
			    			case 0:	
							circulos[i]=miCirculo;
							case 1:
						    circulos[i]=new Circulo(20.2);
							case 2:
						    circulos[i]=new Circulo(3.5, "Azul");
							case 3:
						    circulos[i]=new Circulo(9.8, "Morado");
					    }
			       z++;
			    }
	  */
 	
      for (int i=0;i<circulos.length;i++) {
			  if (i==0) {
			    circulos[i]=miCirculo;
			  }else if(i==1){
			    circulos[i]=new Circulo(20.2);
			  }else if(i==2) {
			    circulos[i]=new Circulo(3.5, "Azul");
			  } else if(i==3) {
			    circulos[i]=new Circulo(9.8, "Morado");
			  }
	      
	    }
 	
 	
 	
 	
			    for (Circulo j: circulos) {
			    	j.imprimirDatosCirculo();
			    }
    	}
}

