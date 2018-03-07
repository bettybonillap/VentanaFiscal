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
public class DeclaracionesFragment extends Fragment {

    private TextView titulo;

    public DeclaracionesFragment() {
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
        return inflater.inflate(R.layout.fragment_declaraciones, container, false);
    }

    final SpannableStringBuilder declaraciones_titulo = new SpannableStringBuilder("" +
            " Guía de declaración de impuestos");

    final StyleSpan bss = new StyleSpan(android.graphics.Typeface.BOLD);

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        titulo=(TextView) view.findViewById(R.id.titulo);
        declaraciones_titulo.setSpan(bss, 0, 33, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        declaraciones_titulo.setSpan(new RelativeSizeSpan(2f), 0,33, 0);
        titulo.setText(declaraciones_titulo);
    }

}
