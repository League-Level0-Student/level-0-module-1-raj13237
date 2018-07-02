import javax.swing.JOptionPane;

public class MyAges {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("Input age");
		int old = Integer.parseInt(age);
		for(int i=1; i<=old; i++) {
			System.out.println(i);
		}
	}
}
