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

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.ha_activity_list_view);
    createData();
    ExpandableListView listView = (ExpandableListView) findViewById(R.id.listView);
    MyExpandableListAdapter adapter = new MyExpandableListAdapter(this,
        groups);
    listView.setAdapter(adapter);
  }

  public void createData() {
	String address = "Address \t";
  	String bedroom = "Bedrooms \t";
  	String rent = "Rent \t";
  	String[] values = new String[] { "Plaza Grande", "SALINAS", "SRO",
  	        "SRO", "50 E MARKET ST", "771-972", "$450 - $540", "RSTSGW",
  	        "Call to be put on waiting list. Deposit $650. Call Maribel Monday - Friday 10:00 - 4:30pm."};
  	int counter = 0;
  	String string;
    for (int i = 0; i < 5; i++) {
//    	counter = 0;
    	string = address+ values[4] +"\n"+ bedroom + values[2] + "\n" + rent + values[6];
    	Group group = new Group(string);
    	
		group.children.add("Owner \t" + values[0]);
		group.children.add(address + values[4]);
		group.children.add("City \t" + values[1]);
		group.children.add(rent + values[6]);
		group.children.add(bedroom + values[2]);
		group.children.add("Unit Type \t" + values[3]);
		group.children.add("Phone \t" + values[5]);
		group.children.add("Utilites \t" + values[7]);
		group.children.add("OtherInfo \t" + values[8]);
		groups.append(i, group);
    }
  }

} 

