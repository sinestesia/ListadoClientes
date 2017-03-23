package adaptadores;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import es.pamp.listadoclientes.R;
import modelo.Cliente;

/**
 * Created by cice on 23/3/17.
 */

public class ClienteAdaptador extends ArrayAdapter<Cliente> {
    private Context contexto;
    private List<Cliente> data;


    public ClienteAdaptador(@NonNull Context context, @LayoutRes int resource, @NonNull List<Cliente> objects) {
        super(context, resource, objects);
        contexto= context;
        data=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater intflater = LayoutInflater.from(contexto);
        View row = intflater.inflate(R.layout.cliente,null);
        ImageView clienteSexo=(ImageView) row.findViewById(R.id.imageViewSexo);
        TextView  clienteNombre =(TextView) row.findViewById(R.id.nombre);
        TextView  clienteTelefono =(TextView) row.findViewById(R.id.telefono);
        clienteSexo.setImageResource(data.get(position).getSexo());
        clienteNombre.setText(data.get(position).getNombre());
        clienteTelefono.setText(Integer.toString(data.get(position).getTelefono()));
        return row;
    }
}
