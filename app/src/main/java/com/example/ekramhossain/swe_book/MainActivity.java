package com.example.ekramhossain.swe_book;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    Typeface Lfont;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        Lfont = Typeface.createFromAsset(getAssets(), "fonts/Lfont.ttf");
        btn.setTypeface(Lfont);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, homepage.class);
                startActivity(intent);
            }
        });

    }
    public void allowLocationPermission(View view) {
        //Check if permission is granted or not
        if (ContextCompat.checkSelfPermission(MainActivity.this,
                Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED)
            maspermission.requestLocationPermission(MainActivity.this);
        else
            Toast.makeText(MainActivity.this, "Permission is already granted.", Toast.LENGTH_SHORT).show();
    }
    public void allowStoragePermission(View view) {
        //Check if permission is granted or not
        if (ContextCompat.checkSelfPermission(MainActivity.this,
                Manifest.permission.WRITE_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED)
            maspermission.requestStoragePermission(MainActivity.this);
        else
            Toast.makeText(MainActivity.this, "Permission is already granted.", Toast.LENGTH_SHORT).show();
    }
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case masmellow.ACCESS_FINE_LOCATION_INTENT_ID:
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // permission was granted, yay! Do the
                    // task you need to do.
                    Toast.makeText(MainActivity.this, "Location Permission granted.", Toast.LENGTH_SHORT).show();

                } else {
                    // permission denied, boo! Disable the
                    // functionality that depends on this permission.
                    Toast.makeText(MainActivity.this, "Location Permission denied.", Toast.LENGTH_SHORT).show();
                }
                break;

            case masmellow.WRITE_EXTERNAL_STORAGE_PERMISSION:
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // permission was granted, yay! Do the
                    // task you need to do.
                    Toast.makeText(MainActivity.this, "Storage Permission granted.", Toast.LENGTH_SHORT).show();

                } else {
                    // permission denied, boo! Disable the
                    // functionality that depends on this permission.
                    Toast.makeText(MainActivity.this, "Storage Permission denied.", Toast.LENGTH_SHORT).show();
                }
                break;


        }
    }

}
