package es.pamp.listadoclientes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button botonList =(Button) findViewById(R.id.botonList);
        botonList.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v) {
                                                 Intent i = new Intent(getApplicationContext(), MainActivity.class);
                                                 startActivity(i);

                                             }
                                         }

        );
        Button botonRecycler =(Button) findViewById(R.id.botonRecycler);
        botonRecycler.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View v) {
                                             Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                                             startActivity(i);

                                         }
                                     }

        );

    }
}
