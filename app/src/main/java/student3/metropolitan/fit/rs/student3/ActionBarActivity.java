package student3.metropolitan.fit.rs.student3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActionBarActivity extends AppCompatActivity {

    private String actionBarChoosedItem;
    private Button yesButton, noButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        onButtonsClickListener();
    }

    public void onButtonsClickListener() {
        yesButton = (Button) findViewById(R.id.yesButton);
        noButton  = (Button) findViewById(R.id.noButton);

        yesButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        if(actionBarChoosedItem != "") {
                            Toast.makeText(
                                    ActionBarActivity.this,
                                    "You've confirmed that you are a student of " + actionBarChoosedItem,
                                    Toast.LENGTH_SHORT).show();
                            actionBarChoosedItem = "";
                        } else {
                            Toast.makeText(
                                    ActionBarActivity.this,
                                    "Please, choose item from actionbar",
                                    Toast.LENGTH_SHORT).show();
                        }

                    }
                }
        );

        noButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        if(actionBarChoosedItem != "") {
                            Toast.makeText(
                                    ActionBarActivity.this,
                                    "You've confirmed that you are not a student of " + actionBarChoosedItem,
                                    Toast.LENGTH_SHORT).show();
                            actionBarChoosedItem = "";
                        } else {
                            Toast.makeText(
                                    ActionBarActivity.this,
                                    "Please, choose item from actionbar",
                                    Toast.LENGTH_SHORT).show();
                        }

                    }
                }
        );
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflator = getMenuInflater();
        inflator.inflate(R.menu.menu_actionbar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.id_fit:
                actionBarChoosedItem = item.toString();
                Toast.makeText(ActionBarActivity.this, item.toString() + " is selected. Now confirm on 'Yes'/'No'.", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.id_fm:
                actionBarChoosedItem = item.toString();
                Toast.makeText(ActionBarActivity.this, item.toString() + " is selected. Now confirm on 'Yes'/'No'.", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.id_fdu:
                actionBarChoosedItem = item.toString();
                Toast.makeText(ActionBarActivity.this, item.toString() + " is selected. Now confirm on 'Yes'/'No'.", Toast.LENGTH_SHORT).show();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
