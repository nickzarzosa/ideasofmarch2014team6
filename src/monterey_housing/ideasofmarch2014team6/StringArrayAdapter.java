package monterey_housing.ideasofmarch2014team6;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class StringArrayAdapter extends ArrayAdapter<Model> {
  Context context;
  int layoutResourceId;
  Model data[] = null;

  public StringArrayAdapter(Context context, int layoutResourceId,
	Model data[] ) {
    super(context, R.layout.listview_item_row, data);
    this.context = context;
    this.data = data;
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent)  {
	  View row = convertView;
	  ModelHolder holder = null;
	  
	  if(row == null)
	  {
		  LayoutInflater inflater = ((Activity)context).getLayoutInflater();
		  row = inflater.inflate(layoutResourceId, parent, false);
		  
		  holder = new ModelHolder();
		  holder.txtValOne = (TextView)row.findViewById(R.id.txtValOne);
          holder.txtValTwo = (TextView)row.findViewById(R.id.txtValTwo); 
          
          row.setTag(holder);
	  }
	  else
	  {
		  holder = (ModelHolder)row.getTag();
	  }
	  
	  Model model = data[position];
	  holder.txtValOne.setText(model.val1);
	  holder.txtValTwo.setText(model.val2);
	  
	  return row;
  }
  
  static class ModelHolder
  {
      TextView txtValOne;
      TextView txtValTwo;
  }
}