/**
 * 
 */
package EjerciciosMikel;

/**
 * @author Thranduyl
 *
 */
/**
 * La clase circulo representa un circulo con radio y color.
 */

public class Circulo {  // Guardar como"Circle.java"
   // TODO Instancias de atributos privados del circulo, no accesibles desde fuera de la clase
   
   // TODO constructores (sobrecargados)
   /** Constructor para crear una instancia de un circulo con el radio y el color por defecto */
   public Circulo() {  
   // TODO Definir atributos del para el constructor
	   radio=7.5;
	   color="Turquesa";
	   id=contador+1;
	   contador++;

   }
   
   /** Constructor para crear una instancia de un circulo con un radio por parametro y el color por defecto */
   public Circulo(double r) {  
   // TODO Definir atributos del para el constructor
	   this.radio=r;
	   color="Turquesa";
	   id=contador+1;
	   contador++;
   }
   
   /** Constructor para crear una instancia de un circulo con un radio y un color por parametro */
   public Circulo(double r, String color) {  
   // TODO Definir atributos del para el constructor
	   radio=r;
	   this.color=color;
	   id=contador+1;
	   contador++;

   }

   /** Getter del radio */
   public double getRadio() {
   // TODO devuelve el radio
	   return radio;
   }
   
   /** Getter del color */
   public String getColor() {
   // TODO devuelve el radio
	   return color;
   }

   /** Getter del area del circulo*/
   public double getArea() {
   // TODO devuelve el area
	   area=Math.PI*Math.pow(radio, 2);
	   return area;
   }
   
   public double getPerimetro() {
	   // TODO devuelve el perimetro
	   perimetro=2*Math.PI*radio;
	   return perimetro;
  }
   
   public double getDiametro() {
	   // TODO devuelve el perimetro
	   diametro=2*radio;
	   return diametro;
  }
   
  public int getId() {
	   // TODO devuelve el perimetro
	 
	   return id;
  }

   /** Metodo para imprimir circulo */
   public void imprimirDatosCirculo() {
   /**  TODO imprime los circulos con el siguiente formato 
   * <Identificador objeto> :
   * Color: <color>
   * Radio/Area: <radio>/<area>
   **/
	 
	   /*System.out.println("Id :"+id+"\n"+
               "Color :"+getColor()+"\n"+
               "Radio :"+getRadio()+"\n"+
					 "Diametro :"+Math.round(getDiametro()*100d)+"\n"+
					 "Area :"+ getArea()+"\n"+
					 "Perimetro :"+ getPerimetro());
	   */
	    	  System.out.println("Id :"+id+"\n"+
                             "Color :"+getColor()+"\n"+
                             "Radio :"+getRadio()+"\n"+
   							 "Diametro :"+String.format("%.2f", getDiametro())+"\n"+
   							 "Area :"+String.format("%.2f", getArea())+"\n"+
   							 "Perimetro :"+String.format("%.2f", getPerimetro()));
   }
   
   
 
   
   private double radio;
   private double area;
   private double perimetro;
   private double diametro;
   private String color;
   private int id;
   private static int contador=0;
   
}