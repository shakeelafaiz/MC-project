package com.example.flickster.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.flickster.Model.Add_friend;
import com.example.flickster.R;

import java.util.ArrayList;

public class Add_friendAdapter extends RecyclerView.Adapter<Add_friendAdapter.viewHolder> {

    ArrayList<Add_friend> list;
    Context context;

    public  Add_friendAdapter (ArrayList<Add_friend> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.friend_list, parent, false);

        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        Add_friend model = list.get(position);
        holder.profile.setImageResource(model.getProfile());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView profile;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            profile = itemView.findViewById(R.id.profile_image);
        }
    }
}


