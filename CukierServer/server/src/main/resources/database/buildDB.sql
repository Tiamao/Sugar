CREATE DATABASE sugar

USE sugar;

CREATE TABLE difficultyLevel(
difficultyLevelID int not null auto_increment,
level varchar(10),
PRIMARY KEY(difficultyLevelID)
);

CREATE TABLE recipe(
recipeID int not null auto_increment,
name varchar(40),
preparation text,
imagePath varchar(40),
piecesCount int,
preparationTime int,
difficultyLevelID int not null,
FOREIGN KEY (difficultyLevelID) REFERENCES difficultyLevel(difficultyLevelID),
PRIMARY KEY(recipeID)
);

CREATE TABLE ingredient(
ingredientID int not null auto_increment,
name varchar(20),
PRIMARY KEY(ingredientID)
);

CREATE TABLE measureType(
measureTypeID int not null auto_increment,
measureName varchar(10),
PRIMARY KEY(measureTypeID)
);

CREATE TABLE ingredientsInRecipe(
ingredientsInRecipeID int not null auto_increment,
recipeID int,
ingredientID int,
amount int,
measureTypeID int,
FOREIGN KEY (recipeID) REFERENCES recipe(recipeID),
FOREIGN KEY (ingredientID) REFERENCES ingredient(ingredientID),
FOREIGN KEY (measureTypeID) REFERENCES measureType(measureTypeID),
PRIMARY KEY(ingredientsInRecipeID)
);