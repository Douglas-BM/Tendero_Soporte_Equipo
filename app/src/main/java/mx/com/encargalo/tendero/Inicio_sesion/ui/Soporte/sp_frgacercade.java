package mx.com.encargalo.tendero.Inicio_sesion.ui.Soporte;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.jetbrains.annotations.NotNull;

import mx.com.encargalo.R;


public class sp_frgacercade extends Fragment{
    Button btnWebsite, btnFacebook, btnInstagram;
    String url1, url2, url3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_sp_frgacercade, container, false);

        btnWebsite=view.findViewById(R.id.btn_so_05_website);
        btnFacebook=view.findViewById(R.id.btn_so_05_facebook);
        btnInstagram=view.findViewById(R.id.btn_so_05_instagram);
        url1="https://es-la.facebook.com/";

        btnWebsite.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Uri uri = Uri.parse(url1);
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse(url1);
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        btnInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse(url1);
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });
        return view;
    }

}