package com.example.ekramhossain.swe_book;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class homepage extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
RelativeLayout s1;
 DrawerLayout drawerLayout;
 ActionBarDrawerToggle barDrawerToggle;
 NavigationView navigationView;
 android.support.v7.widget.Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        drawerLayout=(DrawerLayout)findViewById(R.id.slidemenu) ;
        toolbar= (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Home");
        navigationView =(NavigationView)findViewById(R.id.nagetive) ;
        navigationView.setNavigationItemSelectedListener(this);
        setSupportActionBar(toolbar);
        barDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(barDrawerToggle);
        barDrawerToggle.syncState();
        displaySelectedScreen(R.id.home);
        navigationView.getMenu().getItem(0).setChecked(true);




        s1=(RelativeLayout)findViewById(R.id.s1box);
          s1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(homepage.this, Semester1.class);
        startActivity(intent);

    }
});




    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        super.onBackPressed();
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.sidemenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.help) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        //creating fragment object
        Fragment fragment = null;

        Log.d("Clicked item",""+item.getItemId());
        Toast.makeText(getApplicationContext(),"Item id:"+item.getItemId(),Toast.LENGTH_LONG).show();


        //initializing the fragment object which is selected
        switch (item.getItemId()) {
            case R.id.link:
                Log.d("MESSAGE",""+fragment.getTag());
                fragment = new frament_menu1();
                break;
            case R.id.teacher:
                Log.d("MESSAGE",""+fragment.getTag());
                fragment = new frament_menu2();
                break;
            case R.id.about:
                Log.d("MESSAGE",""+fragment.getTag());
                fragment = new frament_menu1();
                break;
        }

        //replacing the fragment
        if (fragment != null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragment);
            ft.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.slidemenu);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    private void displaySelectedScreen(int itemId) {

        Log.d("Clicked item",""+itemId);
        Toast.makeText(getApplicationContext(),"Item id:"+itemId,Toast.LENGTH_LONG).show();


    }
}




