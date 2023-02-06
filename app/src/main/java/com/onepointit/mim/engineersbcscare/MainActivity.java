package com.onepointit.mim.engineersbcscare;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.onepointit.mim.engineersbcscare.ui.bank_routine.BankRoutineFragment;
import com.onepointit.mim.engineersbcscare.ui.bcs_routine.BcsRoutineFragment;
import com.onepointit.mim.engineersbcscare.ui.dashboard.DashboardFragment;
import com.onepointit.mim.engineersbcscare.ui.notification.NotificationFragment;
import com.onepointit.mim.engineersbcscare.ui.pdf_section.PdfSectionFragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener  {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.nav_view);

        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.navigation_dashboard);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater =getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_logout) {
            // do something here
            Toast.makeText(this, "Logout clicked", Toast.LENGTH_SHORT).show();
            //Intent intent = new Intent(this, MainMenuActivity.class);
            //intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            //startActivity(intent);
        }
        if (id == R.id.action_menu) {
            Toast.makeText(this, "Menu Clicked", Toast.LENGTH_SHORT).show();
            //Intent intent = new Intent(this, Notification.class);
            //intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            //startActivity(intent);
            // finish();
        }
        return true;
    }



    DashboardFragment dashboardFragment = new DashboardFragment();
    BcsRoutineFragment bcsRoutineFragment = new BcsRoutineFragment();
    BankRoutineFragment bankRoutineFragment = new BankRoutineFragment();
    PdfSectionFragment pdfSectionFragment = new PdfSectionFragment();
    NotificationFragment notificationFragment = new NotificationFragment();

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.navigation_dashboard:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, dashboardFragment).commit();
                return true;

            case R.id.navigation_bcs_routine:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, bcsRoutineFragment).commit();
                return true;

            case R.id.navigation_bank_routine:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, bankRoutineFragment).commit();
                return true;

            case R.id.navigation_pdf:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, pdfSectionFragment).commit();
                return true;

            case R.id.navigation_notifications:
                getSupportFragmentManager().beginTransaction().replace(R.id.container, notificationFragment).commit();
                return true;
        }

        return false;
    }

    /**
     * Called when pointer capture is enabled or disabled for the current window.
     *
     * @param hasCapture True if the window has pointer capture.
     */
    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}