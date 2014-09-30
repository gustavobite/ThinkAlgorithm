package com.gustavobit.thinkalgorithm;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Gustavo on 30/09/2014.
 */
public class FiltroFragment extends android.app.Fragment {

    public FiltroFragment() {}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_filtro, container, false);

        return rootView;
    }
}
