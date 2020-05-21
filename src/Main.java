import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("cn/crackcat/fxml/MainView.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.getIcons().add(new Image("img/logo.png"));
        primaryStage.setTitle("简单浏览器");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
