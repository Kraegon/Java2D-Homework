package C2E7;

import java.awt.Graphics2D;
import java.util.ArrayList;

public class Boss {
	int x;
    int y;
    int r;
    int theta;
	int alpha;
    ArrayList<Orb> orbs = new ArrayList<>();
    boolean forward = true;
    
	public Boss(int x, int y, int r){
		this.x = x;
		this.y = y;
		this.r = r;
		orbs = new ArrayList<Orb>();
	    	//1 SMALL ORB ORIGIN 
			orbs.add(new Orb(Math.sqrt((x*x) + (y*y)) - r,0,0,Orb.CLOCKWISE));
	    	//4 LARGE ORBS ON BORDERS
			orbs.add(new Orb(r  ,x    ,y   , Orb.ANTICLOCKWISE));
			orbs.add(new Orb(r  ,-x   ,y   ,Orb.CLOCKWISE));
			orbs.add(new Orb(r  ,x    ,-y  ,Orb.ANTICLOCKWISE));
			orbs.add(new Orb(r  ,-x ,-y  ,Orb.CLOCKWISE));
			//8 SMALL ORBS ON BORDERS
			orbs.add(new Orb(Math.sqrt((x*x) + (y*y)) - r, 2 * x, 0, Orb.CLOCKWISE));
			orbs.add(new Orb(Math.sqrt((x*x) + (y*y)) - r, -(2 * x), 0, Orb.CLOCKWISE));
			orbs.add(new Orb(Math.sqrt((x*x) + (y*y)) - r, 0, 2 * y, Orb.ANTICLOCKWISE));
			orbs.add(new Orb(Math.sqrt((x*x) + (y*y)) - r, 0, -(2*y), Orb.ANTICLOCKWISE));
			
			orbs.add(new Orb(Math.sqrt((x*x) + (y*y)) - r, -(2 * x), 2 * y, Orb.CLOCKWISE));
			orbs.add(new Orb(Math.sqrt((x*x) + (y*y)) - r, 2 * x, -(2 * y), Orb.ANTICLOCKWISE));
			orbs.add(new Orb(Math.sqrt((x*x) + (y*y)) - r, -(2 * x), -(2*y), Orb.CLOCKWISE));
			orbs.add(new Orb(Math.sqrt((x*x) + (y*y)) - r, 2*x, 2*y, Orb.ANTICLOCKWISE));
			//8 LARGE ORBS ON BORDERS
			orbs.add(new Orb(r  ,-(3 * x) - 30 ,y + 30 ,Orb.ANTICLOCKWISE));
			orbs.add(new Orb(r  ,-(3 * x) - 30,-y - 30 ,Orb.CLOCKWISE));
			orbs.add(new Orb(r  ,3 * x + 30 ,y + 30 ,Orb.ANTICLOCKWISE));
			orbs.add(new Orb(r  ,3 * x + 30 ,-y - 30 ,Orb.CLOCKWISE));
			
			orbs.add(new Orb(r  ,x + 30,  3 * y + 30 ,Orb.ANTICLOCKWISE));
			orbs.add(new Orb(r  ,-x - 30,-(3 * y) - 30 ,Orb.CLOCKWISE));
			orbs.add(new Orb(r  ,x + 30,-(3 * y) - 30 ,Orb.ANTICLOCKWISE));
			orbs.add(new Orb(r  ,-x - 30 ,3 * y + 30 ,Orb.CLOCKWISE));
	}
	public Boss(){
		x = 50;
	    y = 50;
	    r = 50;
		orbs = new ArrayList<Orb>();
    	//1 SMALL ORB ORIGIN 
		orbs.add(new Orb(Math.sqrt((x*x) + (y*y)) - r,0,0,Orb.NOROTATION));
    	//4 LARGE ORBS ON BORDERS
		orbs.add(new Orb(r  ,x    ,y   , Orb.ANTICLOCKWISE));
		orbs.add(new Orb(r  ,-x   ,y   ,Orb.CLOCKWISE));
		orbs.add(new Orb(r  ,x    ,-y  ,Orb.ANTICLOCKWISE));
		orbs.add(new Orb(r  ,-x ,-y  ,Orb.CLOCKWISE));
		//8 SMALL ORBS ON BORDERS
		orbs.add(new Orb(Math.sqrt((x*x) + (y*y)) - r, 2 * x, 0, Orb.CLOCKWISE));
		orbs.add(new Orb(Math.sqrt((x*x) + (y*y)) - r, -(2 * x), 0, Orb.CLOCKWISE));
		orbs.add(new Orb(Math.sqrt((x*x) + (y*y)) - r, 0, 2 * y, Orb.ANTICLOCKWISE));
		orbs.add(new Orb(Math.sqrt((x*x) + (y*y)) - r, 0, -(2*y), Orb.ANTICLOCKWISE));
		
		orbs.add(new Orb(Math.sqrt((x*x) + (y*y)) - r, -(2 * x), 2 * y, Orb.CLOCKWISE));
		orbs.add(new Orb(Math.sqrt((x*x) + (y*y)) - r, 2 * x, -(2 * y), Orb.ANTICLOCKWISE));
		orbs.add(new Orb(Math.sqrt((x*x) + (y*y)) - r, -(2 * x), -(2*y), Orb.CLOCKWISE));
		orbs.add(new Orb(Math.sqrt((x*x) + (y*y)) - r, 2*x, 2*y, Orb.ANTICLOCKWISE));
		//8 LARGE ORBS ON BORDERS
		orbs.add(new Orb(r  ,-(3 * x) - 30 ,y + 30 ,Orb.ANTICLOCKWISE));
		orbs.add(new Orb(r  ,-(3 * x) - 30,-y - 30 ,Orb.CLOCKWISE));
		orbs.add(new Orb(r  ,3 * x + 30 ,y + 30 ,Orb.ANTICLOCKWISE));
		orbs.add(new Orb(r  ,3 * x + 30 ,-y - 30 ,Orb.CLOCKWISE));
		
		orbs.add(new Orb(r  ,x + 30,  3 * y + 30 ,Orb.ANTICLOCKWISE));
		orbs.add(new Orb(r  ,-x - 30,-(3 * y) - 30 ,Orb.CLOCKWISE));
		orbs.add(new Orb(r  ,x + 30,-(3 * y) - 30 ,Orb.ANTICLOCKWISE));
		orbs.add(new Orb(r  ,-x - 30 ,3 * y + 30 ,Orb.CLOCKWISE));
	}
	public void update(){
		theta++;
		
		if(forward)
			alpha += 2;
		else
			alpha -= 2;
		if(alpha > 200 || alpha < -200)
			forward = !forward; 	
	}
	public void draw(Graphics2D g){
		if(forward)
	    	g.translate(alpha, 75 * Math.sin(Math.toRadians(2 * Math.PI) * alpha));
	    else
	    	g.translate(alpha, 75 * -Math.sin(Math.toRadians(2 * Math.PI) * alpha));
	    g.rotate(Math.toRadians(theta) * 3);
	    for(int i = 0; i < 13; i++){
	    	orbs.get(i).draw(g);
	    }
	    g.rotate(Math.toRadians(-theta) * 10);
	    for(int i = 13; i < 21; i++){
	    	orbs.get(i).draw(g);
	    }
	}
}
