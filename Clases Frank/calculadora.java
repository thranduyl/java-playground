package graficos;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Calculadora {

	public static void main(String[] args) {
	MarcoCalculadora mimarco = new MarcoCalculadora();
	mimarco.setVisible(true);
	mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class MarcoCalculadora extends JFrame{
	public MarcoCalculadora(){
		setTitle("Calculadora");
		setBounds(500,300,450,300);
	 	LaminaCalculadora milamina = new LaminaCalculadora();
	 	add(milamina);
	}
	
}
class LaminaCalculadora extends JPanel{
	/*constructor de LaminaCalculadora*/
	public LaminaCalculadora() {
		principio = true;
		setLayout(new BorderLayout());
		pantalla =new JButton("0");
		pantalla.setEnabled(false);
		add(pantalla, BorderLayout.NORTH);
		milamina2= new JPanel();
		milamina2.setLayout(new GridLayout(5,4));
		add(milamina2, BorderLayout.CENTER);
		ActionListener insertar= new InsertaNumero();
		ActionListener accion= new AccionOrden();
		ponerBoton("9", insertar);
		ponerBoton("8", insertar);
		ponerBoton("7", insertar);
		ponerBoton("/", accion);
		ponerBoton("6", insertar);
		ponerBoton("5", insertar);
		ponerBoton("4", insertar);
		ponerBoton("x", accion);
		ponerBoton("3", insertar);
		ponerBoton("2", insertar);
		ponerBoton("1", insertar);
		ponerBoton("-", accion);
		ponerBoton("0", insertar);
		ponerBoton(",", insertar);
		ponerBoton("=", accion);
		ponerBoton("+", accion);
		ponerBoton("Raiz", accion);
		ponerBoton("Potencia", accion);
		ponerBoton("C", accion);
		
	}
	private void ponerBoton (String rotulo, ActionListener oyente) {
		JButton boton =new JButton(rotulo);
		boton.addActionListener(oyente);
		milamina2.add(boton);
		
	}
	private class InsertaNumero implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String entrada=e.getActionCommand();
			if (principio==true) {
				pantalla.setText("");
				principio=false;
			}
			pantalla.setText(pantalla.getText()+entrada);
			
		}
		
	}
	private class AccionOrden implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String operacion=e.getActionCommand();
			calcular(Double.parseDouble(pantalla.getText()));
			ultimaOperacion = operacion;
			
			principio = true;
		    
		}
		
	}
	public void calcular(double x) {
		if (ultimaOperacion.equals("+")) {
		resultado=resultado+x;		
	    }else if(ultimaOperacion.equals("-")){
	    resultado=resultado-x;	
	    }else if(ultimaOperacion.equals("/")){
	    resultado=resultado/x;	
		}else if(ultimaOperacion.equals("x")) {
		resultado=resultado*x;	
		}else if(ultimaOperacion.equals("Raiz")) {
		resultado=Math.sqrt(x);	
		}else if(ultimaOperacion.equals("Potencia")) {
		resultado=Math.pow(resultado, x);	
		}else if(ultimaOperacion.equals("=")){
		resultado=x;	
		}else if(ultimaOperacion.equals("C")){
		resultado=0;	
		}
		pantalla.setText(Double.toString(resultado));
	}
	private JPanel milamina2;
	private JButton pantalla;
	private boolean principio;
	private double resultado=0;
	private String ultimaOperacion="=";
}