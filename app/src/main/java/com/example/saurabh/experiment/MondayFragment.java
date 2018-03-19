package com.example.saurabh.experiment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.saurabh.experiment.R.string.*;

/**
 * A simple {@link Fragment} subclass.
 */
public class MondayFragment extends Fragment {


    public MondayFragment() {
        // Required empty public constructor
    }

    @Override
    public void onStop() {
        super.onStop();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_all, container, false);

        ArrayList<Title> titles = new ArrayList<Title>();

        titles.add(new Title(se, se1, all, ag, t8, t9));
        titles.add(new Title(cd,cd1,all,sb,t9,t10));
        titles.add(new Title(sl,sl1,b12,rn,ed,ed1,b34,np,t10,t12,1));
        titles.add(new Title(wt,wt1,b12,rn,itnm,itnm1,b34,js,t1230,t130,1));
        titles.add(new Title(se, se1, b1, ag, cgm, cgm1, b2, ns, cd, cd1, b3, sb, mp, mp1, b4, pm, t130,t330, 2));

        TitleAdapter adapter = new TitleAdapter(getActivity(), titles);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
