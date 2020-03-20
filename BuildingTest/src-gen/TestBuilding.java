import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.Map;
import java.util.HashMap;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class TestBuilding {
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setSize(1000, 1000);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Picture pic = new Picture();
		window.add(pic);
		window.setVisible(true);
	}
}
class Picture extends JComponent{
	protected void paintComponent(Graphics g) {
		g.setColor(Color.green);
		Polygon p = new Polygon();
		int height = 50, width = 250;
		int x = 380, y = 450;
		int offset = 30;
		p.addPoint(x, y);
		p.addPoint(x - offset, y + height);
		p.addPoint(x + width - offset, y + height);
		p.addPoint(x + width, y);
		g.fillPolygon(p);
		structure s = new structure();
		g.setColor(Color.black);
		g.fillRect(460, 470, 60, 30);
		g.setColor(Color.gray);
		g.drawLine(460, 500, 520, 500);
		g.setColor(Color.black);
		if("aboveground".equals("aboveground")){
			s.setAbove(10);
			g.fillRect(460, 470 - 30 * 10, 60, 30 * 10);
		}
		else if("aboveground".equals("underground")){
			s.setUnder(10);
			g.fillRect(460, 470 + 30, 60, 30 * 10);
		}
		
		g.setColor(Color.black);
		if("underground".equals("aboveground")){
			s.setAbove(2);
			g.fillRect(460, 470 - 30 * 2, 60, 30 * 2);
		}
		else if("underground".equals("underground")){
			s.setUnder(2);
			g.fillRect(460, 470 + 30, 60, 30 * 2);
		}
		
		g.setColor(Color.red);
		g.fillRect(460, 470 - 30 * 7, 60, 30);
		
		g.setColor(Color.gray);
		g.fillRect(460, 470 - 30 * 5, 60, 30);
		
		g.setColor(Color.pink);
		g.fillRect(460, 470 - 30 * 2, 60, 30);
		
		s.addExtraWindow(2,2);
		
		s.addExtraWindow(5,1);
		
		s.addExtraWindow(7,2);
		g.setColor(Color.cyan);
		g.fillRect(490, 480, 10, 20);
		g.setColor(Color.yellow);
		g.fillRect(470, 480, 10, 10);
		for(int i = 0; i <= s.getAbove(); i++){
			g.setColor(Color.yellow);
			g.fillRect(470, 480 - 30 * i, 10, 10);
			g.setColor(Color.gray);
			g.drawLine(460, 500 - 30 * i, 520, 500 - 30 * i);
		}
		for(int i = 0; i <= s.getUnder(); i++){
			g.setColor(Color.yellow);
			g.fillRect(470, 480 + 30 * i, 10, 10);
			g.setColor(Color.gray);
			g.drawLine(460, 500 + 30 * i, 520, 500 + 30 * i);
		}
		Map extraWindow = s.getExtraWindow();
		for(int i = -s.getUnder(); i <= s.getAbove(); i++) {
			if(extraWindow.containsKey(i)) {
				int windows = Integer.parseInt(extraWindow.get(i).toString());
				g.setColor(Color.yellow);
				for(int j = 1; j <= windows; j++){
					g.fillRect(470 + 20 * j, 480 - 30 * i, 10, 10);
				}
			}
		}
	}
}
class structure{
	int above;
	int under;
	Map extraWindow = new HashMap();
	
	void setAbove(int above) {
		this.above = above;
	}
	
	int getAbove() {
		return this.above;
	}
	
	void setUnder(int under) {
		this.under = under;
	}
	
	int getUnder() {
		return this.under;
	}
	
	void addExtraWindow(int floor, int extra) {
		this.extraWindow.put(floor, extra);
	}
	
	Map getExtraWindow() {
		return this.extraWindow;
	}
}
