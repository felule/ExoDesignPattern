package builder.builder.impl;

import builder.model.Type;
import builder.model.abstraite.YugihoCarte;


// Utiliser le builder
public class YugihoCarteBuilderImpl  {
    private String title;
    private Type type;
    private int level;

    // UN CONSTRUCTEUR
    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }


    public YugihoCarte buildCarteMonstre(){
        // CREATION DE LA CARTE
    }
}
