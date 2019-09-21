package com.example.recyclerviewapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class ArrayAdapter extends RecyclerView.Adapter<ArrayAdapter.ViewHolder> {

     private String[] Planets;

    ArrayAdapter(String[] Planets) {
        this.Planets = Planets;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from( parent.getContext() );
        View v = inflater.inflate( R.layout.list_item,parent,false );

        return new ViewHolder( v );
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

         holder.txtPlanet.setText(Planets[position] );
    }

    @Override
    public int getItemCount() {
        return Planets.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtPlanet;
        ViewHolder(@NonNull View itemView) {
            super( itemView );
             txtPlanet =itemView.findViewById( R.id.txtPlanet );
        }
    }
}
