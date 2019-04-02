package com.example.myapplication3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class OurAdapter extends ArrayAdapter {

    private final ArrayList<Animal> animals;
    private final Activity activity;

    public OurAdapter(Activity activity, ArrayList<Animal> animals){
        super(activity, R.layout.list_item, animals);
        this.activity = activity;
        this.animals = animals;
    }

//    vkladame obsah prvkov v liste
    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = activity.getLayoutInflater();
//        nafukovac / aby sme dostali nase data, do list_view
//        pomocou nafukovaca vezmeme item list, vztiahneme si z neho referencie na views, kam chceme data vlastne data
        View rowView = inflater.inflate(R.layout.list_item, null, true);
//        nastavujeme, ake data sa budu kde zobrayovat
//        1 ziskame si reference na views v sml:
        TextView title = rowView.findViewById(R.id.title);
        TextView info = rowView.findViewById(R.id.info);
        ImageView image = rowView.findViewById(R.id.image);

//        2 nastavime do nich data z listu:
        title.setText(animals.get(position).getName());
        info.setText(animals.get(position).getInfo());
        image.setImageResource(animals.get(position).getImage());

        return rowView;

    }

}
