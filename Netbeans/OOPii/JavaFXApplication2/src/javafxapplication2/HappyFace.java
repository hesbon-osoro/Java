
package javafxapplication2;


import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
public class HappyFace extends Application{

	public static void main(String[] args) {
	launch(args);
	}
        @Override
	public void start(Stage primaryStage)throws Exception{
	Group root=new Group();
	Scene scene=new Scene(root,500,500,Color.BLACK);
	Canvas canvas=new Canvas(width: 600, height: 300);
	GraphicsContext gc=canvas.getGraphicsContext2D();
	//FirstFace
	gc.strokeOval(x: 100 ,y: 50, w: 200, h: 200);
	gc.fillOval(x: 155, y: 100, w: 10, h: 20);
	gc.fillOval(x: 230, y: 100, w: 10, h: 20);
	gc.strokeArc(x: 150, y: 160, w: 100, h: 50, startAngle: 180, arcExtent: 180, ArcType.ROUND);
	//SecondFace
	gc.strokeOval(x: 400 ,y: 50, w: 200, h: 200);
	gc.fillOval(x: 455, y: 100, w: 10, h: 20);
	gc.fillOval(x: 530, y: 100, w: 10, h: 20);
	gc.strokeArc(x: 150, y: 160, w: 100, h: 50, startAngle: 180, arcExtent: 100, ArcType.OPEN);
	root.getChildren().add(canvas);
	primaryStage.setTitle("The happy Face in JavaFX");
	primaryStage.setScene(scene);
	primaryStage.show();
}
