import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
    // Creates mural painter to create background
MuralPainter jacob = new MuralPainter();
    
    jacob.paintBackground("navy", 16);
//creates face painter to start creating the cool face picture
CoolFacePainter ethan = new CoolFacePainter(); 
    
ethan.paintCoolDude();




    
  }
}