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


public class RequestFrag extends Fragment {

    RecyclerView requestRv;
    ArrayList<NotificationModel> list;

    public RequestFrag() {
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
        View view = inflater.inflate(R.layout.fragment_request, container, false);

        requestRv = view.findViewById(R.id.requestRecyclerView);

        list = new ArrayList<>();
        list.add(new NotificationModel(R.drawable.image7,"<b>Abrar Hassan</b> Send you a friend request","just now"));
        list.add(new NotificationModel(R.drawable.image6,"<b>Mussana Irfan</b> Send you a friend request","40 minutes ago"));
        list.add(new NotificationModel(R.drawable.image2,"<b>Mohammad Saad</b> Suggested for you","2 hours"));
        list.add(new NotificationModel(R.drawable.image3,"<b>Abdul Rehman</b> Send you a friend request","3 hours"));
        list.add(new NotificationModel(R.drawable.image4,"<b>Aashir Hafeez</b> Suggested for you","3 hours"));
        list.add(new NotificationModel(R.drawable.paf_1,"<b>Hammad Ali</b> Send you a friend request","3 hours"));
        list.add(new NotificationModel(R.drawable.pak_army2,"<b>Hamza</b> Send you a friend request","3 hours"));
        list.add(new NotificationModel(R.drawable.image1,"<b>Hassan Ahmad</b> Send you a friend request","3 hours"));


        NotificationAdapter adapter = new NotificationAdapter(list, getContext());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        requestRv.setLayoutManager(layoutManager);
        requestRv.setNestedScrollingEnabled(false);
        requestRv.setAdapter(adapter);

        return view;
    }
}