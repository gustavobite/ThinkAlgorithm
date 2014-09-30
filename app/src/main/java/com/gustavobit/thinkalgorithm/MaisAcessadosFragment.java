package com.gustavobit.thinkalgorithm;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Gustavo on 30/09/2014.
 */
public class MaisAcessadosFragment extends android.app.Fragment {

    public MaisAcessadosFragment() {}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_mais_acessados, container, false);

        return rootView;
    }
}
