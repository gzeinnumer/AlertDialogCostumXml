package com.gzeinnumer.alertdialogcostumxml;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AlertDialogCostumExer extends AppCompatActivity {

    Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exer_alert_dialog_costum);

        Button button =findViewById(R.id.btnAlertDialog);


        // add button listener
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                // custom dialog
                //context hav to declare from main.
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.exer_alert_dialog_costum_alert_dialog);
                dialog.setTitle("Title...");

                // set the custom dialog components - text, image and button
                TextView text = (TextView) dialog.findViewById(R.id.text);
                text.setText("Android custom Dialog Example!");
                ImageView image = (ImageView) dialog.findViewById(R.id.image);
                image.setImageResource(R.mipmap.ic_launcher);

                Button dialogButtonOK = (Button) dialog.findViewById(R.id.dialogButtonOK);
                Button dialogButtonToast = (Button) dialog.findViewById(R.id.dialogButtonToast);
                // if button is clicked, close the custom dialog
                dialogButtonOK.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialogButtonToast.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context,"Toast Tampil", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });
    }
}
