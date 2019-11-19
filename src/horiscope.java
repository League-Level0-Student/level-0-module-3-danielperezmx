import javax.swing.JOptionPane;

public class horiscope {
	public static void main(String[] args) {
		String symbol = JOptionPane.showInputDialog("welcome, what is your star sign?");

		if (symbol.equals("aries")) {
			JOptionPane.showMessageDialog(null,
					"Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action.");
		} else if (symbol.equals("taurus")) {
			JOptionPane.showMessageDialog(null,
					"Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature.");
		}else if (symbol.equals("gemini"))
			
JOptionPane.showMessageDialog(null, "Cerebral, chatty, loves learning and education, charming, and adventurous.");
	}
	else if (symbol.equals(""))
}