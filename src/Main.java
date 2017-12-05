import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
      launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(this.getClass().getResource("ekspert.fxml"));
        Pane pane=loader.load();

        Scene scene =new Scene(pane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Expert Machine Heroes 3:Zamek");
        primaryStage.show();
    }
}
