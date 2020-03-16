package com.example.android.mainpageyo;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class PersonViewHolder extends RecyclerView.ViewHolder {
    public CardView cardView;
    public TextView personName;
    public TextView personInfo;
    public ImageView personPhoto;
    public Toast toast;

    public PersonViewHolder(View itemView, final Context context){
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        personName = (TextView) itemView.findViewById(R.id.person_name);
        personInfo = (TextView) itemView.findViewById(R.id.person_info);
        personPhoto = (ImageView) itemView.findViewById(R.id.person_photo);

        cardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                toast = Toast.makeText(context,personName.getText(),Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER,0,30);
                toast.show();

            }
        });
    }
}
