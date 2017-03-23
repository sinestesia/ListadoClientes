package es.pamp.listadoclientes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import adaptadores.ClienteAdaptador;
import modelo.Cliente;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final List<Cliente> data = getData();
        ClienteAdaptador adaptador = new ClienteAdaptador(this, R.layout.cliente,data);
        ListView clienteLV = (ListView) findViewById(R.id.clientes);
        clienteLV.setAdapter(adaptador);
        clienteLV.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Has seleccionado: " + position + " Nombre: " + data.get(position).getNombre(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    private List<Cliente> getData(){
        List<Cliente> list = new ArrayList<>();
        list.add(new Cliente("Alex",R.drawable.male,555555555));
        list.add(new Cliente("María",R.drawable.female,123456789));
        list.add(new Cliente("Luis",R.drawable.male,525355325));
        list.add(new Cliente("Sonia",R.drawable.female,000000000));
        list.add(new Cliente("Adolfo",R.drawable.male,555857345));
        list.add(new Cliente("Rocio",R.drawable.female,555612900));
        list.add(new Cliente("Clara",R.drawable.female,555975372));
        list.add(new Cliente("Antonio",R.drawable.male,555789345));
        return list;
    };
}
