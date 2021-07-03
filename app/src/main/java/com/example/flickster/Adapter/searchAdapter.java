package com.example.flickster.Adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.flickster.Model.Add_friend;
import com.example.flickster.Model.searchModel;
import com.example.flickster.R;

import java.util.ArrayList;
import java.util.List;

public class searchAdapter extends RecyclerView.Adapter<searchAdapter.ViewHolder>{
ArrayList<searchModel>list;

   Context context;

    public searchAdapter(ArrayList<searchModel> list, Context context) {
        this.list = list;
        this.context=context;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(context).inflate(R.layout.search_rv,parent,false);
       return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        searchModel model =list.get(position);
        holder.profile.setImageResource(model.getProfile());
        holder.search.setText(model.getSearch());


    }

    @Override
    public int getItemCount(){return list.size();}



    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView profile;
        TextView search;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            profile=itemView.findViewById(R.id.searchProfile);
            search=itemView.findViewById(R.id.search);

        }

    }

    }


