package com.example.myapplication3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ArrayList<Animal> animals;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animals = new ArrayList<>();
        animals.add(new Animal(R.drawable.alligator, "aligator", "popis aligatora"));
        animals.add(new Animal(R.drawable.bear, "maco", "popis maca"));
        animals.add(new Animal(R.drawable.bee, "vcela", "popis vcely"));
        animals.add(new Animal(R.drawable.bug, "chrobak", "popis chrobaka"));
        animals.add(new Animal(R.drawable.butterfly, "motyl", "popis motyla"));
        animals.add(new Animal(R.drawable.dolphin, "delfin", "popis delfina"));
        animals.add(new Animal(R.drawable.elephant, "slon", "popis slona"));
        animals.add(new Animal(R.drawable.horse, "kon", "popis kona"));
        animals.add(new Animal(R.drawable.mouse, "mys", "popis mysi"));
        animals.add(new Animal(R.drawable.parrot, "papagaj", "popis papagaja"));
        animals.add(new Animal(R.drawable.pig, "prasa", "popis prasiatka"));
        animals.add(new Animal(R.drawable.snail, "slimak", "popis slimaka"));
        animals.add(new Animal(R.drawable.turrtle, "korytnacka", "popis korytnacky"));

        OurAdapter adapter = new OurAdapter(this, animals);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
}
