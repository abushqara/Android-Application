package com.example.carwatch;


import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

public class CarListActivity extends Activity {

    ListView list;
    CustomAdapter adapter;
    public  CarListActivity CustomListView = null;
    public  ArrayList<ListModel> CustomListViewValuesArr = new ArrayList<ListModel>();
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_list);
        
        
        

        CustomListView = this;

        setListData();

        Resources res =getResources();
        list= ( ListView )findViewById( R.id.lstCars );


        adapter=new CustomAdapter( CustomListView, CustomListViewValuesArr,res );
        list.setAdapter( adapter );

    }
    
    
    
    


    public void setListData()
    {

        for (int i = 0; i < 11; i++) {

            final ListModel sched = new ListModel();


            sched.setModel("Company "+i);
            sched.setImage("image"+i);
            sched.setYear("http:\\www."+i+".com");


            CustomListViewValuesArr.add( sched );
        }

    }
    
    
    



    public void onItemClick(int mPosition)
    {
        ListModel tempValues = ( ListModel ) CustomListViewValuesArr.get(mPosition);




        Toast.makeText(CustomListView,""+tempValues.getModel()+"Image:"+tempValues.getImage()+" Url:"+tempValues.getYear(),Toast.LENGTH_LONG).show();
    }
}

