package com.example.flickster.Frangments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.flickster.Adapter.Add_friendAdapter;
import com.example.flickster.Model.Add_friend;
import com.example.flickster.R;


import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;


import java.util.ArrayList;


public class UserFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<Add_friend> list;
    Toolbar toolbar;

    public UserFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setHasOptionsMenu(true);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_user, container, false);
        recyclerView = view.findViewById(R.id.friend_recycler_view);
        list = new ArrayList<>();
        list.add(new Add_friend(R.drawable.image1));
        list.add(new Add_friend(R.drawable.image2));
        list.add(new Add_friend(R.drawable.image3));
        list.add(new Add_friend(R.drawable.image4));
        list.add(new Add_friend(R.drawable.image6));
        list.add(new Add_friend(R.drawable.mr_knjoos));
        list.add(new Add_friend(R.drawable.pak_army3));
        list.add(new Add_friend(R.drawable.pak_army2));

        Add_friendAdapter adapter = new Add_friendAdapter(list,getContext());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,true);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

//        toolbar = view.findViewById(R.id.toolbar);
//        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);

        return view;
    }


    /*@Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.menu_item,menu);
        super.onCreateOptionsMenu(menu, inflater);
    }*/

    /*@Override
    public void onPrepareOptionsMenu(Menu menu) {
        menu.findItem(R.id.notification).setVisible(true);
        menu.findItem(R.id. profile).setVisible(true);
        menu.findItem(R.id. setting).setVisible(true);
        super.onPrepareOptionsMenu(menu);
    }*/
}