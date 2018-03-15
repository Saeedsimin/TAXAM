package com.example.shehnepours.taxam.faragments.taxFileFragments;

import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.shehnepours.taxam.R;
import com.example.shehnepours.taxam.constants.Variables;
import com.example.shehnepours.taxam.parents.CustomButton;
import com.example.shehnepours.taxam.parents.VerticalTextView;

/**
 * Created by shehnepour.s on 3/14/2018.
 */

public class TaxTimelineFragment extends Fragment {

    private View view;
    private int step;
    private VerticalTextView tashkhis;
    private VerticalTextView ekhtelaf;
    private VerticalTextView tajdid;
    private VerticalTextView shora;
    private VerticalTextView madeh251;
    private VerticalTextView divan;

    private ImageView tashkhisUp;
    private ImageView ekhtelafUp;
    private ImageView tajdidUp;
    private ImageView shoraUp;
    private ImageView madehUp;
    private ImageView divanUp;

    private CustomButton consultButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.layout_file_timeline,container,false);
        setupBundle();
        setupView();
        setupListener();
        setupBackButton();
        return view;
    }

    private void setupBackButton() {

    }

    private void setupListener() {
    }

    private void setupView() {
        tashkhis = (VerticalTextView)view.findViewById(R.id.barge_tashkhis_timeline);
        ekhtelaf = (VerticalTextView) view.findViewById(R.id.hale_ekhtelaf_timeline);
        tajdid = (VerticalTextView) view.findViewById(R.id.tajdid_timeline);
        shora = (VerticalTextView) view.findViewById(R.id.shora_timeline);
        madeh251 = (VerticalTextView) view.findViewById(R.id.madeh251_timeline);
        divan = (VerticalTextView) view.findViewById(R.id.divan_timeline);

        tashkhisUp = (ImageView) view.findViewById(R.id.ic_up_tashkhis);
        ekhtelafUp = (ImageView) view.findViewById(R.id.ic_up_ekhtelaf);
        tajdidUp = (ImageView) view.findViewById(R.id.ic_up_tajdid);
        shoraUp = (ImageView) view.findViewById(R.id.ic_up_shora);
        madehUp = (ImageView) view.findViewById(R.id.ic_up_madeh251);
        divanUp = (ImageView) view.findViewById(R.id.ic_up_divan);


        if (step == 1) {
            tashkhis.setTextColor(getContext().getResources().getColor(R.color.main_btn_bck));
            ekhtelaf.setTextColor(Color.WHITE);
            tajdid.setTextColor(Color.WHITE);
            shora.setTextColor(Color.WHITE);
            madeh251.setTextColor(Color.WHITE);
            divan.setTextColor(Color.WHITE);

            tashkhisUp.setVisibility(View.VISIBLE);
            ekhtelafUp.setVisibility(View.INVISIBLE);
            tajdidUp.setVisibility(View.INVISIBLE);
            shoraUp.setVisibility(View.INVISIBLE);
            madehUp.setVisibility(View.INVISIBLE);
            divanUp.setVisibility(View.INVISIBLE);
        } else if (step == 2) {
            tashkhis.setTextColor(getContext().getResources().getColor(R.color.hint_text));
            ekhtelaf.setTextColor(getContext().getResources().getColor(R.color.main_btn_bck));
            tajdid.setTextColor(Color.WHITE);
            shora.setTextColor(Color.WHITE);
            madeh251.setTextColor(Color.WHITE);
            divan.setTextColor(Color.WHITE);

            tashkhisUp.setVisibility(View.INVISIBLE);
            ekhtelafUp.setVisibility(View.VISIBLE);
            tajdidUp.setVisibility(View.INVISIBLE);
            shoraUp.setVisibility(View.INVISIBLE);
            madehUp.setVisibility(View.INVISIBLE);
            divanUp.setVisibility(View.INVISIBLE);

        }


    }

    private void setupBundle() {
        Bundle bundle = this.getArguments();
        if(bundle!=null) {
            step = bundle.getInt(Variables.STEPS_NUMBER);
        }
    }
}
