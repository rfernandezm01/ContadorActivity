import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    int contador;
    TextView contador1;
    Button Click;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        contador = 0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador1 = findViewById(R.id.contador1);
        Click = findViewById(R.id.mas1);

        Click.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                contador++;
                contador1.setText("Has clicado " + contador + " veces");
            }
        });
    }
}
