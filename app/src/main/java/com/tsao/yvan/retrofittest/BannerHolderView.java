package com.tsao.yvan.retrofittest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bigkoo.convenientbanner.holder.Holder;
import com.squareup.picasso.Picasso;
import com.tsao.yvan.retrofittest.model.TopStory;

/**
 * Created by Yvan on 2016/6/4.
 */
public class BannerHolderView implements Holder<TopStory> {

    private View view;
    @Override
    public View createView(Context context) {
        view = LayoutInflater.from(context).inflate(R.layout.item_header,null);
        return view;
    }

    @Override
    public void UpdateUI(Context context, int position, TopStory data) {

        ImageView imageView = (ImageView)view.findViewById(R.id.iv_item_header);
        TextView textView = (TextView)view.findViewById(R.id.tv_item_header);
        Picasso.with(view.getContext())
                .load(data.getImage())
                .into(imageView);
        textView.setText(data.getTitle());

    }
}
