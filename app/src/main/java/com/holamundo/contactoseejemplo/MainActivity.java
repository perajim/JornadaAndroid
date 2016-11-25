package com.holamundo.contactoseejemplo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView= (ListView) findViewById(R.id.listcontactos);
        Contacto  contactos [] = new Contacto[]{
                new Contacto(R.drawable.ic_launcher,"Alda"),
                new Contacto(R.drawable.ic_launcher,"Nashely"),
                new Contacto(R.drawable.ic_launcher,"Conchita"),
                new Contacto(R.drawable.ic_launcher,"Triste"),
                new Contacto(R.drawable.ic_launcher,"Monce"),
                new Contacto(R.drawable.ic_launcher,"Presi"),
                new Contacto(R.drawable.ic_launcher,"Etc, etc"),
                new Contacto(R.drawable.ic_launcher,"Rafa")
        };
        ContactoAdaptador adaptador = new ContactoAdaptador(this, R.layout.list_item_row, contactos);
        listView.setAdapter(adaptador);
    }

}
