package guru.springframework.spring5recipeapp.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(exclude = {"recipes"})
public class Category {

    private Long id;

    private String description;

    private Set<Recipe> recipes;

}
