package com.lomi.ledremote;

import android.hardware.ConsumerIrManager;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private ConsumerIrManager irManager;
    private MaterialButton brightnessUp, brightnessDown, play, powerOn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        irManager = (ConsumerIrManager) getSystemService(CONSUMER_IR_SERVICE);

        if (!irManager.hasIrEmitter()) {
            Toast.makeText(this, "No IR blaster found!", Toast.LENGTH_LONG).show();
            return;
        }

        brightnessUp = findViewById(R.id.brightnessUP);
        brightnessDown = findViewById(R.id.brightnessDown);
        play = findViewById(R.id.btnPlay);
        powerOn = findViewById(R.id.btnPowerOn);

        brightnessUp.setOnClickListener(view -> {
           sendIR("0x00FF3AC5");
        });

        brightnessDown.setOnClickListener(view -> {
            sendIR("0x00FFBA45");
        });

        play.setOnClickListener(view -> {
            sendIR("0x00FF827D");
        });

        powerOn.setOnClickListener(view -> {
            sendIR("0x00FF02FD");
        });
    }

    private void sendIR(String hexCode) {
        int[] pattern = NecIrConverter.convertHexToPattern(hexCode);
        irManager.transmit(38000, pattern);
    }
}