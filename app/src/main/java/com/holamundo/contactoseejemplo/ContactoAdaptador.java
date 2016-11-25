package com.holamundo.contactoseejemplo;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by perajim on 24/11/2016.
 */
public class ContactoAdaptador extends ArrayAdapter<Contacto> {
    Context contexto;
    int layoutResourceID;
    Contacto contactos[] = null;

    public ContactoAdaptador(Context context, int resource) {
        super(context, resource);
    }

    public ContactoAdaptador(Context contexto, int layoutResourceID, Contacto [] contactos){
        super(contexto,layoutResourceID, contactos);
        this.contexto=contexto;
        this.layoutResourceID=layoutResourceID;
        this.contactos=contactos;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View root = convertView;
        ContactosHolder holder = null;
        if(root == null ){
            LayoutInflater inflater = ((Activity)contexto).getLayoutInflater();
            root = inflater.inflate(layoutResourceID,parent,false);
            holder = new ContactosHolder();
            holder.imagen = (ImageView) root.findViewById(R.id.imagen);
            holder.nombre = (TextView) root.findViewById(R.id.nombre);
            root.setTag(holder);
        }else{
            holder = (ContactosHolder)root.getTag();
        }
        Contacto contacts = contactos[position];
        holder.nombre.setText(contacts.nombre);
        holder.imagen.setImageResource(contacts.icono);
        return root;
    }

    static class ContactosHolder{
        ImageView imagen;
        TextView nombre;
    }


}
