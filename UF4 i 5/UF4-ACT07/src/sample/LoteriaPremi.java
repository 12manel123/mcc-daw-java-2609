package sample;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.Random;
public class LoteriaPremi extends Loteria{


    int[] boaparalaniña ;

    int e;
    @Override
    public void sortejar() {
        Random random = new Random();
        e=random.nextInt(10);
        super.sortejar();

    }

    public int getE() {
        return e;
    }
    boolean encertat;

    @Override

    int numeroEncerts() {
        encertat = false;
        boaparalaniña = apostes;
        for (int i = 0; i < boaparalaniña.length; i++) {
            if (e== boaparalaniña[i]%10){
                encertat = true;
            }
        }
        return super.numeroEncerts();

    }

    public boolean isEncertat() {
        return encertat;
    }
}
