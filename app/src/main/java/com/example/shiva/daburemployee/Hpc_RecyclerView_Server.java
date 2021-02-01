package com.example.shiva.daburemployee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Hpc_RecyclerView_Server extends AppCompatActivity {

    private static final String TAG="Hpc_RecyclerView_Server";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hpc__recycler_view__server);

        Log.d(TAG, "onCreate: started.");

        imageView=findViewById(R.id.image);

        String url="https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/Month%2F1.png?alt=media&token=bd061417-1c49-4995-bdc9-b691951f4ad8";//Retrieved url as mentioned above

        Glide.with(getApplicationContext()).load(url).into(imageView);


        initImageBitmaps();
    }
    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/outletapp-b033c.appspot.com/o/Schemes%2FHcotc%2Fpudinhara.png?alt=media&token=b251e25b-4628-4ef5-9d6d-3c665c956eb4");
        mNames.add("DABUR PUDIN HARA");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/outletapp-b033c.appspot.com/o/Schemes%2FHcotc%2Fhingoli.png?alt=media&token=f821222e-10b4-498b-a025-f6f1df939b65");
        mNames.add("DABUR HINGOLI");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/outletapp-b033c.appspot.com/o/Schemes%2FHcotc%2Fisabgol.png?alt=media&token=feb7511e-556d-4970-ab90-778418bf1d38");
        mNames.add("DABUR ISABGOL");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/outletapp-b033c.appspot.com/o/Schemes%2FHcotc%2Fkabzover.png?alt=media&token=3b35a77a-9c33-40a5-bc9e-b3eb72d2e80d");
        mNames.add("NATURE CARE KABZ OVER");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/outletapp-b033c.appspot.com/o/Schemes%2FHcotc%2Factivebloodpurifier.png?alt=media&token=691b9874-1c5b-4851-8e5a-08544fee515c");
        mNames.add("DABUR ACTIVE BLOOD PURIFIER");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/outletapp-b033c.appspot.com/o/Schemes%2FHcotc%2Fhonitus.png?alt=media&token=6cf4ca87-1ee5-41ad-b9a9-4eef6476b521");
        mNames.add("DABUR HONITUS");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/outletapp-b033c.appspot.com/o/Schemes%2FHcotc%2Fbadamtail.png?alt=media&token=e62cf725-06b1-4bdc-a34c-da40f477f577");
        mNames.add("DABUR BADAM TAIL");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/outletapp-b033c.appspot.com/o/Schemes%2FHcotc%2Fgripewater.png?alt=media&token=9be88bc9-bf39-4b74-861a-90172ac6e230");
        mNames.add("GRIPE WATER");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/outletapp-b033c.appspot.com/o/Schemes%2FHcotc%2Fjanmaghunti.png?alt=media&token=9b226ac8-062a-4efe-9f47-23f7a147c978");
        mNames.add("JANMA GHUNTI");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/outletapp-b033c.appspot.com/o/Schemes%2FHcotc%2Fshilajit.png?alt=media&token=729fae12-7a15-49c1-a298-895a3c39774d");
        mNames.add("SHILAJIT");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/outletapp-b033c.appspot.com/o/Schemes%2FHcotc%2Fmahabhringraj.png?alt=media&token=20d45175-5e36-4fd6-b258-faa0af1bd9b9");
        mNames.add("MAHA BHRINGRAJ HAIR OIL");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/outletapp-b033c.appspot.com/o/Schemes%2FHcotc%2Fmadhuvaani.png?alt=media&token=9922447c-d514-4444-bf79-c61d962147d8");
        mNames.add("HONITUS MADHUVAANI");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/outletapp-b033c.appspot.com/o/Schemes%2FHcotc%2Flavan.png?alt=media&token=b4a91a7e-28d2-42db-8b66-80d087b0e200");
        mNames.add("LAVAN BHASKAR CHURNA");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/outletapp-b033c.appspot.com/o/Schemes%2FHcotc%2Fmahanarayantail.png?alt=media&token=7024a0ae-a365-45fa-abb6-abf0c2e025e5");
        mNames.add("MAHANARAYAN TAIL");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/outletapp-b033c.appspot.com/o/Schemes%2FHcotc%2Fashokarishta.png?alt=media&token=6b8ae633-7ce4-4cf1-a60f-b92a2ed288b1");
        mNames.add("ASHOKARISHTA");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/outletapp-b033c.appspot.com/o/Schemes%2FHcotc%2Frestora.png?alt=media&token=0921bbdf-c2f4-4566-9e6c-706113ae3de5");
        mNames.add("WOMEN RESTORATIVE");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/outletapp-b033c.appspot.com/o/Schemes%2FHcotc%2Frestora.png?alt=media&token=0921bbdf-c2f4-4566-9e6c-706113ae3de5");
        mNames.add("SEASON PLAN");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/outletapp-b033c.appspot.com/o/Schemes%2Fseasonplan%2Fseasonplan1.png?alt=media&token=865287ff-0fa4-4997-8afb-18acff728735");
        mNames.add("SEASON PLAN 1");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/outletapp-b033c.appspot.com/o/Schemes%2Fseasonplan%2Fseasonplan2.png?alt=media&token=a41e267c-1140-4cf5-b731-98e9053dcc7a");
        mNames.add("SEASON PLAN 2");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/outletapp-b033c.appspot.com/o/Schemes%2Fseasonplan%2Fseasonplan3.png?alt=media&token=560f2442-815e-4b37-989d-cc0dc4b4b7dc");
        mNames.add("SEASON PLAN 3");


        initRecyclerView();
    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerAdapterServerAllScheme adapter = new RecyclerAdapterServerAllScheme(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
