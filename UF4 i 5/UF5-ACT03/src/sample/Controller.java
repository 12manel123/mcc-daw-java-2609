package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    public Loteria loteria=new Loteria();
    @FXML private Button boto1;
    @FXML private Button boto2;
    @FXML private Label caja1;
    @FXML private TextField num1;
    @FXML private TextField num2;
    @FXML private TextField num3;
    @FXML private TextField num4;
    @FXML private TextField num5;
    @FXML private TextField num6;
    @FXML private TextField r1;
    @FXML private TextField r2;
    @FXML private TextField r3;
    @FXML private TextField r4;
    @FXML private TextField r5;
    @FXML private TextField r6;

    public void initialize(){
        boto2.setDisable(true);
    }

    public void sorteig(){
        boto2.setDisable(false);
        boto1.setDisable(true);
        loteria.sortejar();
    }
    public void comprovar(){

        boto1.setDisable(false);
        boolean error=true;
        int a[]=new int[6];
        try{

            a[0] = Integer.valueOf(num1.getText());
            a[1] = Integer.valueOf(num2.getText());
            a[2] = Integer.valueOf(num3.getText());
            a[3] = Integer.valueOf(num4.getText());
            a[4] = Integer.valueOf(num5.getText());
            a[5] = Integer.valueOf(num6.getText());

        }
        catch (Exception e){
            error=false;

        };
        error= loteria.setApostes(a);
        loteria.setApostes(a);

        int b[]=loteria.getAleatoris();

        if (error){
            caja1.setText("ENCERTAT: "+loteria.numeroEncerts());
            r1.setText(String.valueOf(b[0]));
            r2.setText(String.valueOf(b[1]));
            r3.setText(String.valueOf(b[2]));
            r4.setText(String.valueOf(b[3]));
            r5.setText(String.valueOf(b[4]));
            r6.setText(String.valueOf(b[5]));
        }

    }
}
