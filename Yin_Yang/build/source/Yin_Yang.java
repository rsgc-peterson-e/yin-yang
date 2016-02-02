import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Yin_Yang extends PApplet {
  public void setup() {

// create a canvas

background(255);
noStroke(); // take away black lining from shapes drawn
float circleX = width/2; //create variables to store values for the circles being drawn to create the Yin Yang
float circleY = height/2;
float diameter = width; // make diameter half of screen width
float smallerDiameter = diameter/2;
float smallerRadius = smallerDiameter/2;
float circleY1 = circleY + smallerRadius;
float circleY2 = circleY - smallerRadius;


// create a circle
fill(0);
ellipse(circleX, circleY, diameter, diameter);

//create rectangle to split circle in half to help create Yin Yang
fill(255);
rect(0, 0, width/2, height);

fill(0); //set fill color to black for following shapes
ellipse(circleX, circleY1, smallerDiameter, smallerDiameter);

fill(255); //set fill color to white to make the following shapes drawn that color
ellipse(circleX, circleY2, smallerDiameter, smallerDiameter); //this creates a second circle directly above the last we drawed creating the yin yang shape
ellipse(circleX, circleY1, smallerDiameter/3, smallerDiameter/3); // divide by 3 to draw smaller white circle serving as the eye

fill(0);
ellipse(circleX, circleY2, smallerDiameter/3, smallerDiameter/3); //draw the other eye on the oppisite side of the Yin yang in black

//draw  non filled circle with stroke to create exterior of the Yin yang
stroke(0);
noFill();
strokeWeight(2);
ellipse(circleX, circleY, diameter, diameter);
    noLoop();
  }

  public void settings() { 
size(200, 200); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Yin_Yang" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
