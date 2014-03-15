package monterey_housing.ideasofmarch2014team6;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends ActionBarActivity {

	@Override
	//testing yeah...change 2!
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		// test
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
	
	

}
=======
package monterey_housing.ideasofmarch2014team6;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	//testing yeah...change 2!
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		// test
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

