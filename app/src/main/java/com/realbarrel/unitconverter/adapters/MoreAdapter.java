package com.realbarrel.unitconverter.adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import androidx.annotation.NonNull;

import com.google.android.material.snackbar.Snackbar;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.realbarrel.unitconverter.DisclaimerActivity;
import com.realbarrel.unitconverter.MainActivity;
import com.realbarrel.unitconverter.R;
import com.realbarrel.unitconverter.models.DataItemMore;

import java.util.List;

public class MoreAdapter extends RecyclerView.Adapter<MoreAdapter.ViewHolder> {

    private final List<DataItemMore> mItems;
    private final Context mContext;

    private static final String URL_TWITTER = "https://twitter.com/";
    private static final String URL_INSTAGRAM = "https://www.instagram.com/";
    private static final String URL_TELEGRAM = "https://t.me/";
    public static String URL_STORE;

    public MoreAdapter(Context context, List<DataItemMore> items) {
        this.mContext = context;
        this.mItems = items;
        URL_STORE = "https://iranapps.ir/app/" + mContext.getPackageName();
    }

    @NonNull
    @Override
    public MoreAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                                     int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mContext);
        View itemView = inflater.inflate(R.layout.list_item_more, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final DataItemMore item = mItems.get(position);

        holder.textView.setText(item.getTitle());

        holder.textView.setOnClickListener(view -> {
            switch (item.getId()) {
                case "support_donate":
                    Snackbar.make(holder.mView, "Donated", Snackbar.LENGTH_SHORT).show();
                    break;
                case "support_rate":
                    break;
                case "support_feedback":
                    break;
                case "support_invite":
                    break;
                case "about_disclaimer":
                    mContext.startActivity(new Intent(mContext, DisclaimerActivity.class));
                    break;
                case "about_twitter":
                    Intent aboutTwitter = new Intent(Intent.ACTION_VIEW, Uri.parse(URL_TWITTER));
                    mContext.startActivity(Intent.createChooser(aboutTwitter,
                            mContext.getString(R.string.string_more_title_support_open)));
                    break;
                case "about_instagram":
                    Intent aboutInstagram = new Intent(Intent.ACTION_VIEW, Uri.parse(URL_INSTAGRAM));
                    mContext.startActivity(Intent.createChooser(aboutInstagram,
                            mContext.getString(R.string.string_more_title_support_open)));
                    break;
                case "about_telegram":
                    Intent aboutTelegram = new Intent(Intent.ACTION_VIEW, Uri.parse(URL_TELEGRAM));
                    mContext.startActivity(Intent.createChooser(aboutTelegram,
                            mContext.getString(R.string.string_more_title_support_open)));
                    break;
                case "language_english":
                    Snackbar.make(holder.mView, "English", Snackbar.LENGTH_SHORT).show();
                    break;
                case "language_persian":
                    Snackbar.make(holder.mView, "Persian", Snackbar.LENGTH_SHORT).show();
                    break;
            }
        });
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        View mView;
        TextView textView;

        ViewHolder(View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.tv_list_more);

            mView = itemView;
        }
    }
}