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
    
  	String[] values = new String[] { "Plaza Grande", "SALINAS", "SRO",
  	        "SRO", "50 E MARKET ST", "771-972", "$450 - $540", "RSTSGW",
  	        "Call to be put on waiting list. Deposit $650. Call Maribel Monday - Friday 10:00 - 4:30pm."};
    createData(values);
    
    String[] values2 = new String[] { "MARCUS MORGAN", "GREENFIELD", "1",
  	        "ROOM", "226 SAN ANTONIO DR", "415-410-4408", "$400", "RSTSGWGE",
  	        "Available Dec 1. Deposit 400. Call mornings."};
    createData(values2);
    
    String[] values3 = new String[] { "EVE", "GREENFIELD", "0",
  	        "STUDIO", "", "676-6281", "$650", "RSTSGW",
  	        "Available now. Deposit $650. Call for address"};
    createData(values3);
    
    ExpandableListView listView = (ExpandableListView) findViewById(R.id.listView);
    MyExpandableListAdapter adapter = new MyExpandableListAdapter(this,
        groups);
    listView.setAdapter(adapter);
  }

  public void createData(String[] values) {

	
  	String string;
    
	string = "Address \t" + values[4] +"\n"+ "Bedrooms \t" + values[2] + "\n" + "Rent \t" + values[6];
	Group group = new Group(string);
	
	group.children.add("Owner \t" + values[0]);
	group.children.add("Address \t" + values[4]);
	group.children.add("City \t" + values[1]);
	group.children.add("Rent \t" + values[6]);
	group.children.add("Bedrooms \t" + values[2]);
	group.children.add("Unit Type \t" + values[3]);
	group.children.add("Phone \t" + values[5]);
	group.children.add("Utilites \t" + values[7]);
	group.children.add("OtherInfo \t" + values[8]);
	groups.append(counter, group);
	counter++;
  }
}
