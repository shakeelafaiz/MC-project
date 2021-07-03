package com.example.flickster.Frangments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.flickster.Adapter.DashboardAdapter;
import com.example.flickster.Adapter.StoryAdapter;
import com.example.flickster.Model.Dashboard;
import com.example.flickster.Model.StoryModel;
import com.example.flickster.R;

import java.io.File;
import java.util.ArrayList;


public class HomeFragment extends Fragment {

   RecyclerView story_recycler_view, dashboard_recycler_view;
    ArrayList<StoryModel> storyList;
    ArrayList<Dashboard> dashboardList;
    ImageView addStory,addPost;

    public HomeFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        story_recycler_view = view.findViewById(R.id.story_recycler_view);
        storyList = new ArrayList<>();
        storyList.add(new StoryModel(R.drawable.image2,R.drawable.image3,"Abrar Hassan",R.drawable.ic_videocam));
        storyList.add(new StoryModel(R.drawable.image4,R.drawable.image6,"Mussana Irfan",R.drawable.ic_videocam));
        storyList.add(new StoryModel(R.drawable.image7,R.drawable.image3,"Harris J",R.drawable.ic_videocam));

        StoryAdapter adapter = new StoryAdapter(storyList,getContext());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,true);
        story_recycler_view.setLayoutManager(layoutManager);
        story_recycler_view.setNestedScrollingEnabled(false);
        story_recycler_view.setAdapter(adapter);

        //Dashboard Recycler View
        dashboard_recycler_view = view.findViewById(R.id.dashboard_recycler_view);
        dashboardList = new ArrayList<>();
        dashboardList.add(new Dashboard(R.drawable.image1,R.drawable.image7,"Abrar Hassan","Knjoos_Zamanay_Ka ","247","57","33"));
        dashboardList.add(new Dashboard(R.drawable.pak_army3,R.drawable.pak_army3,"Mohammad Ali ","Son Of The Land","247","57","33"));
        dashboardList.add(new Dashboard(R.drawable.paf_1,R.drawable.paf_2,"Marriyam Mukhtiyar ","Was Born To Fly","247","57","33"));

        DashboardAdapter DashboardAdapter = new DashboardAdapter(dashboardList,getContext());
        LinearLayoutManager layoutManager1= new LinearLayoutManager(getContext());
        dashboard_recycler_view.setLayoutManager(layoutManager1);
        dashboard_recycler_view.setNestedScrollingEnabled(false);
        dashboard_recycler_view.setAdapter(DashboardAdapter);
        return view;


    }
}