package com.example.shiva.daburemployee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class NewProductLaunch  extends AppCompatActivity {
    private static final String TAG = "NewProducts";

    //vars
    private ArrayList<String> mNames=new ArrayList<>();
    private ArrayList<String> mImagesurl=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_product_launch);

        Log.d(TAG,"onCreate: started");
        initImageBitmaps();

    }

    private void  initImageBitmaps()
    {
        Log.d(TAG,"initImageBitmaps: preparing bitmaps");

        mImagesurl.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/Npd%2Fnpr1.png?alt=media&token=8dfacbb8-cbb2-47ac-8892-02ca50c3db8d");
        mNames.add("Dabur India Ltd");
        mImagesurl.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/Npd%2Fnpr2.png?alt=media&token=e3f78194-d7b4-4cac-aaac-1f111ca51323");
        mNames.add("Dabur India Ltd");
        mImagesurl.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/Npd%2Fnpr3.png?alt=media&token=d1679120-024c-473f-9a38-b370c0b54b9f");
        mNames.add("Dabur India Ltd");
        mImagesurl.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/Npd%2Fnpr4.png?alt=media&token=05d42334-6a8d-4039-9b08-6bfc58d59e2f");
        mNames.add("Dabur India Ltd");
        mImagesurl.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/Npd%2Fnpr5.png?alt=media&token=bd25de07-acd1-4fdc-aa21-6d66be35b788");
        mNames.add("Dabur India Ltd");
        mImagesurl.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/Npd%2Fnpr6.png?alt=media&token=97f0ac20-1cf5-47ff-a184-f84b23cdfa6c");
        mNames.add("Dabur India Ltd");
        mImagesurl.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/Npd%2Fnpr7.png?alt=media&token=2cb795e9-2fb0-4311-bb65-b8eaa02492ab");
        mNames.add("Dabur India Ltd");
        mImagesurl.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/Npd%2Fnpr8.png?alt=media&token=10c62986-2fe1-41e9-a58e-3cba1033d386");
        mNames.add("Dabur India Ltd");
        mImagesurl.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/Npd%2Fnpr9.png?alt=media&token=e1b8643a-97f7-40c7-8fd4-30a2bba86e69");
        mNames.add("Dabur India Ltd");
        mImagesurl.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/Npd%2Fnpr10.png?alt=media&token=ff02b4c6-8c3c-42ef-a974-8e8cff597292");
        mNames.add("Dabur India Ltd");
        mImagesurl.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/Npd%2Fnpr11.png?alt=media&token=c6618edf-5821-4329-85b4-7ca0fa3d0d5b");
        mNames.add("Dabur India Ltd");
        mImagesurl.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/Npd%2Fnpr12.png?alt=media&token=e29e65be-7451-48e2-a572-c6edaae116c5");
        mNames.add("Dabur India Ltd");
        mImagesurl.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/Npd%2Fnpr13.png?alt=media&token=43da0165-08cf-4841-8115-bb6af4bb4c16");
        mNames.add("Dabur India Ltd");
        mImagesurl.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/Npd%2Fnpr14.png?alt=media&token=2df6e0b7-4b59-457f-bdd5-c8a372fe032b");
        mNames.add("Dabur India Ltd");
        mImagesurl.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/Npd%2Fnpr15.png?alt=media&token=528d0f9b-a769-4f64-8163-e25160e3ff68");
        mNames.add("Dabur India Ltd");
        mImagesurl.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/Npd%2Fnpr16.png?alt=media&token=78afd862-ce5d-48e6-971c-fd33fe2c3476");
        mNames.add("Dabur India Ltd");
        mImagesurl.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/Npd%2Fnpr17.png?alt=media&token=c02ca28c-4839-412b-9c67-660c3f6b00a9");
        mNames.add("Dabur India Ltd");
        mImagesurl.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/Npd%2Fnpr18.png?alt=media&token=e2e6e602-cb27-486c-8af5-c483e1134dff");
        mNames.add("Dabur India Ltd");
        mImagesurl.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/Npd%2Fnpr19.png?alt=media&token=bee7ee94-f0f8-49c9-be73-e2d3aef281ed");
        mNames.add("Dabur India Ltd");
        mImagesurl.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/Npd%2Fnpr20.png?alt=media&token=090e828e-c4f4-4b8a-be71-ad7994a02177");
        mNames.add("Dabur India Ltd");

        initRecyclerView();

    }

    private void    initRecyclerView()
    {
        Log.d(TAG,"initRecyclerView : init recyclerview");
        RecyclerView recyclerView=findViewById(R.id.npdrecycler);
        NpdRecyclerAdapter adapter= new NpdRecyclerAdapter(this,mNames,mImagesurl);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
