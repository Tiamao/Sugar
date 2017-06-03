package com.example.cukier.cukier;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.cukier.cukier.adapters.IngredientsAdapter;
import com.example.cukier.cukier.model.Ingredient;
import com.example.cukier.cukier.model.IngredientsInRecipe;
import com.example.cukier.cukier.model.MeasureType;
import com.example.cukier.cukier.model.Recipe;
import com.example.cukier.cukier.service.IngredientServiceManager;
import com.example.cukier.cukier.service.IngredientsInRecipeServiceManager;
import com.example.cukier.cukier.service.MeasureTypeServiceManager;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.koushikdutta.ion.Ion;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class SingleRecipeActivity extends AppCompatActivity {


    ImageView imageView;
    TextView duration;
    TextView levelText;
    ListView ingredientsList;
    TextView preparation;
    IngredientsAdapter adapter;
    LinearLayout linearLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_single_recipe);
        setBasicInfo();
    }

    private void setBasicInfo() {
        Intent i = getIntent();
        Recipe recipe = (Recipe) i.getSerializableExtra("recipe");
        String level = (String) i.getSerializableExtra("level");

        List<IngredientsInRecipe> inr = IngredientsInRecipeServiceManager.getInstance().getIngredientsInRecipe(recipe.getRecipeID());
        List<Ingredient> ingredients = new ArrayList<>();

//        for (IngredientsInRecipe e : inr) {
//            Ingredient ing = new Ingredient();
//            ing = IngredientServiceManager.getInstance().getIngredientByID(e.getIngredientId());
//            ingredients.add(ing);
//        }

        imageView = (ImageView) findViewById(R.id.singleImage);
        duration = (TextView) findViewById(R.id.singleDuration);
        levelText = (TextView) findViewById(R.id.singleLevel);
        preparation = (TextView) findViewById(R.id.singlePreparation);

        Ion.with(this).load(recipe.getImagePath()).intoImageView(imageView);
        duration.setText(String.valueOf(recipe.getPreparationTime()) + "min");
        levelText.setText(level);
        preparation.setText(recipe.getPreparation());

//        ingredientsList = (ListView) findViewById(R.id.ingredientsList);
//        adapter = new IngredientsAdapter(this, ingredients);
//        ingredientsList.setAdapter(adapter);
        linearLayout = (LinearLayout) findViewById(R.id.linearList);

        for (IngredientsInRecipe e : inr) {
            Ingredient ing = IngredientServiceManager.getInstance().getIngredientByID(e.getIngredientId());
            MeasureType measureType = MeasureTypeServiceManager.getInstance().getMeasureType(e.getMeasureTypeID());

            TextView vi = (TextView) getLayoutInflater().inflate(R.layout.ingredient_row, null);
            vi.setTextColor(Color.WHITE);
            vi.setText("* " + ing.getName() + " - " +e.getAmount() +" "+ measureType.getMeasureName());
            linearLayout.addView(vi);
        }

        this.setTitle(recipe.getName());



    }
}
