package mx.com.encargalo.tendero.Inicio_sesion.ui.Soporte;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import mx.com.encargalo.R;


public class sp_frgmenusoporte extends Fragment {

    Button btnconfNotificaciones;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_sp_frgmenusoporte, container, false);
        btnconfNotificaciones=view.findViewById(R.id.btn_Notificaciones);


        btnconfNotificaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.nav_configuracionnotificaiones);

            }
        });

        return view;
    }
}