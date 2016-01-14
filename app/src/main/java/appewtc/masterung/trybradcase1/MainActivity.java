package appewtc.masterung.trybradcase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    //Explicit

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get Current Date
        getCurrentDate();

    }   // Main Method

    private void getCurrentDate() {
        Calendar objCalendar = Calendar.getInstance();

        TextView showDateTextView = (TextView) findViewById(R.id.txtShow);
        showDateTextView.setText(objCalendar.getTime().toString());
    }
}   // Main Class
