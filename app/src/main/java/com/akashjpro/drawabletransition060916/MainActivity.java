package com.akashjpro.drawabletransition060916;

import android.graphics.drawable.TransitionDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btnRestart, btnReverse;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();

        final TransitionDrawable transitionDrawable = (TransitionDrawable) imageView.getDrawable();

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                transitionDrawable.startTransition(4000);
            }
        });

        btnReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                transitionDrawable.reverseTransition(4000);
            }
        });
    }

    private void addControls() {
        imageView = (ImageView) findViewById(R.id.imageView);
        btnRestart = (Button) findViewById(R.id.buttonRestart);
        btnReverse = (Button) findViewById(R.id.buttonReverse);

    }
}
