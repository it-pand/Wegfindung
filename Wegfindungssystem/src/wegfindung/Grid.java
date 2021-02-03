package wegfindung;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Stroke;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


class Mainui extends JPanel {
	
	private static final int TILE_SIZE = 20;
	
	private static final int GRID_COLS = 30;
	private static final int GRID_ROWS = 30;
	
	private Node[][] Grid;
	
}