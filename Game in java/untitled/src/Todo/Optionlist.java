package Todo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.scene.control.Separator;
import javafx.scene.control.Tooltip;



public class Optionlist implements Initializable {

    private Connection con;
    private Statement sc;
    private ResultSet res;

    @FXML
    public ChoiceBox Choice;
    ObservableList<String> ChoiceList = FXCollections.observableArrayList("1","2","3");
    public ComboBox combobox;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        databaseChoicelist();
//        Choice.setTooltip(new Tooltip("Select the language"));
//
//        combobox.getItems().add("Choice 1");
//        combobox.getItems().add("Choice 2");
//        combobox.getItems().add("Choice 3");


        combobox.setItems(ChoiceList);
        combobox.setValue("MM");
    }

    private void databaseChoicelist(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/database_choicelist?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
            sc = con.createStatement();
            showdata();
        }
        catch (Exception e){
            System.out.println("Error : "+e);
        }
        System.out.println("123");
    }

    private void showdata(){

        String[] Feild = new String[10];
        try {
            String query = "select * from subjectlist";
            res = sc.executeQuery(query);
            int i=0;
            while (res.next()){
                Feild[i] = res.getString("Field");
                i++;
            }}
        catch (Exception e){
            System.out.println("Error : "+e);
        }
        ChoiceList = FXCollections.observableArrayList(Feild);
    }

}
