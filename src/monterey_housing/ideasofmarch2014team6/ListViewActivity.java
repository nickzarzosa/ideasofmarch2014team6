package monterey_housing.ideasofmarch2014team6;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.Menu;
import android.widget.ExpandableListView;

public class ListViewActivity extends Activity {
  // more efficient than HashMap for mapping integers to objects
	
  SparseArray<Group> groups = new SparseArray<Group>();
  int counter = 0;
  
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.ha_activity_list_view);
    

  	String[] values = new String[] { "SALINAS", "SRO", "50 E MARKET ST", "771-972", "$450 - $540", 
  	        "Call to be put on waiting list. Deposit $650. Call Maribel Monday - Friday 10:00 - 4:30pm."};
    createData(values);
    
    String[] values2 = new String[] {"GREENFIELD", "1","226 SAN ANTONIO DR", "415-410-4408", "$400",
  	        "Available Dec 1. Deposit 400. Call mornings."};
    createData(values2);
    
    String[] values3 = new String[] {"GREENFIELD", "0", "", "676-6281", "$650", 
  	        "Available now. Deposit $650. Call for address"};
    createData(values3);
    
    ExpandableListView listView = (ExpandableListView) findViewById(R.id.listView);
    MyExpandableListAdapter adapter = new MyExpandableListAdapter(this,
        groups);
    listView.setAdapter(adapter);
  }

  public void createData(String[] values) {

	
  	String string;
    
	string = "Address \t" + values[2] +"\n"+ "Bedrooms \t" + values[1] + "\n" + "Rent \t" + values[4];
	Group group = new Group(string);
	
	group.children.add("Address \t" + values[2]);
	group.children.add("City \t" + values[0]);
	group.children.add("Rent \t" + values[4]);
	group.children.add("Bedrooms \t" + values[1]);
	group.children.add("Phone \t" + values[3]);
	group.children.add("OtherInfo \t" + values[5]);
	groups.append(counter, group);
	counter++;
  }
}
