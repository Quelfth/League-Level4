package threads;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	static int weGood = 0;
	public static void main(String[] args){
		Robot r = new Robot();
		Robot s = new Robot();
		Robot t = new Robot();
		Robot u = new Robot();
		Robot v = new Robot();
		r.hide();
		s.hide();
		t.hide();
		u.hide();
		v.hide();
		new Thread(()->{
			r.moveTo(r.getX() - 140, r.getY());
			r.setPenColor(new Color(0, 127, 255));
			
			r.penDown();
			circle(r);
		}).start();
		new Thread(()->{
			s.moveTo(s.getX() - 70, r.getY() + 60);
			s.setPenColor(new Color(255, 255, 0));
			
			s.penDown();
			circle(s);
		}).start();
		new Thread(()->{
			t.setPenColor(new Color(0, 0, 0));
			
			t.penDown();
			circle(t);
		}).start();
		new Thread(()->{
			u.moveTo(u.getX() + 70, u.getY()+ 60);
			u.setPenColor(new Color(0, 255, 0));
			
			u.penDown();
			circle(u);
		}).start();
		new Thread(()->{
			v.moveTo(v.getX()+140, v.getY());
			v.setPenColor(new Color(255, 0, 0));
			
			v.penDown();
			circle(v);
		}).start();
	}
	
	public static void circle(Robot robo){
		for(int i = 0; i < 360; i++){
			robo.move(1);
			robo.turn(1);
		}
	}
}

