package talktodeaf.learndeafcolor.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.cengalabs.flatui.views.FlatButton;

import talktodeaf.learndeafcolor.R;
import talktodeaf.learndeafcolor.colorlearn.ColorList;
import talktodeaf.learndeafcolor.game.Game;


public class MainActivity extends AppCompatActivity {
    private FlatButton btnLearn,btnGame;
    private Intent learnIntent,gameIntent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLearn = (FlatButton)findViewById(R.id.btn_learn);
        btnGame = (FlatButton)findViewById(R.id.btn_game);
        btnLearn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                learnIntent = new Intent(MainActivity.this,ColorList.class);
                startActivity(learnIntent);
            }
        });
        btnGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameIntent = new Intent(MainActivity.this,Game.class);
                startActivity(gameIntent);
            }
        });

    }

}
