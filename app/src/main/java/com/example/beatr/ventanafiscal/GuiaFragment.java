package com.example.beatr.ventanafiscal;


import android.app.Fragment;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.support.v4.util.LruCache;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.NetworkImageView;
import com.android.volley.toolbox.Volley;

import java.util.regex.Pattern;


/**
 * A simple {@link Fragment} subclass.
 */
public class GuiaFragment extends Fragment {
    private TextView titulo;
    private TextView textView;
    private TextView primero;
    private TextView segundo;
    private TextView tercero;
    private TextView cuarto;
    private TextView quinto;
    private TextView sexto;
    private TextView septimo;
    private TextView note;

    public GuiaFragment() {
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


        return inflater.inflate(R.layout.fragment_guia, container, false);


    }

    final SpannableStringBuilder guia_titulo = new SpannableStringBuilder("" +
            " Guía de alta para persona física en SAT");
    final SpannableStringBuilder sb = new SpannableStringBuilder("\n\n" +
            " Agendar cita" +" \n\n" +
            "Dependiendo de la actividad que vas a realizar, deberás inscribirte en el SAT. Para que puedas" +"\n"
            + "facturar y puedas presentar tus declaraciones y pagar tus impuestos que en su caso se generen.");

    final SpannableStringBuilder primer = new SpannableStringBuilder("\n" +
            "  1. Acceder a la página web del SAT http://www.sat.gob.mx/Paginas/Inicio.aspx");

    final SpannableStringBuilder segund = new SpannableStringBuilder("\n" +
            "  2. Identificar el menú horizontal verde y hacer click en CONTACTO" +"\n");

    final SpannableStringBuilder tercer = new SpannableStringBuilder("\n" +
            "  3. Escoger opción de citas" +"\n");

    final SpannableStringBuilder cuart = new SpannableStringBuilder("\n" +
            "  4. Seleccionar escoger cita" +"\n");

    final SpannableStringBuilder quint = new SpannableStringBuilder("\n" +
            "  5. Seleccionar Registrar cita" +"\n");

    final SpannableStringBuilder sext = new SpannableStringBuilder("\n" +
            "  6. Escoger país del lado superior izquierdo y tipo de trámite, se mostrarán los requisitos necesarios para el trámite" +"\n");

    final SpannableStringBuilder sept = new SpannableStringBuilder("\n" +
            "  7. Seleccionar fecha y hora, finalizar" +"\n");


    final SpannableStringBuilder nota = new SpannableStringBuilder("\n" +
            "NOTA: Todos los documentos debes presentarlos en original. Los requisitos son generales por lo que se sugiere consultes el Catálogo de Servicios y Trámites." +"\n");

    final StyleSpan bss = new StyleSpan(android.graphics.Typeface.BOLD);


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        titulo=(TextView) view.findViewById(R.id.titulo);
        guia_titulo.setSpan(bss, 0, 40, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        guia_titulo.setSpan(new RelativeSizeSpan(2f), 0,40, 0);
        titulo.setText(guia_titulo);

        textView=(TextView) view.findViewById(R.id.agendar);
        sb.setSpan(bss, 0, 15, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        sb.setSpan(new RelativeSizeSpan(1.3f), 0,15, 0);
        textView.setText(sb);

        primero=(TextView) view.findViewById(R.id.primero);
        primero.setText(primer);
        Linkify.addLinks(primer, Linkify.WEB_URLS);

        segundo=(TextView) view.findViewById(R.id.segundo);
        segundo.setText(segund);

        tercero=(TextView) view.findViewById(R.id.tercero);
        tercero.setText(tercer);

        cuarto=(TextView) view.findViewById(R.id.cuarto);
        cuarto.setText(cuart);

        quinto=(TextView) view.findViewById(R.id.quinto);
        quinto.setText(quint);

        sexto=(TextView) view.findViewById(R.id.sexto);
        sexto.setText(sext);

        septimo=(TextView) view.findViewById(R.id.septimo);
        septimo.setText(sept);

        note=(TextView) view.findViewById(R.id.nota);
        nota.setSpan(bss, 0, 5, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        note.setText(nota);

    }

}
