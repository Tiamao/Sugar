package com.example.cukier.cukier;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.cukier.cukier.model.Recipe;

import org.w3c.dom.Text;

public class SingleRecipeActivity extends AppCompatActivity {


    ImageView imageView;
    TextView duration;
    TextView levelText;
    ListView ingredientsList;
    TextView preparation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        setContentView(R.layout.activity_single_recipe);
        setBasicInfo();
    }

    private void setBasicInfo(){
        Intent i = getIntent();
        Recipe recipe = (Recipe) i.getSerializableExtra("recipe");
        String level = (String) i.getSerializableExtra("level");

        imageView = (ImageView) findViewById(R.id.singleImage);
        duration = (TextView) findViewById(R.id.singleDuration);
        levelText = (TextView) findViewById(R.id.singleLevel);
        preparation = (TextView) findViewById(R.id.singlePreparation);

        duration.setText(String.valueOf(recipe.getPreparationTime()) + "min");
        levelText.setText(level);
        preparation.setText(recipe.getPreparation());
    }
}
