package rasad03.gmail.com.busbangla20;

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
import android.content.Intent;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
    public final static String EXTRA_ORIGIN = "com.gmail.rasad03.busbangla20.ORIGIN";
    public final static String EXTRA_DESTINATION = "com.gmail.rasad03.busbangla20.DESTINATION";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }


    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class); // intent to pass information between main and display message activity
        EditText editOrigin = (EditText) findViewById(R.id.edit_origin);
        EditText editDestination = (EditText) findViewById(R.id.edit_destination);
        String textOrigin = editOrigin.getText().toString();
        String textDestination = editDestination.getText().toString();
        intent.putExtra(EXTRA_DESTINATION, textDestination);
        intent.putExtra(EXTRA_ORIGIN, textOrigin);
        startActivity(intent);
    }
}
