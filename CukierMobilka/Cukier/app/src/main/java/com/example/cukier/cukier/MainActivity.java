package com.example.cukier.cukier;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.cukier.cukier.adapters.RecipeAdapter;
import com.example.cukier.cukier.comparators.RecipeLevelComparator;
import com.example.cukier.cukier.comparators.RecipeTimeComparator;
import com.example.cukier.cukier.model.Recipe;
import com.example.cukier.cukier.service.RecipeServiceManager;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView root;
    private RecipeAdapter recipeAdapter;
    private List<Recipe> recipeList;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build(); // .addTestDevice("DDDFB8AD75B7ADB171A775DDE8145B06").addTestDevice("")
        mAdView.loadAd(adRequest);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });


        root = (ListView) findViewById(R.id.recipeList);

        recipeList = RecipeServiceManager.getInstance().getRecipes();
//        recipeList.add(new Recipe());
//        recipeList.add(new Recipe());
//        recipeList.add(new Recipe());
//        recipeList.add(new Recipe());
//        recipeList.add(new Recipe());

        recipeAdapter = new RecipeAdapter(this, recipeList);
        root.setAdapter(recipeAdapter);
    }

    private void setBasicInfo(){

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.levelSort) {
            levelSort();
            return true;
        } else if( id == R.id.timeSort){
            timeSort();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void timeSort(){
        Collections.sort(recipeList, new RecipeTimeComparator());
        recipeAdapter = new RecipeAdapter(this, recipeList);
        root.setAdapter(recipeAdapter);
    }

    private void levelSort(){
        Collections.sort(recipeList, new RecipeLevelComparator());
        recipeAdapter = new RecipeAdapter(this, recipeList);
        root.setAdapter(recipeAdapter);
    }

    public void navigateToRecipe(Recipe recipe, String level) {
        Intent intent = new Intent(this, SingleRecipeActivity.class);
//        intent.putExtra("sphere", text);
        intent.putExtra("recipe", recipe);
        intent.putExtra("level", level);
        startActivity(intent);
    }
}
