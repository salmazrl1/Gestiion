package com.example.myallcategorie;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class rec_adapter extends RecyclerView.Adapter<rec_adapter.viewholder>{

    ArrayList<centre_profil> li = new ArrayList<>();

    public rec_adapter(ArrayList<centre_profil> li) {
        this.li = li;
    }

    @Override
    public viewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflate =LayoutInflater.from(parent.getContext());
        View v = inflate.inflate(R.layout.itemcentre , parent,false);
        return new viewholder(v);
    }

    @Override
    public void onBindViewHolder(viewholder holder, int position) {
        holder.imgCentre.setImageResource(li.get(position).image);
        holder.nameCentre.setText(li.get(position).nom);
        holder.loc.setText(li.get(position).loc);
        holder.tele.setText(li.get(position).tele );
    }

    @Override
    public int getItemCount() {
        return li.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {

        ImageView imgCentre;
        TextView nameCentre;
        TextView tele;
        TextView loc;
        public viewholder(View itemView) {
            super(itemView);

            imgCentre = itemView.findViewById(R.id.imageCentre);
            nameCentre = itemView.findViewById(R.id.nameCentre);
            tele = itemView.findViewById(R.id.tele);
            loc = itemView.findViewById(R.id.loc);

        }
    }
}
