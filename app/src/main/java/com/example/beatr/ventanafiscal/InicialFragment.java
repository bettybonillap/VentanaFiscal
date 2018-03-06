package com.example.beatr.ventanafiscal;


import android.os.Bundle;
import android.support.annotation.Nullable;
//import android.support.v4.app.Fragment;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class InicialFragment extends Fragment {
    private TextView textView;

    public InicialFragment() {
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
        return inflater.inflate(R.layout.fragment_inicial, container, false);
    }
    final SpannableStringBuilder sb = new SpannableStringBuilder("Bienvenido a Ventana Fiscal\n\n\nEsta aplicación tiene el objetivo de ayudarte a cumplir con tus obligaciones fiscales.");
    final StyleSpan bss = new StyleSpan(android.graphics.Typeface.BOLD);
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        //imageView=(ImageView) view.findViewById(R.id.imageView2);
        textView=(TextView) view.findViewById(R.id.inicial);
        sb.setSpan(bss, 0, 26, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        textView.setText(sb);
    }

}
