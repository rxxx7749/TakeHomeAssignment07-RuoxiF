package com.example.android.mainpageyo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {
private List<Person> persons;
private PersonsAdapter personsAdapter;
private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        setTitle("W8ActionBarRecyclerView");

        initialData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        personsAdapter = new PersonsAdapter(persons,this);
        recyclerView.setAdapter(personsAdapter);

    }

    private void initialData(){
        persons = new ArrayList<>();
        persons.add(new Person("Bill Clinton","1993-2001",R.drawable.bill_clinton));
        persons.add(new Person("George W. Bush","2001-2009",R.drawable.bush));
        persons.add(new Person("Bill Clinton","2009-2017",R.drawable.obama));
    }


    public void add(View view){
        persons.add(getRandomPerson());
        personsAdapter.notifyDataSetChanged();

    }



    private Person getRandomPerson(){
        int num = (int) (Math.random()*3);
        if(num == 0) {
            return new Person("Bill Clinton", "1993-2001", R.drawable.bill_clinton);
        }else if(num == 1){
                return new Person("George W. Bush","2001-2009",R.drawable.bush);
        }else{
            return new Person("Bill Clinton","2009-2017",R.drawable.obama);
        }
    }
}
