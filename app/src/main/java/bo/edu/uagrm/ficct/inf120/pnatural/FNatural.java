package bo.edu.uagrm.ficct.inf120.pnatural;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FNatural extends AppCompatActivity  {
    EditText val, pos;
    Natural n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fnatural);
        val = (EditText)findViewById(R.id.E1);
        pos = (EditText)findViewById(R.id.E2);
    }
    public void eCrear(View view){
        n = new Natural();
        Toast.makeText(this,"Objeto Creado...",Toast.LENGTH_LONG).show();
    }
    public void eSetValor(View view){
        n.setValor(Integer.parseInt(val.getText().toString()));
        val.setText("");
        Toast.makeText(this,"Valor Fijado...",Toast.LENGTH_LONG).show();
    }
    public void eGetValor(View view){
        val.setText(String.valueOf(n.getValor()));
        Toast.makeText(this,"Valor Obtenido...",Toast.LENGTH_LONG).show();
    }
    public void eDigCant(View view){
        val.setText(String.valueOf(n.digCant()));
        Toast.makeText(this,"Cantida de Digitos...",Toast.LENGTH_LONG).show();
    }
    public void eDigAdd(View view){
        int dig = Integer.parseInt(val.getText().toString());
        n.digAdd(dig);
        val.setText("");
    }
    public void eSalir(View view){
       finish();
    }
}
