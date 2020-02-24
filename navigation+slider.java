

package com.example.drawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.drawer.dashboard.dashboard;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    FrameLayout frameLayout;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = findViewById(R.id.drawerlayout);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        frameLayout = findViewById(R.id.layout);
        navigationView = findViewById(R.id.navgationView);
        View headerView = navigationView.getHeaderView(0);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.openDrawer, R.string.closeDrawer);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);

       if (savedInstanceState == null)
           navigationView.getMenu().getItem(0).setChecked(true);
        changefragment(new dashboard(), "Home");



    }

    public void changefragment(Fragment fragment, String title) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.layout, fragment)
                .commit();
        

        toolbar.setTitle(title);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        int id = menuItem.getItemId();
        switch (id) {
            case R.id.dshboard:
                changefragment(new dashboard(), "Dashboard");
                //Toast.makeText(getApplicationContext(),"whatsapp",Toast.LENGTH_LONG).show();

                break;

            case R.id.enroll:
                //changefragment(new whtsapp_main(), "Whatsapp");
                 Toast.makeText(getApplicationContext(),"whatsapp",Toast.LENGTH_LONG).show();
                break;

            case R.id.entry:
                //changefragment(new main_fb(),"Facebook");
                Toast.makeText(getApplicationContext(),"whatsapp",Toast.LENGTH_LONG).show();
                break;
            case R.id.viewstd:
               // changefragment(new utubecls(),"YOUtube");
                Toast.makeText(getApplicationContext(),"whatsapp",Toast.LENGTH_LONG).show();
                break;
            case R.id.report:
                //changefragment(new main_messenger(),"Mesenger");
                 Toast.makeText(getApplicationContext(),"whatsapp",Toast.LENGTH_LONG).show();
                break;




        }
        navigationView.setCheckedItem(id);
        drawerLayout.closeDrawer(GravityCompat.START);
        return false;
    }

    @Override    public void onBackPressed() {


        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {

            drawerLayout.closeDrawer(GravityCompat.START);

        } else {
            super.onBackPressed();
        }



    }

}

