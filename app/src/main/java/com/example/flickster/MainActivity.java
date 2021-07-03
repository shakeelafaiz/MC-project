package com.example.flickster;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.flickster.Frangments.AddPostFragment;
import com.example.flickster.Frangments.HomeFragment;
import com.example.flickster.Frangments.NotificationFragment;
import com.example.flickster.Frangments.SearchFragment;
import com.example.flickster.Frangments.UserFragment;
import com.example.flickster.databinding.ActivityMainBinding;
import com.iammert.library.readablebottombar.ReadableBottomBar;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);
        binding.toolbar.setVisibility(View.GONE);
        MainActivity.this.setTitle("User Profile");
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, new HomeFragment());
        transaction.commit();
        binding.readableBottombar.setOnItemSelectListener(new ReadableBottomBar.ItemSelectListener() {
            @Override
            public void onItemSelected(int i) {
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                switch (i) {
                    case 0:
                        binding.toolbar.setVisibility(View.GONE);
                        transaction.replace(R.id.container, new HomeFragment());
                        Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        binding.toolbar.setVisibility(View.GONE);
                        transaction.replace(R.id.container, new NotificationFragment());
                        Toast.makeText(MainActivity.this, "Notification ", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        binding.toolbar.setVisibility(View.GONE);
                        transaction.replace(R.id.container, new AddPostFragment());
                        Toast.makeText(MainActivity.this, "Add Post", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        binding.toolbar.setVisibility(View.GONE);
                        transaction.replace(R.id.container, new SearchFragment());
                        Toast.makeText(MainActivity.this, "Search", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        binding.toolbar.setVisibility(View.VISIBLE);
                        transaction.replace(R.id.container, new UserFragment());
                        Toast.makeText(MainActivity.this, "Profile", Toast.LENGTH_SHORT).show();
                        break;
                }
                transaction.commit();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.item_files, menu);
        return true;
    }
}