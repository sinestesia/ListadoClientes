package es.pamp.listadoclientes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import adaptadores.ClienteAdaptadorRecycler;
import modelo.Cliente;

public class Main2Activity extends AppCompatActivity {
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final List<Cliente> data = getData();

        ClienteAdaptadorRecycler adaptador = new ClienteAdaptadorRecycler(this, data);
        final RecyclerView clienteRV = (RecyclerView) findViewById(R.id.rvCliente);


        adaptador.setListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this, "Has seleccionado: " + clienteRV.getChildAdapterPosition(v) + " Nombre: " + data.get(clienteRV.getChildAdapterPosition(v)).getNombre(), Toast.LENGTH_SHORT).show();
            }
        });

        clienteRV.setAdapter(adaptador);
        clienteRV.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));

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
