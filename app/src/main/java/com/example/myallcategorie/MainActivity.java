package com.example.myallcategorie;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    //drawer menu
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ImageView menuBtn;
    rec_adapter adapter  ;
    ArrayList<centre_profil> li = new ArrayList<>();
    RecyclerView rec;




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
       setContentView(R.layout.activity_main);


        li.add(new centre_profil(R.drawable.logo , "Lilia", "Female, 5 Months","Casablanca"));
        li.add(new centre_profil(R.drawable.logo , "Lilia", "Female, 5 Months","Casablanca"));
        li.add(new centre_profil(R.drawable.logo , "Lilia", "Female, 5 Months","Casablanca"));
        li.add(new centre_profil(R.drawable.logo , "Lilia", "Female, 5 Months","Casablanca"));
        li.add(new centre_profil(R.drawable.logo , "Lilia", "Female, 5 Months","Casablanca"));
        li.add(new centre_profil(R.drawable.logo , "Lilia", "Female, 5 Months","Casablanca"));
        adapter = new rec_adapter(li);
        rec = findViewById(R.id.rec);
        rec.setAdapter(adapter);
        GridLayoutManager g = new GridLayoutManager(MainActivity.this , 1);
        rec.setLayoutManager(g);


        //menu hooks
        drawerLayout = findViewById(R.id.drawer_layout);
       navigationView= findViewById(R.id.navigation_view);
        menuBtn= findViewById(R.id.menuBtn);

        menuBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("RtlHardcoded")
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(Gravity.LEFT,true);
            }
        });



    }
}
