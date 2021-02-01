package com.example.shiva.daburemployee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Hc_Otc_RecyclerView_Server extends AppCompatActivity {

    private static final String TAG="Hc_Otc_RecyclerView_Server";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hc__otc__recycler_view__server);

        //  Log.d(TAG, "onCreate: started.");

        imageView=findViewById(R.id.image);

        String url="https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/Month%2F1.png?alt=media&token=bd061417-1c49-4995-bdc9-b691951f4ad8";//Retrieved url as mentioned above

        Glide.with(getApplicationContext()).load(url).into(imageView);


        initImageBitmaps();
    }
    private void initImageBitmaps(){
        // Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FHcOtc%2Fpudinhara.png?alt=media&token=6416899a-b749-4136-a4d3-2f6029b0cd54");
        mNames.add("DABUR PUDIN HARA");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FHcOtc%2Fhingoli.png?alt=media&token=b62e648f-f33a-4b03-b034-98fb8df5795f");
        mNames.add("DABUR HINGOLI");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FHcOtc%2Fisabgol.png?alt=media&token=39f4733e-0ed0-47e4-ae26-18dd5b1b67ec");
        mNames.add("DABUR ISABGOL");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FHcOtc%2Fkabzover.png?alt=media&token=f926a50e-81ec-4ba4-b8c0-db4e313704f8");
        mNames.add("NATURE CARE KABZ OVER");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FHcOtc%2Factivebloodpurifier.png?alt=media&token=953ac87f-6f7f-4b2a-9c32-32cf816d7742");
        mNames.add("DABUR ACTIVE BLOOD PURIFIER");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FHcOtc%2Fhonitus.png?alt=media&token=e76e5351-4d5c-4c58-82d2-b1d1190f0ae9");
        mNames.add("DABUR HONITUS");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FHcOtc%2Fbadamtail.png?alt=media&token=e04e16c2-7d88-41df-abfb-be858b6296b8");
        mNames.add("DABUR BADAM TAIL");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FHcOtc%2Fgripewater.png?alt=media&token=1f0af385-a861-449c-b4e7-ad5fba098431");
        mNames.add("GRIPE WATER");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FHcOtc%2Fjanmaghunti.png?alt=media&token=a5a1225a-c917-466f-8829-d9871820cf65");
        mNames.add("JANMA GHUNTI");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FHcOtc%2Fshilajit.png?alt=media&token=7a284594-bd41-449a-9cd1-f9c66ddc8a26");
        mNames.add("SHILAJIT");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FHcOtc%2Fmahabhringraj.png?alt=media&token=af4a9a86-0b26-40a6-a977-b0473c156534");
        mNames.add("MAHA BHRINGRAJ HAIR OIL");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FHcOtc%2Fmadhuvaani.png?alt=media&token=d6991abe-b5b6-49df-87fd-418e92cdcec8");
        mNames.add("HONITUS MADHUVAANI");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FHcOtc%2Flavan.png?alt=media&token=7a884410-afdf-42b5-b6eb-cb87cfbfdda1");
        mNames.add("LAVAN BHASKAR CHURNA");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FHcOtc%2Fmahanarayantail.png?alt=media&token=c210bf71-fb33-428b-9386-df326d85953c");
        mNames.add("MAHANARAYAN TAIL");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FHcOtc%2Fashokarishta.png?alt=media&token=0a324d24-408e-4c9f-9864-c60b87b4a6a6");
        mNames.add("ASHOKARISHTA");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FHcOtc%2Frestora.png?alt=media&token=ce1d7bde-fbfe-40cd-8803-b6f61e5f8489");
        mNames.add("WOMEN RESTORATIVE");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FHcOtc%2Fseasonplan1.png?alt=media&token=ea35129b-0d37-43b7-8811-d5ab34571ddf");
        mNames.add("SEASON PLAN 1");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FHcOtc%2Fseasonplan2.png?alt=media&token=63b3b570-2caa-410b-8682-d48b26fa55d4");
        mNames.add("SEASON PLAN 2");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FHcOtc%2Fseasonplan3.png?alt=media&token=40db2dda-ced2-45dc-9f7c-0cf39215fd29");
        mNames.add("SEASON PLAN 3");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/DaburScheme%2FHcOtc%2Fseasonplan4.png?alt=media&token=f35b5659-95ac-40c9-8db1-1b139cac74c3");
        mNames.add("SEASON PLAN 4");


        initRecyclerView();
    }

    private void initRecyclerView(){
        //   Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerAdapterServerAllScheme adapter = new RecyclerAdapterServerAllScheme(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
