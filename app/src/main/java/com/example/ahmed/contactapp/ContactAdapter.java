package com.example.ahmed.contactapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ahmed.contactapp.R;

import java.util.ArrayList;

/**
 * Created by Ahmed on 29/08/2017.
 */

public class ContactAdapter extends ArrayAdapter<Contact> {


    public ContactAdapter(Activity context, ArrayList<Contact> contacts)
    {
        super(context,0,contacts);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Contact currentContact = getItem(position);

        TextView englishtextview = (TextView) listItemView.findViewById(R.id.contact_name);
        englishtextview.setText(currentContact.getmName());

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.contact_number);
        miwokTextView.setText(currentContact.getmPhoneNumber());


        ImageView image = (ImageView) listItemView.findViewById(R.id.image);

        image.setImageResource(currentContact.getmImageResourceID());
        image.setVisibility(View.VISIBLE);


        return listItemView ;

    }
}
