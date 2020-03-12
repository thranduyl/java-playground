/**
 * 
 */
package graficos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

/**
 * @author Thranduyl
 *
 */
public class CambioEstado {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoEstado miMarco = new MarcoEstado();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
class MarcoEstado extends JFrame{
	public MarcoEstado() {
		setVisible(true);
		setBounds(300,300,500,350);
		setTitle("Cambios de estado");
		CambiaEstado nuevo_estado = new CambiaEstado();
	
		addWindowStateListener(nuevo_estado);
		
		
	}
}


class CambiaEstado implements WindowStateListener {
	
	@Override
	/*Mi pregunta es... windowStateChanged(WindowEvent e) cuando capturo el evento addWindowStateListener capturo el evento
	y le paso el objeto a windowStateChanged ??? que esta escuchando el cambio de estado? Es correcto?? por tanto
el objeto nuevo_estado es de tipo WindowEvent porque implementa la interfaz WindowStateListener???	*/
	public void windowStateChanged(WindowEvent e) {
		System.out.println("La ventana ha cambiado de estado");
		System.out.println(e.getOldState());
		System.out.println(e.getNewState());
	}
	
	