package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextArea cos;
    @FXML
    private TextField caixa1;
    @FXML
    private TextField caixa2;
    @FXML
    private Button boto1;

    private Caixer caixer =new Caixer();

    public void iniciarSesio(){
        caixer.iniciaSessio(caixa1.getText(),caixa2.getText());
        System.out.println(caixer.getMissatge());
        cos.setText();
        boto1.setVisible(true);
    }

    //boto1.setVisible(true or false);
}
