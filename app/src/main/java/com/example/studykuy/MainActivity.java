package com.example.studykuy;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);

        //untuk menampilkan fragment saat aplikasi pertama dibuka
        if (savedInstanceState == null){
            navView.setSelectedItemId(R.id.navigation_home);
        }
    }

    //Mengatur event handler di bottom navigation
    private BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment fragment;
            switch (menuItem.getItemId()){
                case R.id.navigation_home:
                    fragment = new HomeFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, fragment, fragment.getClass().getSimpleName()).commit();
                    return true;
                case R.id.navigation_classroom :
                    fragment = new ClassroomFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, fragment, fragment.getClass().getSimpleName()).commit();
                    return true;
                case R.id.navigation_scan:
                    fragment = new ScanFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, fragment, fragment.getClass().getSimpleName()).commit();
                    return true;
                case R.id.navigation_wallet:
                    fragment = new WalletFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, fragment,fragment.getClass().getSimpleName()).commit();
                    return true;
                case R.id.navigation_profile:
                    fragment = new ProfileFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, fragment, fragment.getClass().getSimpleName()).commit();
                    return true;
            }
            return false;
        }
    };

}
