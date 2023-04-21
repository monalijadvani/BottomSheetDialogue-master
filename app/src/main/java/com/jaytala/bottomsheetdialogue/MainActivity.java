package com.jaytala.bottomsheetdialogue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class MainActivity extends AppCompatActivity {

    Button bottomSheetDialog;

    private BottomSheetDialog BottomSheetDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomSheetDialog = findViewById(R.id.bottomSheetDialog);

        bottomSheetDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                BottomSheetDialog dialog = new BottomSheetDialog(MainActivity.this,R.style.SheetDialoge);
                dialog.setContentView(R.layout.bottom_sheet_dialogue);

                Button Close = dialog.findViewById(R.id.closeDialog);
                Close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

    }
}