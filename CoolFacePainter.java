import org.code.neighborhood.*;

public class CoolFacePainter extends MuralPainter {

  public void paintCoolDude() {
    //A call to create the entire face using all the different steps.
    paintFaceOutline();
    paintFace();
    paintGlasses();
    paintMouth();
  }
  //paints the black outline of the face
  public void paintFaceOutline() {
    move();
    move();
    move();
    paintLine("black",10);
    //next line
    turnRight();
      move();
    turnRight();
    move();
    turnLeft();
    turnLeft();
    paintLine("black",3);
    turnLeft();
    turnLeft();
    move();
        move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    paintLine("black",3);
    //next line
    turnLeft();
    move();
    turnLeft();
    paintLine("black",2);
        move();
        move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
paintLine("black",2);
//paints Right long side of face
    turnRight();
    setPaint(11);
    while(hasPaint()) {
      paintMove("black");
    }
    //next line
    turnRight();
    paintLine("black",2);
    //next line
    turnRight();
        turnRight();
move();
        turnRight();
move();
    turnRight();
    paintLine("black",3);
    //next Line
        turnRight();
    turnRight();
move();
 turnRight();
move();
    turnRight();
paintLine("black",10);
    //next line
    turnRight();
        turnRight();
    move();
turnLeft();
    move();
    turnLeft();
    paintLine("black",3);
    //next line
        turnRight();
move();
        turnRight();
paintLine("black",2);
    //next line is the Left long line
   turnLeft();
    turnLeft();
    move();
    move();
    turnRight();
    setPaint(11);
    while(hasPaint()) {
      paintMove("black");
    }
}
//Paints the yellow inside of the face
public void paintFace() {
  move();
  turnRight();
  move();
  move();
  move();
  setPaint(8);
    while(hasPaint()) {
    paintMove("yellow");
    }
    //next line
  move();
  move();
  move();
  turnRight();
  move();
  turnRight();
      setPaint(12);
   while(hasPaint()) {
    paintMove("yellow");
   }
     //next line
     move();
  move();
  turnLeft();
  move();
  turnLeft();
  setPaint(14);
      while(hasPaint()) {
    paintMove("yellow");
    }
  //next line
  move();
  turnRight();
  move();
  turnRight();
  setPaint(14);
      while(hasPaint()) {
    paintMove("yellow");
    }
  // next line 
   move();
  turnLeft();
  move();
  turnLeft();
  setPaint(14);
      while(hasPaint()) {
    paintMove("yellow");
    }
  //next line
     move();
  turnRight();
  move();
  turnRight();
  setPaint(14);
      while(hasPaint()) {
    paintMove("yellow");
    }
  //next line
     move();
  turnLeft();
  move();
  turnLeft();
  setPaint(14);
      while(hasPaint()) {
    paintMove("yellow");
    }
  //next line
     move();
  turnRight();
  move();
  turnRight();
  setPaint(14);
      while(hasPaint()) {
    paintMove("yellow");
    }
  //next line
     move();
  turnLeft();
  move();
  turnLeft();
  setPaint(14);
      while(hasPaint()) {
    paintMove("yellow");
    }
  //next line
     move();
  turnRight();
  move();
  turnRight();
  setPaint(14);
      while(hasPaint()) {
    paintMove("yellow");
    }
  //next line
     move();
  turnLeft();
  move();
  turnLeft();
  setPaint(14);
      while(hasPaint()) {
    paintMove("yellow");
    }
  //next line
     move();
  turnRight();
  move();
  turnRight();
  setPaint(14);
      while(hasPaint()) {
    paintMove("yellow");
    }
  //next line
  turnLeft();
  move();
  turnLeft();
  setPaint(12);
  while(hasPaint()) {
    paintMove("yellow");
  }
  // next line
  turnRight();
  move();
  turnRight();
  move();
  setPaint(8);
  while(hasPaint()) {
    paintMove("yellow");
  }
}
  //paints the glasses on the face
public void paintGlasses() {
  turnRight();
  turnRight();
  move();
  move();
  turnLeft();
    move();
    move();
  move();
  move();
  move();
  move();
  move();
  move();
  move();
  turnLeft();
  paintLine("black",5);
  // next line
  move();
  turnRight();
  move();
  turnRight();
  paintLine("black",15);
  //next line
  turnRight();
move();
  turnRight();
  move();
  move();
  paintLine("black",5);
  // next line
  turnRight();
  move();
  move();
  turnRight();
  move();
  paintLine("black",5);
  turnLeft();
  turnLeft();
  move();
    move();
  move();
  move();
  move();
  move();
  move();
  move();
paintLine("black",5);
}
//paints the mouth and tongue of the face
  public void paintMouth() {
    turnLeft();
    move();
        move();
    move();
    move();
    move();
    move();
turnLeft();
    move();
    move();
    paintLine("black",10);
    // next line
    turnRight();
    turnRight();
    move();
    turnLeft();
    move();
    turnRight();
    paintLine("black",1);
    paintLine("maroon",8);
paintLine("black",1);
    // next line
    turnLeft();
    move();
    turnLeft();
    move();
    move();
    paintLine("black",1);
    paintLine("maroon",2);
    paintLine("red",3);
    paintLine("maroon",1);
    paintLine("black",1);
    // next line
    turnRight();
    move();
    turnRight();
    move();
    paintLine("black",1);
    paintLine("red",5);
    paintLine("black",1);
    // next line
    turnLeft();
    move();
    turnLeft();
    move();
    move();
    paintLine("black",5);
    // move painter out of the way
        move();
    move();
    move();
    turnRight();
        move();
    move();
  }







  
}