import javax.swing.JOptionPane;

public class Dialog {
	public static void main ( String[] args ){
		String inputValue = JOptionPane.showInputDialog("Introduce un numero");
		
		int numero = Integer.parseInt(inputValue);
		
		System.out.println("" +inputValue+ "");
		JOptionPane.showMessageDialog(null, numero*2 , "Doble del numero", JOptionPane.ERROR_MESSAGE); 
	}
}