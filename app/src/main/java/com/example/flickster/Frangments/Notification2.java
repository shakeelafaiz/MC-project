package com.example.flickster.Frangments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.flickster.Adapter.NotificationAdapter;
import com.example.flickster.Model.NotificationModel;
import com.example.flickster.R;

import java.util.ArrayList;


public class Notification2 extends Fragment {

    RecyclerView notificationRV;
    ArrayList<NotificationModel> list;

    public Notification2() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notification2, container, false);
        notificationRV = view.findViewById(R.id.notificationRV);
        list = new ArrayList<>();
        list.add(new NotificationModel(R.drawable.image4,"<b>Abrar Hassan</b> mention you in a comment: Nice Try","just now"));
        list.add(new NotificationModel(R.drawable.image3,"<b>Mussana Irfan</b> Liked your picture.","40 minutes ago"));
        list.add(new NotificationModel(R.drawable.image2,"<b>Mohammad Saad</b> Commented on your post.","2 hours"));
        list.add(new NotificationModel(R.drawable.image7,"<b>Aashir Hafeez</b> mention you in a comment: Nice Try","3 hours"));
        list.add(new NotificationModel(R.drawable.image1,"<b>Abdul Rehman</b> Liked your picture.","3 hours"));
        list.add(new NotificationModel(R.drawable.image2,"<b>Hassan Ahmad</b> Commented on your post.","4 hours"));
        list.add(new NotificationModel(R.drawable.pak_army2,"<b>Hammmad Ali</b> mention you in a comment: Nice Try","4 hours"));
        list.add(new NotificationModel(R.drawable.paf_1,"<b>Marriyum Mukhtiyar</b> Liked your picture.","4 hours"));
        list.add(new NotificationModel(R.drawable.image6,"<b>Ahsan Nawaz</b> Commented on your post.","4 hours"));



        NotificationAdapter adapter = new NotificationAdapter(list, getContext());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        notificationRV.setLayoutManager(layoutManager);
        notificationRV.setNestedScrollingEnabled(false);
        notificationRV.setAdapter(adapter);

        return view;
    }
}