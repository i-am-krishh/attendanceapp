package com.example.attendenceapp;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.navigation.NavigationView;

public class MainActivity2 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

//    private static DrawerLayout drawer;
//    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new NotesFragment()).commit();

//        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

//        setToolBar();

    }


//    private void setToolBar() {
//
//        toolbar = findViewById(R.id.toolbar);
//        TextView title = toolbar.findViewById(R.id.title_toolbar);
//        TextView subtitle = toolbar.findViewById(R.id.subtitle_toolbar);
//        ImageButton save = toolbar.findViewById(R.id.save);
//        ImageButton back = toolbar.findViewById(R.id.back);
//
//        title.setText(" Notes ");
//        subtitle.setVisibility(View.GONE);
//        back.setVisibility(View.INVISIBLE);
//        save.setVisibility(View.INVISIBLE);
//
//        toolbar.inflateMenu(R.menu.notes_menu);
////        toolbar.setOnMenuItemClickListener(menuItem->onMenuItemClick(menuItem));
//
//    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
//            case R.id.nav_drawer_note:
//                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new NotesFragment()).commit();
//                break;

        }
//        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

//    @Override
//    public void onBackPressed() {
//        if (drawer.isDrawerOpen(GravityCompat.START)) {
//            drawer.closeDrawer(GravityCompat.START);
//        } else {
//            super.onBackPressed();
//        }
//    }

//    public static void drawerHandler() {
//        if (!drawer.isDrawerOpen(GravityCompat.START)) {
//            drawer.openDrawer(GravityCompat.START);
//        }
//    }


}