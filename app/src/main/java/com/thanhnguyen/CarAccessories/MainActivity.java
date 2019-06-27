package com.thanhnguyen.CarAccessories;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.thanhnguyen.CarAccessories.Adapter.RcvSlidingMenuAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.ln_search)
    LinearLayout lnSearch;

    RcvSlidingMenuAdapter rcvMenuAdapter;

    SlidingMenu menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        menu = new SlidingMenu(this);
        rcvMenuAdapter = new RcvSlidingMenuAdapter();
        createSlidingMenu(menu);


    }

    @OnClick(R.id.img_menu)
    public void onViewClicked() {
        menu.toggle();
    }

    private void createSlidingMenu(SlidingMenu menu ){

        menu.setMode(SlidingMenu.LEFT);
        //menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        menu.setShadowWidthRes(R.dimen._5sdp);
        menu.setShadowDrawable(R.drawable.shadow);
        menu.setBehindOffsetRes(R.dimen._60sdp);
        menu.setFadeDegree(0.35f);
        menu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
        menu.setMenu(R.layout.siliding_menu);
        RecyclerView rcvSlidingMenu = menu.findViewById(R.id.rcv_slidingMenu);

        RcvSlidingMenuAdapter adapter = new RcvSlidingMenuAdapter();
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(RecyclerView.VERTICAL);
        rcvSlidingMenu.setLayoutManager(manager);
        rcvSlidingMenu.setAdapter(adapter);
    }
}
