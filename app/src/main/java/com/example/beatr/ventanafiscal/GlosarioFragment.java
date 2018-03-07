package com.example.beatr.ventanafiscal;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class GlosarioFragment extends Fragment {

    private TextView titulo;
    private TextView primero;
    private TextView segundo;
    private TextView tercero;
    private TextView cuarto;
    private TextView quinto;
    private TextView sexto;
    private TextView septimo;
    private TextView octavo;


    public GlosarioFragment() {
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
        return inflater.inflate(R.layout.fragment_glosario, container, false);
    }

    final SpannableStringBuilder glosario_titulo = new SpannableStringBuilder("" +
            "Glosario");

    final SpannableStringBuilder primer = new SpannableStringBuilder("\n\n" +
            "A. CFF: CODIGO FISCAL DE LA FEDERACION");

    final SpannableStringBuilder segund = new SpannableStringBuilder("\n" +
            "B. LIVA: LEY DEL IMPUESTO AL VALOR AGREGADO" +"\n");

    final SpannableStringBuilder tercer = new SpannableStringBuilder("\n" +
            "C. LISR: LEY DEL IMPUESTO SOBRE LA RENTA" +"\n");

    final SpannableStringBuilder cuart = new SpannableStringBuilder("\n" +
            "D. IVA: IMPUESTO AL VALOR AGREGADO, IMPUESTO QUE SE AGREGA AL VALOR DE TU SERVICIO O PRODUCTO, SEGUN SEA TU PRODUCTO ESTA TASA PUEDE SER DEL 16%, DEL 0% O TASA EXENTA, AL FINAL QUIEN LA PAGA ES TU CLIENTE. SE CONSIDERA UN IMPUESTRO TRASLADADO." +"\n");

    final SpannableStringBuilder quint = new SpannableStringBuilder("\n" +
            "E. ISR: IMPUESTOS SOBRE LA RENTA, ESTE IMPUESTO GRAVA TU GANANCIA Y PUEDE LLEGAR A SER DEL 35% PARA PF, O 30% PARA PERSONA MORAL. SE CONSIDERA UN IMPUESTO PROPIO." +"\n");

    final SpannableStringBuilder sext = new SpannableStringBuilder("\n" +
            "F. FIEL: FIRMA ELECTRONICA AVANZADA,  TU FIRMA AUTOGRAFA ES SUSTITUIDA POR UNA FIRMA ELECTRONICA. SE COMPONE DE TRES ELEMENTOS, 1) ARCHIVO CON TERMINACION  .CER  2) ARCHIVO CON TERMINACION .KEY Y 3) UNA CONTRASEÑA QUE TU DEFINIRAS, ESTA FIEL SE REQUIERE PARA VARIOS TRAMITES QUE PODRAS HACER POR INTERNET ANTE EL SAT." +"\n");

    final SpannableStringBuilder sept = new SpannableStringBuilder("\n" +
            "G. CONTRASEÑA (CIEC): ESTA CONTRASEÑA  TAMBIEN LA DEFINIRAS TU, Y SERVIRA PARA ACCEDER A LA PAGINA DEL SAT, CON LA CUAL PODRAS HACER TRAMITES QUE NO REQUIERAN TU FIRMA." +"\n");


    final SpannableStringBuilder och = new SpannableStringBuilder("\n" +
            "H. CERTIFICADO: ESTE CERTIFICADO ES SIMILAR A LA FIRMA ELECTRONICA, PERO SOLO SERVIRA PARA QUE EN ALGUNOS CASOS PUEDAS TIMBRAR TUS FACTURAS ELECTRONICAS, O TUS PAGOS DE NOMINA EN CASO DE TENER EMPLEADOS, TAMBIEN SE COMPONEN DE TRES ELEMENTOS 1)  ARCHIVO TERMINACION .CER, 2) ARCHIVO CON TERMINACION .KEY Y 3) UNA CONTRASEÑA QUE TU DEFINIRAS." +"\n");

    final StyleSpan bss = new StyleSpan(android.graphics.Typeface.BOLD);

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        titulo=(TextView) view.findViewById(R.id.titulo);
        glosario_titulo.setSpan(bss, 0, 8, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        glosario_titulo.setSpan(new RelativeSizeSpan(2f), 0,8, 0);
        titulo.setText(glosario_titulo);

        primero=(TextView) view.findViewById(R.id.primero);
        primer.setSpan(bss, 3, 8, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        primero.setText(primer);

        segundo=(TextView) view.findViewById(R.id.segundo);
        segund.setSpan(bss, 3, 8, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        segundo.setText(segund);

        tercero=(TextView) view.findViewById(R.id.tercero);
        tercer.setSpan(bss, 3, 8, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        tercero.setText(tercer);

        cuarto=(TextView) view.findViewById(R.id.cuarto);
        cuart.setSpan(bss, 3, 7, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        cuarto.setText(cuart);

        quinto=(TextView) view.findViewById(R.id.quinto);
        quint.setSpan(bss, 3, 7, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        quinto.setText(quint);

        sexto=(TextView) view.findViewById(R.id.sexto);
        sext.setSpan(bss, 3, 8, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        sexto.setText(sext);

        septimo=(TextView) view.findViewById(R.id.septimo);
        sept.setSpan(bss, 3, 21, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        septimo.setText(sept);

        octavo=(TextView) view.findViewById(R.id.octavo);
        och.setSpan(bss, 3, 15, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        octavo.setText(och);

    }

}
