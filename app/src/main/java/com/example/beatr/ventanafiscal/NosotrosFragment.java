package com.example.beatr.ventanafiscal;


import android.app.Fragment;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

import android.support.annotation.Nullable;
import android.telephony.PhoneNumberUtils;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class NosotrosFragment extends Fragment {
    private TextView textView;
    private ImageButton imageButton, imageButton2;

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
    final SpannableStringBuilder sb = new SpannableStringBuilder("\n\n\n\n\n\n\n" +
            " Acerca de nosotros" +" \n\n\n\n\n" +
            "Somos un despacho contable que atiende personas físical y morales. Somos completamente honestos" +"\n"+ "y apegados a las leyes fiscales." +
            "\n\n\n" + "Para cualquier asesoría o informes no dude en contactarnos.");

    final StyleSpan bss = new StyleSpan(android.graphics.Typeface.BOLD);

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        //imageView=(ImageView) view.findViewById(R.id.imageView2);
        textView=(TextView) view.findViewById(R.id.nosotros);
        imageButton=(ImageButton)view.findViewById(R.id.imageButtonC);
        sb.setSpan(bss, 8, 26, Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        sb.setSpan(new RelativeSizeSpan(2f), 8,26, 0);
        textView.setText(sb);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:5585754039"));
                getActivity().startActivity(intent);
            }
        });
        imageButton2=(ImageButton)view.findViewById(R.id.imageButtonW);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWhatsApp();
            }
        });

    }

    private void openWhatsApp() {
        String smsNumber = "+5215585754039";
        boolean isWhatsappInstalled = whatsappInstalledOrNot("com.whatsapp");
        if (isWhatsappInstalled) {

            Intent sendIntent = new Intent("android.intent.action.MAIN");
            sendIntent.setComponent(new ComponentName("com.whatsapp", "com.whatsapp.Conversation"));
            sendIntent.putExtra("jid", PhoneNumberUtils.stripSeparators(smsNumber) + "@s.whatsapp.net");//phone number without "+" prefix

            startActivity(sendIntent);
        } else {
            Uri uri = Uri.parse("market://details?id=com.whatsapp");
            Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
            Toast.makeText(getActivity(),"WhatsApp not Installed",Toast.LENGTH_SHORT).show();
            getActivity().startActivity(goToMarket);
        }
    }
    private boolean whatsappInstalledOrNot(String uri) {
        PackageManager pm = getActivity().getPackageManager();
        boolean app_installed = false;
        try {
            pm.getPackageInfo(uri, PackageManager.GET_ACTIVITIES);
            app_installed = true;
        } catch (PackageManager.NameNotFoundException e) {
            app_installed = false;
        }
        return app_installed;
    }
}
