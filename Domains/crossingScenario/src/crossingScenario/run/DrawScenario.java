package crossingScenario.run;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import crossingScenario.Actor;
import crossingScenario.CrossingScenario;
import crossingScenario.CrossingScenarioPackage;
import crossingScenario.Lane;
import crossingScenario.Lane_Horizontal;
import crossingScenario.Lane_Vertical;

public class DrawScenario {
	public static final int SIZE = 1000;
	
	public static void main(String[] args) throws IOException {
		drawScenario("outputs/models/1.xmi");
	}

	public static File drawScenario(String pathToXmi) throws IOException {

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
		EPackage.Registry.INSTANCE.put(CrossingScenarioPackage.eNS_URI, CrossingScenarioPackage.eINSTANCE);
		ResourceSet rs = new ResourceSetImpl();
		Resource res = rs.getResource(URI.createFileURI(pathToXmi), true);

		// Initialise board
		CrossingScenario cs = ((CrossingScenario) res.getContents().get(0));
		
		double multiplier = SIZE / cs.getXSize() / 2.0;
		
		double added = SIZE / 10;
		int xSize =  SIZE;
		int xAdded = (int) (xSize  + added*2);
		int ySize =  (int) (cs.getYSize() * 2 * multiplier);
		int yAdded = (int) (ySize  + added*2);

		// initialize + basic shapes
		final BufferedImage image = new BufferedImage(xAdded, yAdded, BufferedImage.TYPE_INT_ARGB);
		final Graphics2D g = image.createGraphics();// Untested, uncompiled code

		// flip y axis
		int m = SIZE / 2;
		g.translate(xAdded/2, yAdded/2);
		g.scale(1, -1);
		
		//background
		g.setStroke(new BasicStroke(3));
		g.setPaint(Color.LIGHT_GRAY);
		g.fillRect(-xSize/2, -ySize/2, xSize, ySize);

		//lanes
		g.setPaint(Color.RED);
		g.drawRect(-5, -5, 10, 10);
		for (Lane l : cs.getLanes()) {
			int ref = (int) (l.getReferenceCoord() * multiplier);
			if (l instanceof Lane_Horizontal) {
				g.drawLine(-xSize/2, ref, xSize/2, ref);
			}
			if (l instanceof Lane_Vertical) {
				g.drawLine(ref, -ySize/2, ref, ySize/2);				
			}
		}
		
		g.setPaint(Color.GREEN);
		for (Actor a : cs.getActors()) {
			//Draw actor
			int left = (int) ((a.getXPos()-a.getWidth()/2) * multiplier);
			int bot = (int) ((a.getYPos()-a.getLength()/2) * multiplier);
			int width = (int) (a.getWidth() * multiplier);
			int length = (int) (a.getLength() * multiplier);
//			System.out.println(left);
//			System.out.println(bot);
//			System.out.println(width);
//			System.out.println(length);
//			System.out.println();
			g.drawRect(left, bot, width, length);
			
			//Draw Speed?
			
			//Draw location at collision?
		}

//		int numVars = vals.size();
//		final int numActors = (numVars - 1) / 4;
//
//		double time = 0;
//		if (!is3)
//			time = vals.get(numVars - 1);
//		else
//			time = vals.get(numVars / 2);
//
//		for (int i = 0; i < numActors; i++) {
//
//			int x = 0, y = 0, vx = 0, vy = 0;
//			if (!is3) {
//				int first = i * 4;
//				x = (int) (vals.get(first) * 100);
//				y = (int) (vals.get(first + 1) * 100);
//				vx = (int) (vals.get(first + 2) * 100);
//				vy = (int) (vals.get(first + 3) * 100);
//			} else {
//				int first = i * 2;
//				x = (int) (vals.get(first) * 100);
//				y = (int) (vals.get(first + 1) * 100);
//				vx = (int) (vals.get(first + 1 + numVars / 2) * 100);
//				vy = (int) (vals.get(first + 2 + numVars / 2) * 100);
//			}
//			g.setStroke(new BasicStroke(10));
//			g.setPaint(Color.BLACK);
//			g.drawOval(x - 2, y - 2, 4, 4);
//			boolean isEGO = (!is3 && i == 0) || (is3 && i == numActors - 2);
//			boolean isPED = (i == numActors - 1);
//			if (isEGO) {
//				// EGO
//				g.drawRect(x - 50, y - 150, 100, 300);
//				g.setPaint(Color.PINK);
//				if (acceleration)
//					g.drawRect((int) (x + (vx * time * time) - 50), (int) (y + (vy * time * time) - 150), 100, 300);
//				else
//					g.drawRect((int) (x + (vx * time) - 50), (int) (y + (vy * time) - 150), 100, 300);
//			} else if (isPED) {
//				// PED
//				g.drawRect(x - 50, y - 50, 100, 100);
//				g.setPaint(Color.PINK);
//				if (acceleration)
//					g.drawRect((int) (x + (vx * time * time) - 50), (int) (y + (vy * time * time) - 50), 100, 100);
//				else
//					g.drawRect((int) (x + (vx * time) - 50), (int) (y + (vy * time) - 50), 100, 100);
//			} else {
//				// CAR
//				g.drawRect(x - 50, y - 150, 100, 300);
//			}
//
//			g.setStroke(new BasicStroke(4));
//			g.setPaint(Color.GREEN);
//			g.drawLine(x, y, x + vx, y + vy);
//
//		}
		g.dispose();
		
		File f = new File("outputs/drawnModel.png");
		try {
			ImageIO.write(image, "png", f);
		} catch (IOException e) {
			e.printStackTrace();
		}

//		Desktop.getDesktop().open(f);
		System.out.println("finished!");
		return f;

//		CrossingScenario cs = ((CrossingScenario) res.getContents().get(0));
//
//		for (Actor o : cs.getActors()) {
//			String nodeName = "A(" + rndbl(o.getXPos(), 1) + "," + rndbl(o.getYPos(), 1) + ")";
//			printer.println(o.hashCode() + " " + nodeName);
//		}
//
//		for (Lane o : cs.getLanes()) {
//			String prefix = "";
//			if (cs.getHorizontal_head().equals(o) || cs.getVertical_head().equals(o)) {
//				prefix = "HEAD";
//			}
//			String nodeName = prefix + "L(" + rndbl(o.getReferenceCoord(), 3) + ")"
//					+ o.eClass().getName().substring(5, 9);
//			printer.println(o.hashCode() + " " + nodeName);
//		}
//		printer.println("#");
//		for (Lane o : cs.getLanes()) {
//			if (o.getPrevLane() != null) {
//				int curName = o.hashCode();
//				int curPrev = o.getPrevLane().hashCode();
//				double edgeLabel = rndbl(o.getPrevLane().getNumWidth(), 1);
//				printer.println(curName + " " + curPrev + " " + edgeLabel);
//			}
//		}
//
//		for (Actor o : cs.getActors()) {
//			int actName = o.hashCode();
//			int lanName = o.getPlacedOn().hashCode();
//			printer.println(actName + " " + lanName);
//		}
//
//		printer.flush();
//		printer.close();
//		System.out.println("TGF CREATED");

	}
}
