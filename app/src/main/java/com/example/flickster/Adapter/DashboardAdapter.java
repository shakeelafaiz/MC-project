package com.example.flickster.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.flickster.Model.Dashboard;
import com.example.flickster.R;

import java.util.ArrayList;

public class DashboardAdapter extends RecyclerView.Adapter<DashboardAdapter.viewHolder> {

    ArrayList<Dashboard> list;
    Context context;
    boolean clicked = false;
    int likeCount;

    public DashboardAdapter(ArrayList<Dashboard> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.dashboard,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        Dashboard model = list.get(position);
        holder.profile.setImageResource(model.getProfile());
        holder.dashImage.setImageResource(model.getDashboardImage());
        holder.name.setText(model.getuser_name());
        holder.about.setText(model.getAbout());
        holder.like_post.setText(model.getLike_post());
        holder.feedback.setText(model.getFeedback());
        holder.share.setText(model.getShare());

        holder.dashImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!clicked){
                    holder.like_post.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_favorite_border, 0, 0, 0);
                    likeCount = Integer.parseInt(holder.like_post.getText()+"");
                    clicked = true;
                }
                else {
                    holder.like_post.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_favorite, 0, 0, 0);
                    likeCount = Integer.parseInt(holder.like_post.getText()+"");
                    clicked = false;
                }
            }
        });

        holder.saveImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!clicked){
                    holder.saveImage.setImageResource(R.drawable.ic_bookmark_border);
                    clicked = true;
                }
                else {
                    holder.saveImage.setImageResource(R.drawable.ic_bookmark);
                    clicked = false;
                }

            }



        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView profile, dashImage, saveImage;
        TextView name, about, like_post, feedback, share;

        public viewHolder(@NonNull View itemView) {
            super(itemView);

            profile = itemView.findViewById(R.id.profile_image);
            dashImage = itemView.findViewById(R.id.post);
            saveImage = itemView.findViewById(R.id.saveImg);
            name = itemView.findViewById(R.id.user_name);
            about = itemView.findViewById(R.id.about);
            like_post = itemView.findViewById(R.id.like_post);
            feedback = itemView.findViewById(R.id.feedback);
            share = itemView.findViewById(R.id.share);
        }
    }
}

