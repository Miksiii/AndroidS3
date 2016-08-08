package student3.metropolitan.fit.rs.student3;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button showNameButton, openGmapButton, secondActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onShowNameListener();
        onOpenGmapListener();
        onSecondActivityListener();
    }

    public void onShowNameListener() {
        showNameButton = (Button) findViewById(R.id.showNameButton);
        
        showNameButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, "WE STUDY AT: University Metropolitan", Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
    
    public void onOpenGmapListener() {
        openGmapButton = (Button) findViewById(R.id.gmapButton);

        openGmapButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent openMapIntent = new Intent(
                                android.content.Intent.ACTION_VIEW,
                                Uri.parse("geo:37.827500,-122.481670")
                        );
                        startActivity(openMapIntent);
                    }
                }
        );
    }

    public void onSecondActivityListener() {
        secondActivityButton = (Button) findViewById(R.id.secondActivityButton);

        secondActivityButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent changeActivity = new Intent("student3.metropolitan.fit.rs.student3.ActionBarActivity");
                        startActivity(changeActivity);
                    }
                }
        );
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Toast.makeText(MainActivity.this, "orientation changed: landscape active", Toast.LENGTH_LONG).show();
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            Toast.makeText(MainActivity.this, "orientation changed: portrait active", Toast.LENGTH_LONG).show();
        }
    }

}
