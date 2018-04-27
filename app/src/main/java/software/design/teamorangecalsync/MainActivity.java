package software.design.teamorangecalsync;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addCalendarsToScrollView();
        addEventsToCalendarView();
    }


    private void addCalendarsToScrollView() {

        ArrayList<MainCalendar> calendars = MainCalendar.getCalendars();

        // Find the Linear layout in the ScrollView
        LinearLayout sv = findViewById(R.id.linearLayout);

        // Add each calendar as a checkbox object to the linear layout
        for(MainCalendar cal : calendars) {
            CheckBox checkBox = new CheckBox(this);

            checkBox.setText(cal.getName());       // Add text
            checkBox.setId(cal.getId());           // Set id
            checkBox.setTextColor(cal.getColor()); // Set color
            checkBox.setChecked(cal.isActive());   // Set checkbox checked

            sv.addView(checkBox);                  // Add to scroll view
        }

    }
    private void addEventsToCalendarView() {
        //TODO: implement this using the compact calendar view component from the git API

    }

}
