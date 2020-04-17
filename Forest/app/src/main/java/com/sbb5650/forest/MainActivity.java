package com.sbb5650.forest;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    private String numberOfTrees;

    private int colorSummerOak;
    private int colorAutumnOak;
    private int colorRedMaple;
    private int colorElm;
    private int treeCount = 0;
    private boolean isSummerOak = false;
    private boolean isAutumnOak = false;
    private boolean isRedMaple = false;
    private boolean isElm = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set up the widgets
        final EditText edHowManyTrees = (EditText) findViewById(R.id.edHowManyTrees);
        numberOfTrees = edHowManyTrees.getText().toString();
        final CheckBox cbSummerOak = (CheckBox) findViewById(R.id.cbSummerOak);
        final CheckBox cbAutumnOak = (CheckBox) findViewById(R.id.cbAutumOak);
        final CheckBox cbRedMaple = (CheckBox) findViewById(R.id.cbRedMaple);
        final CheckBox cbElm = (CheckBox) findViewById(R.id.cbElm);
        final RadioGroup rgSummerOak = (RadioGroup) findViewById(R.id.rgSummerOak);
        final RadioGroup rgAutumnOak = (RadioGroup) findViewById(R.id.rgAutumnOak);
        final RadioGroup rgRedMaple = (RadioGroup) findViewById(R.id.rgRedMaple);
        final RadioGroup rgElm = (RadioGroup) findViewById(R.id.rgElm);
        final RadioButton rbRedSummerOak = (RadioButton) findViewById(R.id.rbRedSummerOak);
        final RadioButton rbGreenSummerOak = (RadioButton) findViewById(R.id.rbGreenSummerOak);
        final RadioButton rbBlueSummerOak = (RadioButton) findViewById(R.id.rbBlueSummerOak);
        final RadioButton rbBlackSummerOak = (RadioButton) findViewById(R.id.rbBlackSummerOak);
        final RadioButton rbRedAutumnOak = (RadioButton) findViewById(R.id.rbRedAutumnOak);
        final RadioButton rbGreenAutumnOak = (RadioButton) findViewById(R.id.rbGreenAutumnOak);
        final RadioButton rbBlueAutumnOak = (RadioButton) findViewById(R.id.rbBlueAutumnOak);
        final RadioButton rbBlackAutumnOak = (RadioButton) findViewById(R.id.rbBlackAutumnOak);
        final RadioButton rbRedRedMaple = (RadioButton) findViewById(R.id.rbRedRedMaple);
        final RadioButton rbGreenRedMaple = (RadioButton) findViewById(R.id.rbGreenRedMaple);
        final RadioButton rbBlueRedMaple = (RadioButton) findViewById(R.id.rbBlueRedMaple);
        final RadioButton rbBlackRedMaple = (RadioButton) findViewById(R.id.rbBlackRedMaple);
        final RadioButton rbRedElm = (RadioButton) findViewById(R.id.rbRedElm);
        final RadioButton rbGreenElm = (RadioButton) findViewById(R.id.rbGreenElm);
        final RadioButton rbBlueElm = (RadioButton) findViewById(R.id.rbBlueElm);
        final RadioButton rbBlackElm = (RadioButton) findViewById(R.id.rbBlackElm);

        // handle the button
        Button btnMakeForest = (Button) findViewById(R.id.btnMakeForest);
        btnMakeForest.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.d("Main", "Button works!!! ===================================");
                numberOfTrees = edHowManyTrees.getText().toString();

                treeCount = 0;
                // check Summer Oak seettings
                if (cbSummerOak.isChecked()) {
                    treeCount++;
                    if (rgSummerOak.getCheckedRadioButtonId() == -1) {
                        // no radio buttons are checked
                    } else {
                        if (rbRedSummerOak.isChecked()) {
                            colorSummerOak = Color.RED;
                        }
                        if (rbGreenSummerOak.isChecked()) {
                            colorSummerOak = Color.GREEN;
                        }
                        if (rbBlueSummerOak.isChecked()) {
                            colorSummerOak = Color.BLUE;
                        }
                        if (rbBlackSummerOak.isChecked()) {
                            colorSummerOak = Color.BLACK;
                        }
                    }
                }

                // check Autumn Oak seettings
                if (cbAutumnOak.isChecked()) {
                    treeCount++;
                    if (rgAutumnOak.getCheckedRadioButtonId() == -1) {
                        // no radio buttons are checked
                    } else {
                        if (rbRedAutumnOak.isChecked()) {
                            colorAutumnOak = Color.RED;
                        }
                        if (rbGreenAutumnOak.isChecked()) {
                            colorAutumnOak = Color.GREEN;
                        }
                        if (rbBlueAutumnOak.isChecked()) {
                            colorAutumnOak = Color.BLUE;
                        }
                        if (rbBlackAutumnOak.isChecked()) {
                            colorAutumnOak = Color.BLACK;
                        }
                    }
                }

                // check Red Maple seettings
                if (cbRedMaple.isChecked()) {
                    treeCount++;
                    if (rgRedMaple.getCheckedRadioButtonId() == -1) {
                        // no radio buttons are checked
                    } else {
                        if (rbRedRedMaple.isChecked()) {
                            colorRedMaple = Color.RED;
                        }
                        if (rbGreenRedMaple.isChecked()) {
                            colorRedMaple = Color.GREEN;
                        }
                        if (rbBlueRedMaple.isChecked()) {
                            colorRedMaple = Color.BLUE;
                        }
                        if (rbBlackRedMaple.isChecked()) {
                            colorRedMaple = Color.BLACK;
                        }
                    }
                }

                // check Elm seettings
                if (cbElm.isChecked()) {
                    treeCount++;
                    if (rgElm.getCheckedRadioButtonId() == -1) {
                        // no radio buttons are checked
                    } else {
                        if (rbRedElm.isChecked()) {
                            colorElm = Color.RED;
                        }
                        if (rbGreenElm.isChecked()) {
                            colorElm = Color.GREEN;
                        }
                        if (rbBlueElm.isChecked()) {
                            colorElm = Color.BLUE;
                        }
                        if (rbBlackElm.isChecked()) {
                            colorElm = Color.BLACK;
                        }
                    }
                }
                int i = 0;

                // call ForestActivity passign data
                // Creating Bundle object
                Bundle b = new Bundle();

                // Storing data into bundle
                b.putInt("numberOfTrees", Integer.parseInt(numberOfTrees));
                b.putInt("treeCount", treeCount);

                // Creating Intent object
                Intent in = new Intent(MainActivity.this, ForestActivity.class);

                // Storing bundle object into intent
                in.putExtras(b);
                startActivity(in);
            }
        });
    }
}

