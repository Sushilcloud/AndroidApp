package com.example.shiva.daburemployee;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.app.DownloadManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;
import android.widget.ViewFlipper;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.File;
import java.util.ArrayList;

import static android.os.Environment.DIRECTORY_DOWNLOADS;

public class WelcomeScreen extends AppCompatActivity {



    //Navigation Code Start

    private DrawerLayout d1;
    private ActionBarDrawerToggle abdt;


    //var for Vedio Code
    VideoView video;
    String video_url = "https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/WelcomeVideo%2Fadd.mp4?alt=media&token=49d30d65-07d1-4e72-aa6d-859ba36aeef7";
    ProgressDialog pd;
    MediaController mediaControls;
    ViewFlipper v_flipper;

    // View Pager Variabl
    private static ViewPager mPager,bPager;
    private static int currentPage = 0;
    private static int NUM_PAGES = 0;

    private String[] urls = new String[]{
            "https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/WelcomePager%2F1.png?alt=media&token=cfff47d5-b75d-487d-b5ab-cf44a7d52c45",

            "https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/WelcomePager%2F2.png?alt=media&token=fc7028e6-2979-4983-8cf1-f92f09577858",

            "https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/WelcomePager%2F3.png?alt=media&token=24b74151-a6cb-4d4b-b09b-26df08a28414",
            "https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/WelcomePager%2F4.png?alt=media&token=37618b74-6306-4a47-b9b2-9ed191d4a872",
            "https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/WelcomePager%2F5.png?alt=media&token=66f5d95e-c13b-4b48-971f-5e5a8014f98a",
            "https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/WelcomePager%2F6.png?alt=media&token=3d9c175a-6921-4499-abab-459beab0f8d5",
            "https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/WelcomePager%2F7.png?alt=media&token=eedba2e8-5313-4975-a499-4c0d8ae24930",
            "https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/WelcomePager%2F8.png?alt=media&token=19784d56-6c85-4c78-bfa3-08b60e2d2d9c"};

    private String[] urls1 = new String[]{
            "https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/BrandSchemes%2F1.png?alt=media&token=d1e77226-bab5-4721-bde9-0193a812c91d",

            "https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/BrandSchemes%2F2.png?alt=media&token=889ae97a-92a9-4c69-aafc-2de29c735361",

            "https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/BrandSchemes%2F3.png?alt=media&token=06b46597-ea15-4eb2-be4e-b7c2a6abf1b6",
            "https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/BrandSchemes%2F4.png?alt=media&token=ba3b4ebf-4ab6-48fc-8069-14570a672209",
            "https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/BrandSchemes%2F5.png?alt=media&token=53bd7f49-4383-454d-988e-6a132666ce2f",
            "https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/BrandSchemes%2F6.png?alt=media&token=e77ec227-faf4-4d1a-82ae-d50b6897e74b",
            "https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/BrandSchemes%2F7.png?alt=media&token=1407cf08-8c31-4a6a-8bee-8744779e6e5a",
            "https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/BrandSchemes%2F8.png?alt=media&token=d7835638-1a3e-4e44-b646-1d45a4de7a9c",
            "https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/BrandSchemes%2F9.png?alt=media&token=fadabb34-0997-46a4-8a44-7376c51eaf36",
            "https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/BrandSchemes%2F10.png?alt=media&token=d2af0278-9211-45f1-99f4-0ccd143ca1f5",
            "https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/BrandSchemes%2F11.png?alt=media&token=7210d0dd-8052-4933-94df-eb01d355c6bf",
            "https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/BrandSchemes%2F12.png?alt=media&token=1030c1e4-b2d7-411f-a39f-84477a9648f8",
            "https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/BrandSchemes%2F13.png?alt=media&token=438e2bb0-ebe4-4447-958c-8c21d4435c6b"};



    // View Pager End Here
    //
    //vars for Horizontal Recycler View
    // Below all HOrizontal Recycler Steps
    // Method Call initrecyclerView
    // Java Class Adapter class RecyclerAdapter Server Banner
    //  Gallery Activity Server Banner New Activity for Show Pic To New Activity
    // Layoutfile Horizontal Recycler List Item
    // Method Call Get Images

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    // Image Button variable
    ImageButton imageButton;



    private Button button,down;

    // variable for Downlaod

    FirebaseStorage firebaseStorage;
    StorageReference storageReference;
    StorageReference ref;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);


        notificationchannel();


        init();
        getImages();

        //Download Applicatin apk file from firebase
        down=findViewById(R.id.updateapp);
        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                download();

            }
        });

        // End Download Application

        //flipper image code

        int images[] = {R.drawable.healthcaretop, R.drawable.haircaretop, R.drawable.hommade,
                R.drawable.oralcaretop, R.drawable.skincaretop, R.drawable.activeltrtop};
        v_flipper = findViewById(R.id.v_flipper);

        for (int image : images) {
            flipperimages(image);
        }



        //Navigation Code Start


        d1=findViewById(R.id.drawer);
        abdt=new ActionBarDrawerToggle(WelcomeScreen.this,d1,R.string.Open,R.string.Close);
        abdt.setDrawerIndicatorEnabled(true);

        d1.addDrawerListener(abdt);
        abdt.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        final NavigationView nav_view=findViewById(R.id.nav_view);
        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id=item.getItemId();

                if(id==R.id.myprofile)
                {
                    Toast.makeText(WelcomeScreen.this,"MyProfile", Toast.LENGTH_SHORT).show();
                }
                else
                if(id==R.id.settings)
                {
                    Toast.makeText(WelcomeScreen.this,"Settings", Toast.LENGTH_SHORT).show();

                }
                else
                if(id==R.id.editprofile)
                {
                    Toast.makeText(WelcomeScreen.this,"EditProfile", Toast.LENGTH_SHORT).show();
                }
                else
                if(id==R.id.daburproduct)
                {
                    Toast.makeText(WelcomeScreen.this,"Dabur Product", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(WelcomeScreen.this, ProductDetailsRecycler.class);
                    startActivity(intent);
                }

                else

                if(id==R.id.foodmarginchart)
                {
                    Toast.makeText(WelcomeScreen.this,"Dabur Margin Chart", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(WelcomeScreen.this, Foods_All_Margin_Details.class);
                    startActivity(intent);
                }

                else

                if(id==R.id.hcbasemarginchart)
                {
                    Toast.makeText(WelcomeScreen.this,"Dabur Margin Chart", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(WelcomeScreen.this, Hc_Margin_Details.class);
                    startActivity(intent);
                }

                else

                if(id==R.id.hcotcmarginchart)
                {
                    Toast.makeText(WelcomeScreen.this,"Dabur Margin Chart", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(WelcomeScreen.this, Hc_Otc_Margin_Details.class);
                    startActivity(intent);
                }

                else

                if(id==R.id.hpcmarginchart)
                {
                    Toast.makeText(WelcomeScreen.this,"Dabur Margin Chart", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(WelcomeScreen.this, Hpc_Margin_Details.class);
                    startActivity(intent);
                }
                else
                if(id==R.id.scheme)
                {
                    Toast.makeText(WelcomeScreen.this,"Scheme", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(WelcomeScreen.this,Scheme_All_Division_Recycler_Server.class);
                    startActivity(intent);
                }
                else
                if(id==R.id.ssminaction)
                {
                    Toast.makeText(WelcomeScreen.this,"Ssm In Action", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(WelcomeScreen.this,SsmParameter.class);
                    startActivity(intent);
                }
                else
                if(id==R.id.newlaunch)
                {
                    Toast.makeText(WelcomeScreen.this,"Ssm In Action", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(WelcomeScreen.this,NewProductLaunch.class);
                    startActivity(intent);
                }
                else
                if(id==R.id.advertising)
                {
                    Toast.makeText(WelcomeScreen.this,"Ssm In Action", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(WelcomeScreen.this,Advertising.class);
                    startActivity(intent);
                }
                else
                if(id==R.id.schemecalculator)
                {
                    Toast.makeText(WelcomeScreen.this,"Ssm In Action", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(WelcomeScreen.this,TradeCalculation.class);
                    startActivity(intent);
                }



                return false;
            }
        });

        //Navigation Code End





        //Welcome Screen Image Button Links
        imageButton=findViewById(R.id.real_juice);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomeScreen.this, FoodProductsPagerView.class);
                startActivity(intent);
            }
        });

        imageButton=findViewById(R.id.active_ltr);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomeScreen.this, ActiveProductPagerView.class);
                startActivity(intent);
            }
        });

        imageButton=findViewById(R.id.hmd);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomeScreen.this, PagerView_HommadeProduct.class);
                startActivity(intent);
            }
        });

        imageButton=findViewById(R.id.greetings);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomeScreen.this, Real_Greetings_Pager.class);
                startActivity(intent);
            }
        });

        imageButton=findViewById(R.id.advertising);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomeScreen.this, Advertising.class);
                startActivity(intent);
            }
        });


        imageButton=findViewById(R.id.newlaunch);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomeScreen.this, NewProductLaunch.class);
                startActivity(intent);
            }
        });


        imageButton=findViewById(R.id.ssmaction);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomeScreen.this, SsmParameter.class);
                startActivity(intent);
            }
        });

        imageButton=findViewById(R.id.backtobasic);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomeScreen.this, BacktoBasic.class);
                startActivity(intent);
            }
        });



        //Button links to New Activity

        button = findViewById(R.id.ProductRecycler);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeScreen.this, ProductDetailsRecycler.class);
                startActivity(intent);
            }
        });

        button = findViewById(R.id.products);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeScreen.this, DaburDivision.class);
                startActivity(intent);
            }
        });

        button = findViewById(R.id.newproduct);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeScreen.this, NewProductLaunch.class);
                startActivity(intent);
            }
        });

        button = findViewById(R.id.schemecalculation);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeScreen.this, TradeCalculation.class);
                startActivity(intent);
            }
        });

        button = findViewById(R.id.dailyusrreport);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeScreen.this, DailyReport.class);
                startActivity(intent);
            }
        });

        button = findViewById(R.id.dailyusrreport);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeScreen.this, DailyReport.class);
                startActivity(intent);
            }
        });

        button = findViewById(R.id.dailyssmsummary);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeScreen.this, DailySsmSummary.class);
                startActivity(intent);
            }
        });





    }

    private void download() {
        storageReference= FirebaseStorage.getInstance().getReference();
        ref=storageReference.child("SushilDabur.apk");

        ref.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                String url=uri.toString();
                downloadFile(WelcomeScreen.this,"SushilDabur",".apk",DIRECTORY_DOWNLOADS,url);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {

            }
        });

    }

    public void flipperimages(int image) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);
        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(2000);
        v_flipper.
                setAutoStart(true);

        v_flipper.setInAnimation(WelcomeScreen.this, android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(WelcomeScreen.this, android.R.anim.slide_out_right);
    }

    // Navigation Menu on Item Select Code
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        return abdt.onOptionsItemSelected(item)|| super.onOptionsItemSelected(item);
    }


    // Welcome Screen Banner on Click Snap Below

    private void getImages() {

        // Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/WelcomeBanner%2F1.png?alt=media&token=002e5c73-434c-4c17-a7a1-dfd77ffa97c7");
        mNames.add("Dabur India Ltd.");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/WelcomeBanner%2F2.png?alt=media&token=f40db312-63ed-4db2-b957-e866bcaa1bb5");
        mNames.add("Dabur India Ltd.");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/WelcomeBanner%2F3.png?alt=media&token=cb98ea1b-ae9a-48e2-8330-b1b1019f5b1a");
        mNames.add("Dabur India Ltd.");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/WelcomeBanner%2F4.png?alt=media&token=e83f6129-61d6-4ed7-acab-2082c26f5bef");
        mNames.add("Dabur India Ltd.");


        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/WelcomeBanner%2F5.png?alt=media&token=ed85cfcc-e44b-4ad2-a632-630152dc5180");
        mNames.add("Dabur India Ltd.");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/WelcomeBanner%2F6.png?alt=media&token=c6e43460-81e7-4e2b-a2bb-6d3693d58e2c");
        mNames.add("Dabur India Ltd.");


        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/WelcomeBanner%2F7.png?alt=media&token=d90d23fa-a1ed-43ad-9ca9-9b789d3338a6");
        mNames.add("Dabur India Ltd.");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/WelcomeBanner%2F8.png?alt=media&token=3865580c-ce97-4a5b-94f9-db1263d46c6e");
        mNames.add("Dabur India Ltd.");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/WelcomeBanner%2F9.png?alt=media&token=5ef98521-90cd-48e4-b894-d5a411bcaf18");
        mNames.add("Dabur India Ltd.");

        mImageUrls.add("https://firebasestorage.googleapis.com/v0/b/daburemployee.appspot.com/o/WelcomeBanner%2F10.png?alt=media&token=7817da0c-62ee-49d8-b29f-fab7af69be09");
        mNames.add("Dabur India Ltd.");


        initRecyclerView();
    }

    private void init() {

        //Vedio Code Start Here

        video = findViewById(R.id.video);

        if (mediaControls == null) {
            // create an object of media controller class
            mediaControls = new MediaController(WelcomeScreen.this);
            mediaControls.setAnchorView(video);
        }

        pd = new ProgressDialog(WelcomeScreen.this);
        pd.setMessage("Buffering video please wait...");
        pd.show();
        Uri uri = Uri.parse(video_url);
        // set the media controller for video view
        video.setMediaController(mediaControls);
        // set the uri for the video view
        video.setVideoURI(uri);
        // start a video
        video.start();


        video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                //close the progress dialog when buffering is done
                pd.dismiss();

           }
        });

        //Vedio Code End Here

        //View Pager Code Here
        mPager = findViewById(R.id.pager);
        mPager.setAdapter(new SlidingImage_Adapter(WelcomeScreen.this, urls));

        bPager = findViewById(R.id.brandscheme);
        bPager.setAdapter(new SlidingImage_Adapter(WelcomeScreen.this, urls1));



        //Java File---- SlidingImage_Adapter Java File
        //Layout File---slidingimages_layout
        // View Pager Code End here

    }

    private void initRecyclerView(){
        //Log.d(TAG, "initRecyclerView: init recyclerview");

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = findViewById(R.id.recyclerv_view_horizontal);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerAdapterServerBanner adapter = new RecyclerAdapterServerBanner(this, mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
    }

    private void downloadFile(Context context, String fileName, String fileExtension, String destinationDirectory, String url) {

        DownloadManager downloadManager=(DownloadManager) context.
                getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri=Uri.parse(url);
        DownloadManager.Request request=new DownloadManager.Request(uri);

        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setDestinationInExternalFilesDir(context,destinationDirectory,fileName+fileExtension);

        downloadManager.enqueue(request);

    }

    private void notification(String Title, String Message) {

        Intent intent=new Intent(WelcomeScreen.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pi=PendingIntent.getActivity(WelcomeScreen.this,0,intent,0);
        NotificationCompat.Builder builder=new NotificationCompat.Builder(WelcomeScreen.this,"channel Id");
        builder.setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle(Title)
                .setContentText(Message)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setContentIntent(pi)
                .setAutoCancel(true);

        NotificationManagerCompat manager=NotificationManagerCompat.from(WelcomeScreen.this);
        manager.notify(1,builder.build());
    }

    public  void notificationchannel()
    {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
        {
            CharSequence name="First Notification";
            String Description="notification description";
            int importance= NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel=new NotificationChannel("Channel Id",name,importance);
            channel.setDescription(Description);
            NotificationManager manager=getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }
    }


    // CODE CLEAR CACHE MEMORY START HERE

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        try {
            trimCache(this);
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public static void trimCache(Context context) {
        try {
            File dir = context.getCacheDir();
            if (dir != null && dir.isDirectory()) {
                deleteDir(dir);
            }
        } catch (Exception e) {

        }
    }

// CODE END HERE
// FUNCTION CLEAR CACHE START HERE

    public static boolean deleteDir(File dir) {
        if (dir != null && dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
        }

        // The directory is now empty so delete it
        return dir.delete();

        // FUNCTION END HERE
    }

}
