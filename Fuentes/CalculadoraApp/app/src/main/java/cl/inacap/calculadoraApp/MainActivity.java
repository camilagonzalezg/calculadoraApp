package cl.inacap.calculadoraApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText n1Txt;
    private EditText n2Txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Aqui accedo a los elementos de la interfaz

        //Obtener referencia del View que tiene el id N1_TXT
        this.n1Txt = findViewById(R.id.n1_txt);
        this.n2Txt = findViewById(R.id.n2_txt);
    }

    //metodo calcular, con una excepcion (cuando no elija ninguna, se hace expepcion)
    private double calcular(int n1, int n2, String op) throws Exception{
        double resultado=0;
        switch (op){
            case "suma": resultado = n1+n2;
            break;
            case "resta": resultado = n1-n2;
            break;
            case "multiplicacion": resultado = n1*n2;
            break;
            case "division": resultado = n1/n2;
            break;
            default: throw new Exception();
        }
        return resultado;
    }

    //METODOS DE CALCULADORA
    public void sumar(View v){
        int n1,n2;
        //se obtiene el número del Edit text
        n1=Integer.parseInt(this.n1Txt.getText().toString());
        n2=Integer.parseInt(this.n2Txt.getText().toString());
        try {
            double suma = calcular(n1, n2, "suma");
            Toast.makeText(this, "La suma es" + suma, Toast.LENGTH_LONG).show();
        } catch(Exception ex){
            Toast.makeText(this, "Error de calculo", Toast.LENGTH_LONG).show();
        }
    }

    public void restar(View v){
        int n1,n2;
        //se obtiene el número del Edit text
        n1=Integer.parseInt(this.n1Txt.getText().toString());
        n2=Integer.parseInt(this.n2Txt.getText().toString());
        try {
            double resta = calcular(n1, n2, "resta");
            Toast.makeText(this, "La resta es" + resta, Toast.LENGTH_LONG).show();
        } catch(Exception ex){
            Toast.makeText(this, "Error de calculo", Toast.LENGTH_LONG).show();
        }
    }

    public void multiplicar(View v){
        int n1,n2;
        //se obtiene el número del Edit text
        n1=Integer.parseInt(this.n1Txt.getText().toString());
        n2=Integer.parseInt(this.n2Txt.getText().toString());
        try {
            double multiplicar = calcular(n1, n2, "multiplicacion");
            Toast.makeText(this, "La multiplicacion es" + multiplicar, Toast.LENGTH_LONG).show();
        } catch(Exception ex){
            Toast.makeText(this, "Error de calculo", Toast.LENGTH_LONG).show();
        }
    }

    public void dividir(View v){
        int n1,n2;
        //se obtiene el número del Edit text
        n1=Integer.parseInt(this.n1Txt.getText().toString());
        n2=Integer.parseInt(this.n2Txt.getText().toString());
        try {
            double division = calcular(n1, n2, "division");
            Toast.makeText(this, "La division es" + division, Toast.LENGTH_LONG).show();
        } catch(Exception ex){
            Toast.makeText(this, "Error de calculo", Toast.LENGTH_LONG).show();
        }
    }

}