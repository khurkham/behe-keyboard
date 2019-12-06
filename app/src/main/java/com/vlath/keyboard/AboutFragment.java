package com.vlath.keyboard;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.marcoscg.easyabout.EasyAboutFragment;
import com.marcoscg.easyabout.items.AboutCard;
import com.marcoscg.easyabout.items.HeaderAboutItem;
import com.marcoscg.easyabout.items.PersonAboutItem;

public class AboutFragment extends EasyAboutFragment {

    @Override
    protected void configureFragment(Context context, View rootView, Bundle savedInstanceState) {
        HeaderAboutItem headerAboutItem = new HeaderAboutItem.Builder(context)
                .setTitle(R.string.app_name) // It can also be passed as a string value
                .setSubtitle("Version:" + BuildConfig.VERSION_NAME) // It can also be passed as a string resource
                .setIcon(R.mipmap.ic_launcher) // It can also be passed as a drawable
                .build();
        AboutCard aboutCard = new AboutCard.Builder(context)
                .setTitle("About") // It can also be passed as a string resource
                .setTitleColorRes(R.color.colorAccent) // You can also use setTitleColor(int color);
                .addItem(headerAboutItem)
                .build();
        AboutCard licenseCrd = new AboutCard.Builder(context)
                .setTitle("License") // It can also be passed as a string resource
                .setTitleColorRes(R.color.colorAccent) // You can also use setTitleColor(int color);
                .build();

        addCard(aboutCard);
        addCard(licenseCrd);
    }
}
