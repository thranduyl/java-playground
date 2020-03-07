/**
 * 
 */
package graficos;
/*awt para trabajar con imagenes y graficos*/
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
/*paquete para entrada y salida de imagenes*/
import javax.imageio.*;
/*paquete para trabajar con ficheros*/
import java.io.*;
/**
 * @author Thranduyl
 *
 */
public class PruebaImagenes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MarcoImagen mimarco = new MarcoImagen();
    //mimarco.getDefaultCloseOperation()
    mimarco.setVisible(true);
    
    mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
/*clase MarcoImagen que hereda de JFrame*/
class MarcoImagen extends JFrame{
	/*Genero su constructo*/
	public MarcoImagen() {
	/*con los metodos setTitle le doy titulo a la ventana*/	
	setTitle("Marco con Imagenes");
	/*setBounds me permite dar tamaño y la ventana*/
	setBounds(750,300,300,200);
	/*declaro un objeto de la clase LaminaConImagen*/
	LaminaConImagen milamina = new LaminaConImagen();
	add(milamina);
	}
}
/*creo la clase LaminaConImagen que hereda de JPanel*/
class LaminaConImagen extends JPanel{
	
	/*Sobre escribo el metodo*/
	public void paintComponente(Graphics g) {
		/*Ejecuta el metodo original de la clase JPanel... antes de ejecutar cualquier codigo*/
		super.paintComponent(g);
		File miimagen= new File("/src/graficos/House-Stark.png");
		
		try {
		//imagen=ImageIO.read(new File("/src/graficos/House-Stark.png"));
		imagen=ImageIO.read(miimagen);

		//System.out.println("Imprime");
		}
		catch(IOException e) {
			System.out.println("La imagen no se encuentra");
		}
		
		//g.drawImage(imagen, 5, 5, null/*observer*/);
	
	}
	
	
	private Image imagen;
	
}