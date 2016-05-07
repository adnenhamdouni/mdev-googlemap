package tn.itskills.android.googlemap;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.MapFragment;

/**
 * Created by adnenhamdouni on 30/04/2016.
 */
public class MyMapFragment extends MapFragment {


    private Context mContext;

    public static MyMapFragment newInstance() {
        MyMapFragment fragment = new MyMapFragment();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mContext = getActivity().getApplicationContext();

        View view = inflater.inflate(R.layout.fragment_map,
                container, false);

        //initView(view);

        return view;

    }
}
