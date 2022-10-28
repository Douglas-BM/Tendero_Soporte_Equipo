package mx.com.encargalo.tendero.Inicio_sesion.ui.Soporte;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.jetbrains.annotations.NotNull;

import mx.com.encargalo.R;


public class sp_frgacercade extends DialogFragment{
    Button btnCerrarAcercaDe;


    @NonNull
    @NotNull
    @Override
    public Dialog onCreateDialog(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        return crearDialogoAcercaDe();
        //super.onCreateDialog(savedInstanceState);
    }

    private AlertDialog crearDialogoAcercaDe() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();

        View v = inflater.inflate(R.layout.fragment_sp_frgacercade, null);
        builder.setView(v);



        return builder.create();
    }

}