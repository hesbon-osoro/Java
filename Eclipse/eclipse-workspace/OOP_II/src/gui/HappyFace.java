package gui;
import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
public class HappyFace extends Application{

	public static void main(String[] args) {
	launch(args);
	}
	public void start(Stage primaryStage)throws Exception{
	Group root=new Group();
	Scene scene=new Scene(root);
	Canvas canvas=new Canvas(600,300);
	GraphicsContext gc=canvas.getGraphicsContext2D();
	//FirstFace
	gc.strokeOval(100,50,200, 200);
	gc.fillOval(155, 100,10,20);
	gc.fillOval(230,100,10,20);
	gc.strokeArc(150,160, 100, 50,180, 180, ArcType.ROUND);
	//SecondFace
	gc.strokeOval( 400 ,50,200, 200);
	gc.fillOval( 455, 100,10, 20);
	gc.fillOval(530, 100, 10, 20);
	gc.strokeArc( 150,160, 100,50, 180,100, ArcType.OPEN);
	root.getChildren().add(canvas);
	primaryStage.setTitle("The happy Face in JavaFX");
	primaryStage.setScene(scene);
	primaryStage.show();
}
}
