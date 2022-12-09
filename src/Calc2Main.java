import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Calc2Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent Tela = FXMLLoader.load(
                getClass().getResource("CALC2.fxml")
        );
        primaryStage.setTitle("Calculadora2");
        primaryStage.setScene( new Scene(Tela));
        primaryStage.show();

    }
}