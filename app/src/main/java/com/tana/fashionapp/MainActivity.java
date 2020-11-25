package com.tana.fashionapp;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.LinearLayout;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Toolbar mToolbar;
    DrawerLayout mDrawer;
    //NavigationView mNavView;
    RecyclerView mRecyclerView;
    ArrayList<FashionItems> mFashionItems;
    AppAdapter mAdapter;
    StaggeredGridLayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        mDrawer = findViewById(R.id.layout_drawer);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDrawer, mToolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawer.addDrawerListener(toggle);
        toggle.syncState();

        mFashionItems = new ArrayList<>();
        mFashionItems.add(new FashionItems(R.drawable.dresh_1,
                "Fendi dress with black belt", "brand new", "$140.45"));
        mFashionItems.add(new FashionItems(R.drawable.fendi_belt,
                "Fendi Multicolor Zucca College Reversible Belt", "Gently Used", "$36.20"));
        mFashionItems.add(new FashionItems(R.drawable.lv_sunglass,
                        "Louis Vuitton Men's Sunglasses", "brand new", "$70.00"));
        mFashionItems.add(new FashionItems(R.drawable.air_jordan,
                "Air Jordan 4 Retro OG 'Bred'", "brand new", "$220.00"));
        mFashionItems.add(new FashionItems(R.drawable.nike_air_jordan_1,
                "Ultmate Dior x Air Jordan", "brand bew", "$310.10"));
        mFashionItems.add(new FashionItems(R.drawable.gucci_ladies_suit,
                "Gucci suit Iridescent Rust Liquid", "brand new", "$580.00"));
        mFashionItems.add(new FashionItems(R.drawable.gucci_suit,
                        "Gucci Dress Suit | Credomen", "brand new", "$920.00"));
        mFashionItems.add(new FashionItems(R.drawable.gucci_handbag_1,
                "gucci totes", "brand new", "$170.00"));
        mFashionItems.add(new FashionItems(R.drawable.gucci_cross_bag,
                "GG Supreme leather cross-body bag", "brand new", "$100.00"));

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mAdapter = new AppAdapter(this, mFashionItems);
        mLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

    }

    @Override
    public void onBackPressed() {
        if (mDrawer.isDrawerOpen(GravityCompat.START)) {
            mDrawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }
}