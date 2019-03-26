package com.example.menulateral;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ListView listView;
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);
        drawerLayout=findViewById(R.id.drawerlayout);
        listView=findViewById(R.id.menulateral);
        linearLayout=findViewById(R.id.contenedor);

        String[] lista={"Opcion 1","Opcion 2","Opcion 3", "Opcion 4", "Opcion 5"};

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,lista);
listView.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id= item.getItemId();

        if(id==android.R.id.home)
        {
            if(drawerLayout.isDrawerOpen(listView)){
                drawerLayout.closeDrawer(listView);
            }else{
                drawerLayout.openDrawer(listView);
            }
        }

        /*if(id==drawerLayout.getId()){
            if(drawerLayout.openDrawer()){
                drawerLayout.is
            }else
        }*/
        return super.onOptionsItemSelected(item);
    }
}
