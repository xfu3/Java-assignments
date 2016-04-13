package assignment08;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.function.Consumer;

import javax.swing.event.MouseInputAdapter;

// Structure proposed by lead Java 8 developer Brian Goetz on
// http://stackoverflow.com/questions/21833537/java-8-lambda-
// expressions-what-about-multiple-methods-in-nested-class

public class MouseListenerFactory extends MouseInputAdapter {
	static MouseListener mouseClickedHandler(Consumer<MouseEvent> c) {
		return new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				c.accept(e);
			}
		};
	}

	static MouseMotionListener mouseMovedHandler(Consumer<MouseEvent> c) {
		return new MouseAdapter() {
			public void mouseMoved(MouseEvent e) {
				c.accept(e);
			}
		};
	}
}


