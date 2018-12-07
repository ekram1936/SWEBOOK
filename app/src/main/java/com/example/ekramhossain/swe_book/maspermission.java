package com.example.ekramhossain.swe_book;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.support.v4.app.ActivityCompat;

/**
 * Created by SONU on 13/01/16.
 */
public class maspermission {


    public static void requestStoragePermission(final Context context) {
        if (ActivityCompat.shouldShowRequestPermissionRationale((Activity) context, Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
            // Provide an additional rationale to the user if the permission was not granted
            // and the user would benefit from additional context for the use of the permission.
            // For example if the user has previously denied the permission.

            ActivityCompat.requestPermissions((Activity) context,
                    new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                   masmellow.WRITE_EXTERNAL_STORAGE_PERMISSION);


        } else {
            // permission has not been granted yet. Request it directly.
            ActivityCompat.requestPermissions((Activity) context,
                    new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                   masmellow.WRITE_EXTERNAL_STORAGE_PERMISSION);
        }
    }

    public static void requestReadSMSPermission(final Context context) {
        if (ActivityCompat.shouldShowRequestPermissionRationale((Activity) context, Manifest.permission.READ_SMS)) {
            // Provide an additional rationale to the user if the permission was not granted
            // and the user would benefit from additional context for the use of the permission.
            // For example if the user has previously denied the permission.

            ActivityCompat.requestPermissions((Activity) context,
                    new String[]{Manifest.permission.READ_SMS},
                    masmellow.READ_SMS_INTENT_ID);


        } else {
            // permission has not been granted yet. Request it directly.
            ActivityCompat.requestPermissions((Activity) context,
                    new String[]{Manifest.permission.READ_SMS},
                    masmellow.READ_SMS_INTENT_ID);
        }
    }

    public static void requestLocationPermission(final Context context) {
        if (ActivityCompat.shouldShowRequestPermissionRationale((Activity) context, Manifest.permission.ACCESS_FINE_LOCATION)) {
            // Provide an additional rationale to the user if the permission was not granted
            // and the user would benefit from additional context for the use of the permission.
            // For example if the user has previously denied the permission.

            ActivityCompat.requestPermissions((Activity) context,
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                    masmellow.ACCESS_FINE_LOCATION_INTENT_ID);


        } else {
            // permission has not been granted yet. Request it directly.
            ActivityCompat.requestPermissions((Activity) context,
                    new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                    masmellow.ACCESS_FINE_LOCATION_INTENT_ID);
        }
    }

    public static void requestContactsPermission(final Context context) {
        if (ActivityCompat.shouldShowRequestPermissionRationale((Activity) context, Manifest.permission.READ_CONTACTS)) {
            // Provide an additional rationale to the user if the permission was not granted
            // and the user would benefit from additional context for the use of the permission.
            // For example if the user has previously denied the permission.

            ActivityCompat.requestPermissions((Activity) context,
                    new String[]{Manifest.permission.READ_CONTACTS},
                    masmellow.ACCESS_CONTACTS_INTENT_ID);


        } else {
            // permission has not been granted yet. Request it directly.
            ActivityCompat.requestPermissions((Activity) context,
                    new String[]{Manifest.permission.READ_CONTACTS},
                    masmellow.ACCESS_CONTACTS_INTENT_ID);
        }
    }


}

