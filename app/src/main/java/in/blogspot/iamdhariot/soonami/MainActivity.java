package in.blogspot.iamdhariot.soonami;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    /**
     * Displays information about a single earthquake.
     */


    /**Tag for log messages*/
    public static final String LOG_TAG = MainActivity.class.getSimpleName();
    /** URL to query the USGS dataset for earth quake  information*/
    private static final String USGS_REQUEST_URL = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2012-01-01&endtime=2012-12-01&minmagnitude=6";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Kick off an {@link AsyncTask} to perform the network request

    }

    /**
     * {@link AsyncTask} to perform the network request on a background thread, and then
     * update the UI with the first earthquake in the response.
     */

   private class TsunamiAsyncTask extends AsyncTask<URI,Void,Event>{

        @Override
        protected Event doInBackground(URI... uris) {
            // create an url object
            URL url = createUrl(USGS_REQUEST_URL);


            return null;
        }

        /**
         * Returns new URL object from the given string URL.
         */
        private URL createUrl(String usgsRequestUrl) {

            URL url = null;
            try {
                url= new URL(usgsRequestUrl);
            }catch(MalformedURLException e){
                Log.e(LOG_TAG,"Error with creating URL",e);
                return null;

            }
            return url;
        }
    }



}