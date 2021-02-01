package com.example.shiva.daburemployee;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;


public class NpdRecyclerAdapter extends RecyclerView.Adapter<NpdRecyclerAdapter.ViewHolder> {

    private static final String TAG = "NpdRecyclerAdapter";

    private ArrayList<String> mImageName=new ArrayList<>();
    private ArrayList<String> mImage=new ArrayList<>();
    private Context mContext;

    public NpdRecyclerAdapter(Context context, ArrayList<String> imageNames, ArrayList<String> images) {
        mImageName = imageNames;
        mImage = images;
        mContext = context;
    }

    @NonNull

    //Method respoinsible for inflating view
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.npdlayout_listitem,parent,false);
        //hold the view
        ViewHolder holder= new ViewHolder(view);
        return holder;
    }




    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG,"onBindViewHolder: called");
        Glide.with(mContext)
                .asBitmap()
                .load(mImage.get(position))
                .into(holder.image);

        holder.imageName.setText(mImageName.get(position));
        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"onClick Cliked on"+mImageName.get(position));
                Toast.makeText(mContext,mImageName.get(position),Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(mContext,NpdGalleryActivity.class);
                intent.putExtra("image_url",mImage.get(position));
                intent.putExtra("image_name",mImageName.get(position));
                mContext.startActivity(intent);




            }
        });

    }

    @Override
    public int getItemCount()
    {
        return mImageName.size();
    }

    //view holder class hold each individual into memory

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        CircleImageView image;
        TextView imageName;
        RelativeLayout parentLayout;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            image=itemView.findViewById(R.id.image);
            imageName=itemView.findViewById(R.id.image_name);
            parentLayout=   itemView.findViewById(R.id.parent_layout);

        }
    }
}
