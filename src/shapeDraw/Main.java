//package shapeDraw;
//
//import javafx.animation.AnimationTimer;
//import javafx.application.Application;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.canvas.Canvas;
//import javafx.scene.canvas.GraphicsContext;
//import javafx.stage.Stage;
//
//public class Main extends Application {
//	public static void main(String[] args) {
//		new Thread(Main::launch).start();
//	}
//
//	@Override
//	public void start(Stage stage) throws Exception {
//		Group root = new Group();
//		stage.show();
//		Scene s = new Scene(root);
//		Canvas c = new Canvas();
//		root.getChildren().add(c);
//		GraphicsContext g = c.getGraphicsContext2D();
//
//		AnimationTimer loop = new AnimationTimer() {
//			@Override
//			public void handle(long time) {
//
//			}
//		};
//		loop.start();
//
//	}
//
//}
