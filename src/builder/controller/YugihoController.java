package builder.controller;

import builder.builder.impl.YugihoCarteBuilderImpl;
import builder.model.YugihoCarteMonstre;


public class YugihoController {
    private YugihoCarteBuilderImpl yugihoCarteBuilder;

    public YugihoController(){
        this.yugihoCarteBuilder = new YugihoCarteBuilderImpl();
    }

    public YugihoCarteMonstre creeLeDragon(){
        // CONSTRUIRE VOTRE CARTE LE DRAGON

        return this.yugihoCarteBuilder.buildCarteMonstre();
    }

    // CONSTURIRE UNE AUTRE CARTE
}
