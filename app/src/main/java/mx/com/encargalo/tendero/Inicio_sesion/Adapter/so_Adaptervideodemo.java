package mx.com.encargalo.tendero.Inicio_sesion.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import mx.com.encargalo.R;
import mx.com.encargalo.tendero.Inicio_sesion.Entidad.so_Entidadvideodemo;

public class so_Adaptervideodemo extends RecyclerView.Adapter<so_Adaptervideodemo.VideosDemotrativoHolder> {
    List<so_Entidadvideodemo> listavideodemo;

    public so_Adaptervideodemo(List<so_Entidadvideodemo> listavideodemo){
        this.listavideodemo = listavideodemo;
    }

    @NonNull
    @Override
    public VideosDemotrativoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista= LayoutInflater.from(parent.getContext()).inflate(R.layout.so_itemdetallevideosdemo,parent,false);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        vista.setLayoutParams(layoutParams);
        return new so_Adaptervideodemo.VideosDemotrativoHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull VideosDemotrativoHolder holder, int position) {
        holder.txttitulovideodemo.setText(String.valueOf(listavideodemo.get(position).getVideotitulo()));
        holder.txtdescripvideodemo.setText(String.valueOf(listavideodemo.get(position).getVideodescri()));
        holder.txturlvideodemo.setText(String.valueOf(listavideodemo.get(position).getVideoURL()));

    }

    @Override
    public int getItemCount() {
        return listavideodemo.size();
    }

    public class VideosDemotrativoHolder extends RecyclerView.ViewHolder {
        TextView txttitulovideodemo, txtdescripvideodemo, txturlvideodemo;

        public VideosDemotrativoHolder(@NonNull View itemView) {
            super(itemView);
            txttitulovideodemo=itemView.findViewById(R.id.txt_titulovideodemo);
            txtdescripvideodemo=itemView.findViewById(R.id.txt_descvideodemo);
            txturlvideodemo=itemView.findViewById(R.id.txt_urlvideodemo);
        }
    }
}
