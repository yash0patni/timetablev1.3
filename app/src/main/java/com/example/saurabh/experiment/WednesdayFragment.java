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
public class WednesdayFragment extends Fragment {


    public WednesdayFragment() {
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

        titles.add(new Title(cd,cd1,b1,sb,mp,mp1,b2,am,se,se1,b3,ag,cgm,cgm1,b4,ns,t8,t10,2));
        titles.add(new Title(wt,wt1,all,rn,t10,t11));
        titles.add(new Title(lib,lib,all,none,t11,t12));
        titles.add(new Title(se,se1,b12,ag,cd,cd1,b34,sb,t1230,t130,1));
        titles.add(new Title(cgm,cgm1,all,ns,t130,t230));
        titles.add(new Title(itnm,itnm1,all,js,t230,t330));




          TitleAdapter adapter = new TitleAdapter(getActivity(), titles);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
