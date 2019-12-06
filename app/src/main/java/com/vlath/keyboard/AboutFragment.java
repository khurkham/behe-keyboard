package com.vlath.keyboard;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.marcoscg.easyabout.EasyAboutFragment;
import com.marcoscg.easyabout.items.AboutCard;

public class AboutFragment extends EasyAboutFragment {

    @Override
    protected void configureFragment(Context context, View rootView, Bundle savedInstanceState) {
        AboutCard aboutCard = new AboutCard.Builder(context)
                .setTitle("Card title") // It can also be passed as a string resource
                .setTitleColorRes(R.color.colorAccent) // You can also use setTitleColor(int color);
                .build();

        addCard(aboutCard);
    }
}
