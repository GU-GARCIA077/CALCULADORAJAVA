import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

public class Controllercalc2 {
    @FXML
    Button  BTLIMPA, BTSOMA, BTSUB, BTMULT, BTDIV;
    @FXML
    TextField TEXTFIELD1, TEXTFIELD2, TEXTRESULT;
@FXML
    private void initialize(){
        TEXTRESULT.setEditable(false);
        BTLIMPA.setOnAction(event ->{
            Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Calculadora2");
            alert.setHeaderText("confirme a operação");
            alert.setContentText("deseja limpar todos os dados?");
            if (alert.showAndWait().get().equals(ButtonType.OK)){
                TEXTFIELD1.setText("");
                TEXTFIELD2.setText("");
                TEXTRESULT.setText("");
                TEXTFIELD1.requestFocus();
                System.out.println("AINNN limpa a calculadorinha limpa!");
            }
            alert=null;
        } );
        BTSOMA.setOnAction(event -> {
            TEXTRESULT.setText(TratandoResultado(calc(Tipo.SOMAR)));
        });
        BTSUB.setOnAction(event -> {
            TEXTRESULT.setText(TratandoResultado(calc(Tipo.SUBTRAIR)));
        });
        BTMULT.setOnAction(event -> {
            TEXTRESULT.setText(TratandoResultado(calc(Tipo.MULTIPLICAR)));
        });
        BTDIV.setOnAction(event -> {
            TEXTRESULT.setText(TratandoResultado(calc(Tipo.DIVIDIR)));
        });

    }
    private Float TrataValor(String valor){return Float.parseFloat(valor.replace(',','.'));}
    private String TratandoResultado(Float valor) {
        return String.format("R$ %.2f", valor);
    }
    private Float calc(Tipo operacao){
    Float v1=TrataValor(TEXTFIELD1.getText());
    Float v2= TrataValor(TEXTFIELD2.getText());
     switch (operacao){
         case SOMAR: return v1+v2;
         case SUBTRAIR:return v1-v2;
         case MULTIPLICAR:return v1*v2;
         case DIVIDIR: return v1/v2;
     }
        Default:return null;

    }
}


