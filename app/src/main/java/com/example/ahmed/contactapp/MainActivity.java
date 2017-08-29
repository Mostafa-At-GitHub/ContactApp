package com.example.ahmed.contactapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.ahmed.contactapp.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_list);
        
        ArrayList<Contact> contacts = new ArrayList<Contact>();

        contacts.add(new Contact("Ahmed Ramadan","01157268780",R.drawable.male));
        contacts.add(new Contact("Gamal Attia","01111222211",R.drawable.male));
        contacts.add(new Contact("Khaled Mohamed","01001001001",R.drawable.male));
        contacts.add(new Contact("Dina Mohamed","01551551555",R.drawable.female));
        contacts.add(new Contact("Esraa Ali","01222555999",R.drawable.female));
        contacts.add(new Contact("Ahmed Ali","01157258740",R.drawable.male));
        contacts.add(new Contact("Mostafa Mohamed","01157268780",R.drawable.male));
        contacts.add(new Contact("Hager Mohamed","0115785260",R.drawable.female));
        contacts.add(new Contact("Ahmed Ramy","01155648780",R.drawable.male));
        contacts.add(new Contact("Ahmed Ramadan","01157268780",R.drawable.male));
        contacts.add(new Contact("Gamal Attia","01111222211",R.drawable.male));
        contacts.add(new Contact("Khaled Mohamed","01001001001",R.drawable.male));
        contacts.add(new Contact("Dina Mohamed","01551551555",R.drawable.female));
        contacts.add(new Contact("Esraa Ali","01222555999",R.drawable.female));
        contacts.add(new Contact("Ahmed Ali","01157258740",R.drawable.male));
        contacts.add(new Contact("Mostafa Mohamed","01157268780",R.drawable.male));
        contacts.add(new Contact("Hager Mohamed","0115785260",R.drawable.female));
        contacts.add(new Contact("Ahmed Ramy","01155648780",R.drawable.male));



        ContactAdapter itemAdapter=
                new ContactAdapter(this,contacts);

        ListView listView = (ListView) findViewById(R.id.list);



        listView.setAdapter(itemAdapter);

    }
}
