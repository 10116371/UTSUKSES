package com.example.latihan3prauts.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.latihan3prauts.R;
import com.example.latihan3prauts.adapter.DailyActivityAdapter;
import com.example.latihan3prauts.adapter.FriendAdapter;
import com.example.latihan3prauts.model.DailyActivityModel;
import com.example.latihan3prauts.model.FriendModel;

//17-05-2019.10116371.ArchyRPN,IF-8
public class DailyActivityFragment extends Fragment {
    RecyclerView recycle, recycleUser;
    NestedScrollView scroll;
    DailyActivityModel[] model;
    FriendModel[] friendModel;

    public DailyActivityFragment() {
        FriendModel us1 = new FriendModel(R.drawable.tosa, "10116377 | Yogi", "Sekeloa, Bandung");
        FriendModel us2 = new FriendModel(R.drawable.tosa, "10116378 | Restu", "Balendah,Kab Bandung");
        FriendModel us3 = new FriendModel(R.drawable.tosa, "10116379 |Luthfi", "Dayeuhkolot, Bandung");
        FriendModel us4 = new FriendModel(R.drawable.tosa, "10116380 |Candra", "Cipedes, Bandung");
        FriendModel us5 = new FriendModel(R.drawable.tosa, "10116381 |Lukmannudin", "Taman Sari, Bandung");
        FriendModel us6 = new FriendModel(R.drawable.tosa, "10116382 |Diki S", "Saparua, Bandung");
        FriendModel us7 = new FriendModel(R.drawable.tosa, "10116383 |Zhafir", "Sekeloa, Bandung");
        FriendModel us8 = new FriendModel(R.drawable.tosa, "10116384 |Yaris", "Cipedes, Bandung");
        friendModel = new FriendModel[]{us1,us2,us3,us4,us5,us6,us7,us8};


        // Required empty public constructor

        model = new DailyActivityModel[]{};
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layoutss for this fragment
        View root = inflater.inflate(R.layout.fragment_daily_activity, container, false);

        recycle = (RecyclerView) root.findViewById(R.id.recycle_daily);
        recycleUser = (RecyclerView) root.findViewById(R.id.recycle_user);
        scroll = (NestedScrollView) root.findViewById(R.id.gallery_scrollbar);
        LinearLayoutManager layout = new LinearLayoutManager(getActivity()) {
            @Override
            public boolean canScrollHorizontally() {
                return false;
            }

            @Override
            public boolean canScrollVertically() {
                return false;
            }
        };
        LinearLayoutManager layout2 = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false) {
            @Override
            public boolean canScrollHorizontally() {
                return true;
            }

            @Override
            public boolean canScrollVertically() {
                return false;
            }
        };

        recycle.setNestedScrollingEnabled(false);
        recycleUser.setNestedScrollingEnabled(false);
        scroll.setNestedScrollingEnabled(false);
        recycle.setLayoutManager(layout);
        recycleUser.setLayoutManager(layout2);

        DailyActivityAdapter adapterFeed = new DailyActivityAdapter(getActivity(), model);
        recycle.setAdapter(adapterFeed);

        FriendAdapter adapterFriend = new FriendAdapter(getActivity(), friendModel);
        recycleUser.setAdapter(adapterFriend);

        return root;
    }

}
