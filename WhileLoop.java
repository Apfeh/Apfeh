import javax.swing.JOptionPane;
public class WhileLoop
{
	public static void main(String[] args)
	{
		int num = 1;
		String name = JOptionPane.showInputDialog("What is your name?");
		String message =String.format("Welcome to Programming %s.", name);
		JOptionPane.showMessageDialog(null, message);
	}
}