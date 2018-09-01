package guru.springframework.spring5recipeapp.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(exclude = {"recipe"})
public class Notes {

    private Long id;

    private Recipe recipe;

    private String recipeNotes;

}
