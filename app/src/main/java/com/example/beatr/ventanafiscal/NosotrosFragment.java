package com.example.beatr.ventanafiscal;


import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.support.annotation.Nullable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class NosotrosFragment extends Fragment {
    private TextView textView;
    private ImageButton imageButton;

    public NosotrosFragment() {
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
        return inflater.inflate(R.layout.fragment_nosotros, container, false);
    }
    final SpannableStringBuilder sb = new SpannableStringBuilder("\n\n\n\n\n\n\n\n\n" +
            "Sobre nosotros\n\n\n\n\n\n" +
            "Somos un despacho contable.");
    final StyleSpan bss = new StyleSpan(android.graphics.Typeface.BOLD);
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        //imageView=(ImageView) view.findViewById(R.id.imageView2);
        textView=(TextView) view.findViewById(R.id.nosotros);
        imageButton=(ImageButton)view.findViewById(R.id.imageButton);
        sb.setSpan(bss, 10, 23, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        textView.setText(sb);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:5585754039"));
                getActivity().startActivity(intent);
            }
        });
    }

}
