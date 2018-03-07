package com.example.beatr.ventanafiscal;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class TipsFragment extends Fragment {

    private TextView titulo;

    public TipsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tips, container, false);
    }


    final SpannableStringBuilder tips_titulo = new SpannableStringBuilder("" +
            "Tips");

    final StyleSpan bss = new StyleSpan(android.graphics.Typeface.BOLD);

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        titulo=(TextView) view.findViewById(R.id.titulo);
        tips_titulo.setSpan(bss, 0, 4, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        tips_titulo.setSpan(new RelativeSizeSpan(2f), 0,4, 0);
        titulo.setText(tips_titulo);
    }

}
