package rasad03.gmail.com.busbangla20;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.TextView;


public class DisplayMessageActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the text view as the activity layout
        setContentView(R.layout.fragment_display_message);




        // Get the message from the intent
        Intent intent = getIntent();
        String origin = intent.getStringExtra(MainActivity.EXTRA_ORIGIN);
        String destination = intent.getStringExtra(MainActivity.EXTRA_DESTINATION);

        // Create the text view
        TextView textDestination = (TextView) findViewById(R.id.textViewDestination);
        textDestination.setTextSize(20);
        textDestination.setText(String.format("Destination: "+"%s",destination));

        TextView textOrigin = (TextView) findViewById(R.id.textViewOrigin);
        textOrigin.setTextSize(20);
        textOrigin.setText(String.format("Origin: "+"%s",origin));



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_display_message, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_display_message, container, false);
            return rootView;
        }
    }
}
