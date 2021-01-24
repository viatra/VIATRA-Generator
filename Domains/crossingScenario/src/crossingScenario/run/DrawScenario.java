package crossingScenario.run;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.stream.Collectors;

import javax.imageio.ImageIO;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import crossingScenario.Actor;
import crossingScenario.CollisionExists;
import crossingScenario.CrossingScenario;
import crossingScenario.CrossingScenarioPackage;
import crossingScenario.Lane;
import crossingScenario.Lane_Horizontal;
import crossingScenario.Lane_Vertical;
import crossingScenario.Relation;
import crossingScenario.VisionBlocked;

public class DrawScenario {
	public static final int SIZE = 1000;
	
	public static void main(String[] args) throws IOException {
		for (int i = 1; i <= 10; i++) {
			drawScenario("outputs/models/"+i+".xmi", "outputs/drawnModel"+i+".png");
			System.out.println("DONE " + i);
		}
	}

	public static File drawScenario(String pathToXmi, String saveToPath) throws IOException {

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
		//origin
		g.drawRect(-5, -5, 10, 10);
		//Axes
		g.drawLine(-xSize/2, 0, xSize/2, 0);
		g.drawLine(0, -ySize/2, 0, ySize/2);
		for (Lane l : cs.getLanes()) {
			int ref = (int) ((l.getReferenceCoord() +5)* multiplier);
			if (l instanceof Lane_Horizontal) {
				g.drawLine(-xSize/2, ref, xSize/2, ref);
			}
			if (l instanceof Lane_Vertical) {
				g.drawLine(ref, -ySize/2, ref, ySize/2);				
			}
		}
		
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
			if (!cs.getRelations().stream().filter(r -> r instanceof VisionBlocked)
					.filter(r -> ((VisionBlocked) r).getBlockedBy().equals(a)).
					collect(Collectors.toList()).isEmpty())
				g.setPaint(Color.BLACK);
			else
				g.setPaint(Color.GREEN);

			g.drawRect(left, bot, width, length);
		}

		g.setPaint(Color.BLUE);
		for (Relation ce : cs.getRelations().stream().
				filter(r -> r instanceof CollisionExists).collect(Collectors.toList())) {
			Actor a1 = ce.getSource();
			Actor a2 = ce.getTarget();
			Double t = ((CollisionExists) ce).getCollisionTime();
			
			for (Actor a : new Actor[] {a1, a2}) {
				//Draw final pos
				g.setStroke(new BasicStroke(3));
				int left = (int) (((a.getXPos() + (t * a.getXSpeed()))-a.getWidth()/2) * multiplier);
				int bot = (int) (((a.getYPos() + (t * a.getYSpeed()))-a.getLength()/2) * multiplier);
				int width = (int) (a.getWidth() * multiplier);
				int length = (int) (a.getLength() * multiplier);

				
			
				//Draw line
				g.drawRect(left, bot, width, length);
				g.setStroke(new BasicStroke(1));
				int x1 = (int) (a.getXPos() * multiplier);
				int y1 = (int) (a.getYPos() * multiplier);
				int x2 = (int) ((a.getXPos() + (t * a.getXSpeed())) * multiplier);
				int y2 = (int) ((a.getYPos() + (t * a.getYSpeed())) * multiplier);
				g.drawLine(x1, y1, x2, y2);
			
			}			
		}
		g.dispose();
		
		File f = new File(saveToPath);
		try {
			ImageIO.write(image, "png", f);
		} catch (IOException e) {
			e.printStackTrace();
		}

//		Desktop.getDesktop().open(f);
		return f;
	}
}
