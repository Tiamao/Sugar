package com.example.cukier.cukier.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.cukier.cukier.R;
import com.example.cukier.cukier.SingleRecipeActivity;
import com.example.cukier.cukier.model.Ingredient;

import java.util.List;


/**
 * Created by Kamil on 02.06.2017.
 */

public class IngredientsAdapter extends ArrayAdapter {

    private SingleRecipeActivity activity;

    public IngredientsAdapter(Context context, List<Ingredient> ingredients) {
        super(context,0, ingredients);
        this.activity = (SingleRecipeActivity) context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Ingredient ingredient = (Ingredient) getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.ingredient_row, parent, false);
        }

        TextView textView = (TextView) convertView.findViewById(R.id.ingredientRow);
        textView.setText("*" + ingredient.getName());


        // Return the completed view to render on screen
        return convertView;
    }
}
