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
    private MaterialButton brightnessUp, brightnessDown, play, powerOn, red1, green1, blue1, white1,
     red2, green2, blue2, white2, red3, green3, blue3, white3, red4, green4, blue4, white4, red5, green5, blue5, white5,
    redArrowUp, redArrowDown, greenArrowUp, greenArrowDown, blueArroowUp, blueArrowDown, diy1, diy2, diy3, diy4, diy5, diy6,
    quick, slow, auto, flash, fade7, jump3, jump7, fade3;

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
        red1 = findViewById(R.id.Red1);
        red2 = findViewById(R.id.Red2);
        red3 = findViewById(R.id.Red3);
        red4 = findViewById(R.id.Red4);
        red5 = findViewById(R.id.Red5);
        green1 = findViewById(R.id.Green1);
        green2 = findViewById(R.id.Green2);
        green3 = findViewById(R.id.Green3);
        green4 = findViewById(R.id.Green4);
        green5 = findViewById(R.id.Green5);
        blue1 = findViewById(R.id.Blue1);
        blue2 = findViewById(R.id.Blue2);
        blue3 = findViewById(R.id.Blue3);
        blue4 = findViewById(R.id.Blue4);
        blue5 = findViewById(R.id.Blue5);
        white1 = findViewById(R.id.White1);
        white2 = findViewById(R.id.White2);
        white3 = findViewById(R.id.White3);
        white4 = findViewById(R.id.White4);
        white5 = findViewById(R.id.White5);
        redArrowUp = findViewById(R.id.redArrowUp);
        redArrowDown = findViewById(R.id.redArrowDown);
        greenArrowUp = findViewById(R.id.greenArrowUp);
        greenArrowDown = findViewById(R.id.greenArrowDown);
        blueArroowUp = findViewById(R.id.blueArrowUp);
        blueArrowDown = findViewById(R.id.blueArrowDown);
        diy1 = findViewById(R.id.diy1);
        diy2 = findViewById(R.id.diy2);
        diy3 = findViewById(R.id.diy3);
        diy4 = findViewById(R.id.diy4);
        diy5 = findViewById(R.id.diy5);
        diy6 = findViewById(R.id.diy6);
        quick = findViewById(R.id.quick);
        slow = findViewById(R.id.slow);
        auto = findViewById(R.id.auto);
        flash = findViewById(R.id.flash);
        fade7 = findViewById(R.id.fade7);
        jump3 = findViewById(R.id.jump3);
        jump7 = findViewById(R.id.jump7);
        fade3 = findViewById(R.id.fade3);

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

        red1.setOnClickListener(view -> {
            sendIR("0x00FF1AE5");
        });

        red2.setOnClickListener(view -> {
            sendIR("0x00FF2AD5");
        });

        red3.setOnClickListener(view -> {
            sendIR("0x00FF0AF5");
        });

        red4.setOnClickListener(view -> {
            sendIR("0x00FF38C7");
        });

        red5.setOnClickListener(view -> {
            sendIR("0x00FF18E7");
        });

        green1.setOnClickListener(view -> {
            sendIR("0x00FF9A65");
        });

        green2.setOnClickListener(view -> {
            sendIR("0x00FFAA55");
        });

        green3.setOnClickListener(view -> {
            sendIR("0x00FF8A75");
        });

        green4.setOnClickListener(view -> {
            sendIR("0x00FFB847");
        });

        green5.setOnClickListener(view -> {
            sendIR("0x00FF9867");
        });

        blue1.setOnClickListener(view -> {
            sendIR("0x00FFA25D");
        });

        blue2.setOnClickListener(view -> {
            sendIR("0x00FF926D");
        });

        blue3.setOnClickListener(view -> {
            sendIR("0x00FFB24D");
        });

        blue4.setOnClickListener(view -> {
            sendIR("0x00FF7887");
        });

        blue5.setOnClickListener(view -> {
            sendIR("0x00FF58A7");
        });

        white1.setOnClickListener(view -> {
            sendIR("0x00FF22DD");
        });

        white2.setOnClickListener(view -> {
            sendIR("0x00FF12ED");
        });

        white3.setOnClickListener(view -> {
            sendIR("0x00FF32CD");
        });

        white4.setOnClickListener(view -> {
            sendIR("0x00FFF807");
        });

        white5.setOnClickListener(view -> {
            sendIR("0x00FFD827");
        });

        redArrowUp.setOnClickListener(view -> {
            sendIR("0x00FF28D7");
        });

        redArrowDown.setOnClickListener(view -> {
            sendIR("0x00FF08F7");
        });

        greenArrowUp.setOnClickListener(view -> {
            sendIR("0x00FFA857");
        });

        greenArrowDown.setOnClickListener(view -> {
            sendIR("0x00FF8877");
        });

        blueArroowUp.setOnClickListener(view -> {
            sendIR("0x00FF6897");
        });

        blueArrowDown.setOnClickListener(view -> {
            sendIR("0x00FF48B7");
        });

        quick.setOnClickListener(view -> {
            sendIR("0x00FFE817");
        });

        slow.setOnClickListener(view -> {
            sendIR("0x00FFC837");
        });

        auto.setOnClickListener(view -> {
            sendIR("0x00FFF00F");
        });

        flash.setOnClickListener(view -> {
            sendIR("0x00FFD02F");
        });

        fade7.setOnClickListener(view -> {
            sendIR("0x00FFE01F");
        });

        diy1.setOnClickListener(view -> {
            sendIR("0x00FF30CF");
        });

        diy2.setOnClickListener(view -> {
            sendIR("0x00FFB04F");
        });

        diy3.setOnClickListener(view -> {
            sendIR("0x00FF708F");
        });

        diy4.setOnClickListener(view -> {
            sendIR("0x00FF10EF");
        });

        diy5.setOnClickListener(view -> {
            sendIR("0x00FF906F");
        });

        diy6.setOnClickListener(view -> {
            sendIR("0x00FF50AF");
        });

        jump3.setOnClickListener(view -> {
            sendIR("0x00FF20DF");
        });

        jump7.setOnClickListener(view -> {
            sendIR("0x00FFA05F");
        });

        fade3.setOnClickListener(view -> {
            sendIR("0x00FF609F");
        });
    }

    private void sendIR(String hexCode) {
        int[] pattern = NecIrConverter.convertHexToPattern(hexCode);
        irManager.transmit(38000, pattern);
    }
}