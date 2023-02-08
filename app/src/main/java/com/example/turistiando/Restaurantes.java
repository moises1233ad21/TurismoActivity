package com.example.turistiando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Restaurantes extends AppCompatActivity {

    //ATRIBUTOS DE LA CLASE
    ArrayList<Hotel> lista = new ArrayList<>();
    RecyclerView listaLogica;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles);

        listaLogica=findViewById(R.id.recycler);
        listaLogica.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearListaHoteles();
        Adaptador adaptador=new Adaptador(lista);
        listaLogica.setAdapter(adaptador);

    }

    public void crearListaHoteles(){

        lista.add(new Hotel(R.drawable.resta,"Restaurante Rico Rico","$952500"));
        lista.add(new Hotel(R.drawable.asare,"Restaurante Dulsura","$650800"));
        lista.add(new Hotel(R.drawable.amigo,"Restaurante Mar y mas ","$850500"));
        lista.add(new Hotel(R.drawable.normal,"Restaurante Rico Landia","$952050"));

    }
}