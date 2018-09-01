package guru.springframework.spring5recipeapp.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Recipe {

    private Long id;

    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;

    private Difficulty difficulty;

    private Byte[] image;

    private Notes notes;

    private Set<Ingredient> ingredients = new HashSet<>();

    private Set<Category> categories = new HashSet<>();

    public void setNotes(Notes notes) {
        if (notes != null) {
            this.notes = notes;
            this.notes.setRecipe(this);
        }
    }

    public Recipe addIngredient(Ingredient ingredient){
        ingredient.setRecipe(this);
        this.getIngredients().add(ingredient);
        return this;
    }

}
