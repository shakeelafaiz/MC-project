package com.example.flickster.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.flickster.Frangments.Notification2;
import com.example.flickster.Frangments.RequestFrag;


public class FragmentAdapter extends FragmentPagerAdapter {

    public FragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new Notification2();
            case 1: return new RequestFrag();
            default: return new Notification2();
        }

    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if(position == 0)
        {
            title = "Notification";
        }
        else if(position == 1)
        {
            title = "Requests";
        }
        return title;
    }
}
