
package javafxapplication2;
import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class Main extends Application {
@Override 
public void start(Stage stage) 
{ Group root = new Group(); // the root is Group or Pane 
Scene scene = new Scene(root, 500, 500, Color.BLACK);
stage.setTitle("JavaFX Demo"); 
stage.setScene(scene); stage.show(); }

public static void main(String[] args) 
{ 
    launch(args);
}
}

