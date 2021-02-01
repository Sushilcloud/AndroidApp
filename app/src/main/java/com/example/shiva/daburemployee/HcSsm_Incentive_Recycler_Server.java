package com.example.shiva.daburemployee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class HcSsm_Incentive_Recycler_Server extends AppCompatActivity {

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hc_ssm__incentive__recycler__server);

        imageView=findViewById(R.id.image);



        String url="https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/Month%2F1.png?alt=media&token=bd061417-1c49-4995-bdc9-b691951f4ad8";//Retrieved url as mentioned above

        Glide.with(getApplicationContext()).load(url).into(imageView);

        initImageBitmaps();
    }

    private void initImageBitmaps(){



        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/FieldIncentive%2FFoodSsm%2Fregular.png?alt=media&token=cc10bee9-f147-4d4d-b56e-174a8de85411");
        mNames.add("MONTHLY REGULAR INCENTIVE");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/FieldIncentive%2FFoodSsm%2Flines.png?alt=media&token=99d27f03-8ac3-48f6-8e91-7f7dcf68d120");
        mNames.add("MONTHLY LINES INCENTIVE");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/FieldIncentive%2FFoodSsm%2Fbrandeco.png?alt=media&token=11b83e68-437b-4d99-b80d-5ac21c09aac5");
        mNames.add("BRAND ECO INCENTIVE");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/FieldIncentive%2FFoodSsm%2Fwsssm.png?alt=media&token=b51d7333-5135-49c7-a682-fd24485721ac");
        mNames.add("WHOLESALE SSM INCENTIVE");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/FieldIncentive%2FFoodSsm%2Fseasonplan1.png?alt=media&token=f3b1292a-dc3f-45d8-835e-0c99bdbcf7a9");
        mNames.add("SEASON PLAN 1 INCENTIVE");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/FieldIncentive%2FFoodSsm%2Fseasonplan2.png?alt=media&token=ccefe930-036a-45a7-b9c4-a898b2d49678");
        mNames.add("SEASON PLAN 2 INCENTIVE");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/FieldIncentive%2FFoodSsm%2Fotherbrand.png?alt=media&token=7fde86ab-bf64-405f-a98a-bf4a96026280");
        mNames.add("OTHER BRAND INCENTIVE");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/FieldIncentive%2FFoodSsm%2Fgreetings.png?alt=media&token=334e257a-3093-4b22-9937-bcda9e9eda34");
        mNames.add("GREETINGS INCENTIVE");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/FieldIncentive%2FFoodSsm%2Fnpdincentive.png?alt=media&token=459e1a4f-fd3e-4afa-96a3-476aba265a6b");
        mNames.add("NPD INCENTIVE");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/FieldIncentive%2FFoodSsm%2Fadditional.png?alt=media&token=6efe3f83-ff3c-4e15-9e32-35286d73a02b");
        mNames.add("ADDITIONAL INCENTIVE");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/FieldIncentive%2FFoodSsm%2Fcasabrand.png?alt=media&token=81642575-4056-4264-9690-a05c985910a8");
        mNames.add("CASA BRANDS");






        initRecyclerView();
    }

    private void initRecyclerView(){
        // Log.d(TAG, "initRecyclerView: initrecyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view);
        RecyclerAdapterServerSsmParameter adapter = new RecyclerAdapterServerSsmParameter(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
