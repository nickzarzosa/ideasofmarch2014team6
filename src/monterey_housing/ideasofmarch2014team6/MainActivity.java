package monterey_housing.ideasofmarch2014team6;
import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.Menu;
import android.widget.ExpandableListView;

public class MainActivity extends Activity {
  // more efficient than HashMap for mapping integers to objects
  SparseArray<Group> groups = new SparseArray<Group>();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    createData();
    ExpandableListView listView = (ExpandableListView) findViewById(R.id.listView);
    MyExpandableListAdapter adapter = new MyExpandableListAdapter(this,
        groups);
    listView.setAdapter(adapter);
  }

  public void createData() {
    for (int i = 0; i < 5; i++) {
    	Group group = new Group("Address " + i, "Bedrooms " + i, "Rent " + i);
    	
		group.children.add("Owner " + i);
		group.children.add("Address " + i);
		group.children.add("City " + i);
		group.children.add("Rent " + i);
		group.children.add("Bedrooms " + i);
		group.children.add("Unit Type " + i);
		group.children.add("Phone " + i);
		group.children.add("OtherInfo " + i);
		group.children.add("Utilites" + i);
		groups.append(i, group);
    }
  }

} 