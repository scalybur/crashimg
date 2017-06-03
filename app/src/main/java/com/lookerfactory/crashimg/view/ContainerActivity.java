package com.lookerfactory.crashimg.view;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.lookerfactory.crashimg.R;
import com.lookerfactory.crashimg.view.fragment.HomeFragment;
import com.lookerfactory.crashimg.view.fragment.ProfileFragment;
import com.lookerfactory.crashimg.view.fragment.SearchFragment;

public class ContainerActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomBar);
        bottomNavigationView.setSelectedItemId(R.id.menuItemHome);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {
                switch (item.getItemId())
                {
                    case R.id.menuItemHome:
                        HomeFragment aHome = new HomeFragment();
                        addFragment(aHome);
                        break;
                    case R.id.menuItemProfile:
                        ProfileFragment aProfile = new ProfileFragment();
                        addFragment(aProfile);
                        break;
                    case R.id.menuItemSearch:
                        SearchFragment aSearch = new SearchFragment();
                        addFragment(aSearch);
                        break;
                }
                return true;
            }

            private void addFragment(Fragment aFragment)
            {
                if (null != aFragment)
                {
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.containerFrame, aFragment)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                            .addToBackStack(null)
                            .commit();
                }
            }
        });
    }
}
