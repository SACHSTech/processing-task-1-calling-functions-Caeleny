import processing.core.PApplet;

public class Sketch extends PApplet {
	

  public void settings() {
	// Background size
    size(400, 400);
  }

  // Background color
  public void setup() {
    background(67, 170, 239);
  }

  // Different shapes
  public void draw() {
	  
	// House
    fill(255, 220, 150);
    rect(40, 200, 300, 200);

    // Door
    fill(66, 69, 62);
    rect(300, 330, 40, 70);

    // Window
    fill(120, 205, 255);
    rect(210, 230, 100, 70);

    // Window 2
    fill(120, 205, 255);
    rect(70, 230, 100, 70);

    // Window 3 
    fill(120, 205, 255);
    rect(70, 320, 150, 70);

    // Roof
    fill(163, 112, 49);
    triangle(30, 200, 190, 100, 350, 200);
  
    // Sun
    fill(255, 242, 0);
    ellipse(50,50, 100, 100); 
  }

}