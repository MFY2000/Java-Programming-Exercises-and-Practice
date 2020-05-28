package Todo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    @FXML
    private VBox itemsList = null;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Node[] list = new Node[10];
        for (int i = 0; i < list.length; i++) {
            try {
                list[i] = FXMLLoader.load(getClass().getResource("ItemsList.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
//            list[i] =  new Button("My Button"+i);
            itemsList.getChildren().add(list[i]);
        }
    }

    @FXML
    private void closeButton(){
        System.out.println("Hi");
    }
}
