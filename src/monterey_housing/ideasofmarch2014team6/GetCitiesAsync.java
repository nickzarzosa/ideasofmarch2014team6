package monterey_housing.ideasofmarch2014team6;

import java.util.ArrayList;
import java.util.StringTokenizer;

import android.os.AsyncTask;
import android.widget.Toast;

public class GetCitiesAsync extends AsyncTask<Object, Object, Object> {

	public GetCitiesAsync(){
		
	}

	@Override
	protected Object doInBackground(Object... arg0) {
		// TODO Auto-generated method stub
		
		return ServerInterface.getCities("http://secure.loosescre.ws/~keith/hamonterey.org/Mserver.php?command=getCities");
	}
	protected void onPostExecute(Object objResult) {
		  // check to make sure we're dealing with a string
        if(objResult != null && objResult instanceof String) {                          
                String result = (String) objResult;
                // this is used to hold the string array, after tokenizing
               
				ArrayList<String> citiesList = null;

                // we'll use a string tokenizer, with "," (comma) as the delimiter
                StringTokenizer tk1 = new StringTokenizer(result, " , ");

                // now we know how long the string array is
                
                int j = 0 ;
                while (tk1.hasMoreTokens()) {              
                		citiesList.add(tk1.nextToken());
                    }
                    
        } else {
            Toast.makeText( null, "Internet NOT Available, Try Later.", Toast.LENGTH_SHORT).show();

        }

	}
	
}
