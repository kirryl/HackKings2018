package com.example.kevin.front_end;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import android.view.*;
import android.widget.*;

public class eventsList extends AppCompatActivity {

    private ArrayList<String> data = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Events");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv = (ListView) findViewById(R.id.listview);
        generateListContent();
        lv.setAdapter(new MyListAdaper(this, R.layout.activity_events_list, data));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                createEventPage();
            }
        });
    }

    private void generateListContent() {
        for(int i = 0; i < 3; i++) {
            data.add("This is row number " + i);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        new MenuInflater(this).inflate(R.menu.menu_events_page, menu);
        return true;}

    @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            // Handle item selection
            switch (item.getItemId()) {
                case R.id.action_new:
                    startActivity(new Intent(this, newEvent.class));
                    return true;
                case R.id.action_settings:
                    return true;
                default:
                    return super.onOptionsItemSelected(item);
            }
        }



    private void createEventPage() {
        Intent intent = new Intent(eventsList.this, eventsPage.class);
        startActivity(intent);
    }

    private class MyListAdaper extends ArrayAdapter<String> {
        private int layout;
        private List<String> mObjects;
        private MyListAdaper(Context context, int resource, List<String> objects) {
            super(context, resource, objects);
            mObjects = objects;
            layout = resource;
        }



        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            ViewHolder mainViewholder = null;
            if(convertView == null) {
                LayoutInflater inflater = LayoutInflater.from(getContext());
                convertView = inflater.inflate(layout, parent, false);
                ViewHolder viewHolder = new ViewHolder();
                viewHolder.thumbnail = (ImageView) convertView.findViewById(R.id.list_item_thumbnail);
                viewHolder.title = (TextView) convertView.findViewById(R.id.list_item_text);
                viewHolder.button = (Button) convertView.findViewById(R.id.list_item_btn);
                convertView.setTag(viewHolder);
            }
            mainViewholder = (ViewHolder) convertView.getTag();
            mainViewholder.button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getContext(), "Button was clicked for list item " + position, Toast.LENGTH_SHORT).show();
                }
            });
            mainViewholder.title.setText(getItem(position));

            return convertView;
        }
    }

    public class ViewHolder {

        ImageView thumbnail;
        TextView title;
        Button button;
    }
}
