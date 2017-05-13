package com.example.cukier.cukier.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.cukier.cukier.MainActivity;
import com.example.cukier.cukier.R;
import com.example.cukier.cukier.model.Recipe;

import java.util.List;

/**
 * Created by Kamil on 13.05.2017.
 */

public class RecipeAdapter extends ArrayAdapter{

    MainActivity activity;

    public RecipeAdapter(Context context, List<Recipe> recipes){
        super(context, 0, recipes);
        this.activity = (MainActivity) context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Recipe recipe = (Recipe) getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.recipe_row, parent, false);
        }
        // Lookup view for data population
//        TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
//        TextView tvHome = (TextView) convertView.findViewById(R.id.tvHome);
//        // Populate the data into the template view using the data object
//        tvName.setText(user.name);
//        tvHome.setText(user.hometown);

//        Button button = (Button) convertView.findViewById(R.id.row);
//        button.setText(sphere.getName());
//        button.setOnClickListener( e->{
//            spheresActivity.navigateToActs(button.getText().toString());
//        });

        RelativeLayout relativeLayout = (RelativeLayout) convertView.findViewById(R.id.row);
        relativeLayout.setOnClickListener(e->{
            activity.navigateToRecipe();
        });

        // Return the completed view to render on screen
        return convertView;
    }
}
