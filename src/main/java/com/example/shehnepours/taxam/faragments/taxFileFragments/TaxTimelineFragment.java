package com.example.shehnepours.taxam.faragments.taxFileFragments;

import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shehnepours.taxam.R;
import com.example.shehnepours.taxam.constants.Variables;
import com.example.shehnepours.taxam.faragments.services.ConsultPaymentFragment;
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
        TextView backIcon;
        backIcon = (TextView)getActivity().findViewById(R.id.back_btn);
        backIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        view.setOnKeyListener( new View.OnKeyListener()
        {
            @Override
            public boolean onKey( View v, int keyCode, KeyEvent event )
            {
                if( keyCode == KeyEvent.KEYCODE_BACK )
                {
                    getActivity().getSupportFragmentManager().popBackStack();
                    return true;
                }
                return false;
            }
        } );
    }

    private void setupListener() {
        consultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToFragment(new ConsultPaymentFragment());
            }
        });
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

        } else if (step == 3) {
            tashkhis.setTextColor(getContext().getResources().getColor(R.color.hint_text));
            ekhtelaf.setTextColor(getContext().getResources().getColor(R.color.hint_text));
            tajdid.setTextColor(getContext().getResources().getColor(R.color.main_btn_bck));
            shora.setTextColor(Color.WHITE);
            madeh251.setTextColor(Color.WHITE);
            divan.setTextColor(Color.WHITE);

            tashkhisUp.setVisibility(View.INVISIBLE);
            ekhtelafUp.setVisibility(View.INVISIBLE);
            tajdidUp.setVisibility(View.VISIBLE);
            shoraUp.setVisibility(View.INVISIBLE);
            madehUp.setVisibility(View.INVISIBLE);
            divanUp.setVisibility(View.INVISIBLE);

        } else if(step == 4) {
            tashkhis.setTextColor(getContext().getResources().getColor(R.color.hint_text));
            ekhtelaf.setTextColor(getContext().getResources().getColor(R.color.hint_text));
            tajdid.setTextColor(getContext().getResources().getColor(R.color.hint_text));
            shora.setTextColor(getContext().getResources().getColor(R.color.main_btn_bck));
            madeh251.setTextColor(Color.WHITE);
            divan.setTextColor(Color.WHITE);

            tashkhisUp.setVisibility(View.INVISIBLE);
            ekhtelafUp.setVisibility(View.INVISIBLE);
            tajdidUp.setVisibility(View.INVISIBLE);
            shoraUp.setVisibility(View.VISIBLE);
            madehUp.setVisibility(View.INVISIBLE);
            divanUp.setVisibility(View.INVISIBLE);

        } else if(step == 5) {
            tashkhis.setTextColor(getContext().getResources().getColor(R.color.hint_text));
            ekhtelaf.setTextColor(getContext().getResources().getColor(R.color.hint_text));
            tajdid.setTextColor(getContext().getResources().getColor(R.color.hint_text));
            shora.setTextColor(getContext().getResources().getColor(R.color.hint_text));
            madeh251.setTextColor(getContext().getResources().getColor(R.color.main_btn_bck));
            divan.setTextColor(Color.WHITE);

            tashkhisUp.setVisibility(View.INVISIBLE);
            ekhtelafUp.setVisibility(View.INVISIBLE);
            tajdidUp.setVisibility(View.INVISIBLE);
            shoraUp.setVisibility(View.INVISIBLE);
            madehUp.setVisibility(View.VISIBLE);
            divanUp.setVisibility(View.INVISIBLE);

        } else if(step == 6) {
            tashkhis.setTextColor(getContext().getResources().getColor(R.color.hint_text));
            ekhtelaf.setTextColor(getContext().getResources().getColor(R.color.hint_text));
            tajdid.setTextColor(getContext().getResources().getColor(R.color.hint_text));
            shora.setTextColor(getContext().getResources().getColor(R.color.hint_text));
            madeh251.setTextColor(getContext().getResources().getColor(R.color.hint_text));
            divan.setTextColor(getContext().getResources().getColor(R.color.main_btn_bck));

            tashkhisUp.setVisibility(View.INVISIBLE);
            ekhtelafUp.setVisibility(View.INVISIBLE);
            tajdidUp.setVisibility(View.INVISIBLE);
            shoraUp.setVisibility(View.INVISIBLE);
            madehUp.setVisibility(View.INVISIBLE);
            divanUp.setVisibility(View.VISIBLE);
        }


    }

    private void setupBundle() {
        Bundle bundle = this.getArguments();
        if(bundle!=null) {
            step = bundle.getInt(Variables.STEPS_NUMBER);
        }
    }
    public void goToFragment(Fragment fragment) {
        getActivity().getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_in_right,R.anim.slide_out_left,R.anim.slide_in_left,R.anim.slide_out_right)
                .replace(R.id.newtax_frame_layout,fragment).addToBackStack(Variables.USER_SHORTCUT).commit();

    }

}
