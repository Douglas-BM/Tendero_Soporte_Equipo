package mx.com.encargalo.tendero.Inicio_sesion.ui.Soporte;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import org.jetbrains.annotations.NotNull;

import mx.com.encargalo.R;


public class so_Terminoscondicionesdetalles extends DialogFragment{

    Button btnCerrarTermsConsDetalle;
    Activity actividad;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public so_Terminoscondicionesdetalles() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment so_Terminoscondicionesdetalles.
     */
    // TODO: Rename and change types and number of parameters
    public static so_Terminoscondicionesdetalles newInstance(String param1, String param2) {
        so_Terminoscondicionesdetalles fragment = new so_Terminoscondicionesdetalles();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
//    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_so__terminoscondicionesdetalles, container, false);
//    }

    @NonNull
    @NotNull
    @Override
    public Dialog onCreateDialog(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        return crearDialogoTermsConsDetalle();
        //super.onCreateDialog(savedInstanceState);
    }

    private AlertDialog crearDialogoTermsConsDetalle() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();

        View v = inflater.inflate(R.layout.fragment_so__terminoscondicionesdetalles, null);
        builder.setView(v);

        btnCerrarTermsConsDetalle = v.findViewById(R.id.btnCerrarTermsConsDetalle);

        btnCerrarTermsConsDetalle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        return builder.create();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if (context instanceof Activity){
            this.actividad = (Activity) context;
        }else{
            throw new RuntimeException(context.toString() + "Debe implementar OnFragmentInteractionListener");
        }
    }
}