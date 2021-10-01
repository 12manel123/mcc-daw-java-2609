package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML private TextArea cos;
    @FXML private TextArea cos1;
    @FXML private TextField caixa1;
    @FXML private TextField caixa2;
    @FXML private TextField caixa3;
    @FXML private Label etiqueta1;
    @FXML private Label etiqueta2;
    @FXML private Label etiqueta3;
    @FXML private Label etiqueta4;
    @FXML private Label etiqueta5;
    @FXML private Button boto1;
    @FXML private Button boto2;
    @FXML private Button boto3;
    @FXML private Button boto4;
    @FXML private Button boto5;

    @FXML private Button b10;
    @FXML private Button b20;
    @FXML private Button b50;

    private Caixer caixer =new Caixer();

    public void initialize(){
        boto2.setVisible(false);
        boto3.setVisible(false);
        boto4.setVisible(false);
        boto5.setVisible(false);
        etiqueta3.setVisible(false);
        etiqueta4.setVisible(false);
        etiqueta5.setVisible(false);
        cos1.setVisible(false);
        caixa3.setVisible(false);
        b10.setVisible(false);
        b20.setVisible(false);
        b50.setVisible(false);
    }

    public void iniciarSesio(){
        caixer.iniciaSessio(caixa1.getText(),caixa2.getText());
        cos.setText(caixer.getMissatge());
        if (caixer.getUsuariActiu()!=-1){
            cos.setText("Benvingut "+caixer.getNomUsuari());
            boto1.setVisible(false);
            caixa1.setVisible(false);
            caixa2.setVisible(false);
            etiqueta1.setVisible(false);
            etiqueta2.setVisible(false);
            etiqueta3.setVisible(true);
            boto2.setVisible(true);
            boto3.setVisible(true);
            boto4.setVisible(true);
            boto5.setVisible(true);
            etiqueta4.setVisible(true);
            etiqueta5.setVisible(true);
            cos1.setVisible(true);
            caixa3.setVisible(true);
            b10.setVisible(true);
            b20.setVisible(true);
            b50.setVisible(true);
        }

    }
    public void sortir(){
        initialize();
            caixer.setUsuariActiu(-1);
        boto1.setVisible(true);
        caixa1.setVisible(true);
        caixa2.setVisible(true);
        etiqueta1.setVisible(true);
        etiqueta2.setVisible(true);
        etiqueta3.setVisible(false);
        boto2.setVisible(false);
        boto3.setVisible(false);
        boto4.setVisible(false);
        boto5.setVisible(false);
        etiqueta4.setVisible(false);
        etiqueta5.setVisible(false);
        cos1.setVisible(false);
        caixa3.setVisible(false);
        b10.setVisible(false);
        b20.setVisible(false);
        b50.setVisible(false);
        cos.setText("Fins aviat!");
    }
    public void consultasaldo(){
        cos.setText(String.valueOf(caixer.consultaSaldoUsuari()));
    }
    public void sum10(){
        caixa3.setText(String.valueOf(Integer.parseInt(caixa3.getText())+10));
    }
    public void sum20(){
        caixa3.setText(String.valueOf(Integer.parseInt(caixa3.getText())+20));
    }
    public void sum50(){
        caixa3.setText(String.valueOf(Integer.parseInt(caixa3.getText())+50));
    }
    public void ingresdiners(){
        caixer.ingressarDinersUsuari(Integer.parseInt(caixa3.getText()));
        caixa3.setText("0");
    }
    public void treurediners(){
        caixer.retirarDinersUsuari(Integer.parseInt(caixa3.getText()));

        int b10=0,b20=0,b50=0;
        while (Integer.parseInt(caixa3.getText())!=0){
            if (Integer.parseInt(caixa3.getText())>=50){
                b50++;
                caixa3.setText(String.valueOf(Integer.parseInt(caixa3.getText())-50));
            }
            else{
                if (Integer.parseInt(caixa3.getText())>=20){
                    b20++;
                    caixa3.setText(String.valueOf(Integer.parseInt(caixa3.getText())-20));
                }
                else{
                        b10++;
                        caixa3.setText(String.valueOf(Integer.parseInt(caixa3.getText())-10));

                }
            }
        }


        cos.setText("50: "+b50+ "." +
                " 20: "+b20+"." +
                " 10: "+b10+".");


        caixa3.setText("0");
    }


    //boto1.setVisible(true or false);
}
