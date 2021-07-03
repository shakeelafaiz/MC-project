package com.example.flickster.Frangments;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.example.flickster.Adapter.searchAdapter;
import com.example.flickster.Model.NotificationModel;
import com.example.flickster.Model.searchModel;
import com.example.flickster.R;

import java.util.ArrayList;


public class SearchFragment extends Fragment {
    RecyclerView recyclerView;
    ArrayList<searchModel> list;

    public SearchFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        recyclerView = view.findViewById(R.id.search_recyclerview);
        list = new ArrayList<>();
        list.add(new searchModel(R.drawable.image2, "Abrar Hassan"));
        list.add(new searchModel(R.drawable.image3, "Mussna Irfan"));
        list.add(new searchModel(R.drawable.image4, "Mohammad Saad"));
        list.add(new searchModel(R.drawable.paf_1, "Zubaida Jabbar"));

        searchAdapter adapter = new searchAdapter(list, getContext());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter(adapter);
        return view;

    }


}