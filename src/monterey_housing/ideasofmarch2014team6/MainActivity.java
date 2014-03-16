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
//    DataPull testPull = new DataPull();
    setContentView(R.layout.ha_activity_main);

  }

} 

