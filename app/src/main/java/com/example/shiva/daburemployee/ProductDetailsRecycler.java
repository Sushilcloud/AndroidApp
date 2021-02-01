package com.example.shiva.daburemployee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ProductDetailsRecycler extends AppCompatActivity {

    private int[] fruit_id={

            R.drawable.foods,
            R.drawable.titlerealltr2,
            R.drawable.orangeltr,R.drawable.mangoltr,R.drawable.mixltr, R.drawable.pineappleltr,
            R.drawable.guavaltr,R.drawable.litchiltr,R.drawable.appleltr,R.drawable.pomegranateltr,
            R.drawable.mosambiltr
            ,R.drawable.grapeltr,R.drawable.jamunltr,R.drawable.tomatoltr,R.drawable.cranberryltr,
            R.drawable.apricotltr,R.drawable.alphansoltr,R.drawable.masalaguava,R.drawable.masalapome,
            R.drawable.masalamix,
            R.drawable.mixbarries,

            R.drawable.orange200ml,R.drawable.mango200ml
            ,R.drawable.mix200ml,R.drawable.pineapple200ml,R.drawable.guava200ml,R.drawable.litchi200ml
            ,R.drawable.apple200ml,R.drawable.pome200ml,R.drawable.mosambi200ml,R.drawable.grape200ml,
            R.drawable.jamun200ml,
            R.drawable.cranberry200ml,

            R.drawable.coconutwater,


            R.drawable.activemixltr,R.drawable.activeorangeltr,R.drawable.activeorangecarrorltr,
            R.drawable.beetrootltr,
            R.drawable.cucumberltr,
            R.drawable.multifiberltr,R.drawable.orangecitrusltr,

            R.drawable.gingergarlic100,R.drawable.gingergarlic200
            ,R.drawable.ginger200,R.drawable.garlic200,R.drawable.tomatopuree,R.drawable.coconutmilk,R.drawable.lemoneez
            ,R.drawable.tamarind200,
            R.drawable.healthcare,

            R.drawable.daburchyawanprash,R.drawable.honey,
            R.drawable.glucose,R.drawable.hajmola,
            R.drawable.hajmolacandy,R.drawable.pudinhara,R.drawable.pudinharalemonfizz,
            R.drawable.isbgol,R.drawable.naturecare
            ,R.drawable.naturecareregular,R.drawable.naturecareisabgolpowder,
            R.drawable.honituscoughtsyrup,R.drawable.honituscoughdrops
            ,R.drawable.honitusmadhuvaani,R.drawable.shilajitsmall,R.drawable.shilajitxoil,
            R.drawable.dashmularisht
            ,R.drawable.activebloodpurifier,R.drawable.ashokarishta,
            R.drawable.babylaltail,R.drawable.babyjanamghutti,R.drawable.babygripewater,
            R.drawable.babymessageoil,

            R.drawable.haircare,


            R.drawable.amlahairoil,R.drawable.vatikaenrichedcoconuthairoilsmal,
            R.drawable.almondhairoil,R.drawable.vatikaenrichedolivehairoil,
            R.drawable.vatikajasminehairoil,R.drawable.vatikaenrichedcoconutoilwithhibiscus
            ,R.drawable.vatikaenrichedcoconuthairoilsmal,R.drawable.vatikabb
            ,R.drawable.almondnourishmentnowinashampoo,R.drawable.vatikahealthshampoosmall
            ,R.drawable.vatikablackshineshampoosmall,R.drawable.vatikaantidandruffshampoosmall,

            R.drawable.skincare,

            R.drawable.femgoldsmall,R.drawable.gulabarirosewater,
            R.drawable.oxylifefacial,R.drawable.facefreshenersmall,
            R.drawable.oxybleach,R.drawable.moisturisingcream
            ,R.drawable.fempearl,R.drawable.moisturisinglotionsmall
            ,R.drawable.femsaffron,R.drawable.femturmeric
            ,R.drawable.antidarkeninghairremovalcream,R.drawable.antidarkeninghairremovalcreamturmericsamll,
            R.drawable.antidarkeninghairremovalcreamgoldsmall,R.drawable.antidarkeninghairremovalcreamrosesmal,
            R.drawable.fempearlfacialkit,

            R.drawable.oralcare,

            R.drawable.daburred,R.drawable.babool,R.drawable.laldantmanjan,R.drawable.meswak,

            R.drawable.homecare,

            R.drawable.odonil,R.drawable.odomas,R.drawable.sanifresh,R.drawable.odoniloccasions,
            R.drawable.odopic

    };


    private String[] fruits_name;
    private List<fruit> fruits=new ArrayList<>();
    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details_recycler);

        fruits_name=getResources().getStringArray(R.array.fruit_name);
        recyclerView=findViewById(R.id.mRecyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        getfruit();

        adapter=new RecyclerAdapter(fruits);
        recyclerView.setAdapter(adapter);

    }
    private void getfruit()
    {
        int count=0;
        for (String fruitname : fruits_name)
        {
            fruit fruit= new fruit(fruit_id[count],fruitname);
            fruits.add(fruit);
            count++;
        }
    }

}
