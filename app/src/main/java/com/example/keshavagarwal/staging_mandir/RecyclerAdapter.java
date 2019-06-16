package com.example.keshavagarwal.staging_mandir;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private ArrayList<String> username;
    private ArrayList<String> textheading;
    private ArrayList<String> posttype;
    private ArrayList<String> userimageurl;
    private ArrayList<String> postimageurl;
    private ArrayList<String> likecount;
    private ArrayList<String> sharecount;
    private ArrayList<String> reactioncount;
    private ArrayList<String> commentcount;

    private Context context;

    public RecyclerAdapter(Context con,ArrayList<String> username, ArrayList<String> textheading, ArrayList<String> posttype, ArrayList<String> userimageurl, ArrayList<String> postimageurl, ArrayList<String> likecount, ArrayList<String> sharecount, ArrayList<String> reactioncount,ArrayList<String> commentcount)
    {
        this.context=con;
        this.username = (ArrayList<String>)username.clone();
        this.textheading =(ArrayList<String>) textheading.clone();
        this.posttype =(ArrayList<String>) posttype.clone();
        this. userimageurl =(ArrayList<String>) userimageurl.clone();
        this.postimageurl =(ArrayList<String>) postimageurl.clone();
        this.likecount = (ArrayList<String>) likecount.clone();
        this.sharecount = (ArrayList<String>) sharecount.clone();
        this.reactioncount = (ArrayList<String>) reactioncount.clone();
        this.commentcount = (ArrayList<String>) commentcount.clone();

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.posts,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
         String cl,type, user,head,like,comment,share,reaction,post;

         cl=userimageurl.get(position);
        post=postimageurl.get(position);
        user=username.get(position);
        head=textheading.get(position);
        like=likecount.get(position);
        comment=commentcount.get(position);
        share=sharecount.get(position);
        reaction=reactioncount.get(position);

        holder.like.setText(like);
        holder.comment.setText(comment);
        holder.share.setText(share);
        holder.reaction.setText(reaction);
        holder.user.setText(user);
        holder.head.setText(head);

        type=posttype.get(position);

        Glide.with(context).load(cl).into(holder.cl);


    }

    @Override
    public int getItemCount() {
        return username.size() ;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        CircleImageView cl;
        TextView user,head,like,comment,share,reaction;
        ImageView post;
        public MyViewHolder(View itemView) {
            super(itemView);
            cl=itemView.findViewById(R.id.proimg);
            user=itemView.findViewById(R.id.userdes);
            head=itemView.findViewById(R.id.descrip);
            like=itemView.findViewById(R.id.like2);
            comment=itemView.findViewById(R.id.comment2);
            reaction=itemView.findViewById(R.id.reaction2);
            share=itemView.findViewById(R.id.share2);
            post=itemView.findViewById(R.id.post);
        }
    }
}
