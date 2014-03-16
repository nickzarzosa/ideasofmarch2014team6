package monterey_housing.ideasofmarch2014team6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends Activity {

    private ListView listView1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ha_activity_main);
        buttonHandlers();
    }
    
    

    protected void buttonHandlers(){
    	final Button showAll = (Button) findViewById(R.id.button0);
    	final Button mapDirections = (Button) findViewById(R.id.button4);
    	
    	  showAll.setOnClickListener(new View.OnClickListener()
    	    {
    	    	public void onClick(View v){
    	    		//start intnet
    	    		openListViewActivity();    	    		
    	    	}
    	    	
    	    });
    	  
    	  mapDirections.setOnClickListener(new View.OnClickListener()
  	    {
  	    	public void onClick(View v){
  	    		//start intnet
  	    		openHa_mapsActivity();    	    		
  	    	}
  	    	
  	    });

    }
    
    private void openListViewActivity(){
    	 Intent intent = new Intent(this, ListViewActivity.class);
    	 startActivity(intent);
    }
    
    private void openHa_mapsActivity(){
    	Intent intent = new Intent(this, ha_maps.class);
   	 	startActivity(intent);
    }
}