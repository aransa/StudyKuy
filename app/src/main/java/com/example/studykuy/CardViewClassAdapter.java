package com.example.studykuy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewClassAdapter extends RecyclerView.Adapter<CardViewClassAdapter.CardViewViewHolder> {

    private ArrayList<Schedule> listSchedule;

    public CardViewClassAdapter(ArrayList<Schedule> listSchedule) {
        this.listSchedule = listSchedule;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cardview_classroom, parent, false);
        return new CardViewViewHolder(view);
    }

    //Naruh datanya
    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder holder, int position) {
        Schedule schedule = listSchedule.get(position);

        Glide.with(holder.itemView.getContext())
                .load(schedule.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);

        holder.tvName.setText(schedule.getNama());
        holder.tvMatkul.setText(schedule.getMatkul());
    }

    @Override
    public int getItemCount() {
        return listSchedule.size();
    }

    //Pasangin objek view sama view
    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvMatkul;

        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_nama);
            tvMatkul = itemView.findViewById(R.id.tv_matkul);
        }
    }
}
