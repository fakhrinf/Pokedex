package com.fakhrinf.pokedex.model;

import com.fakhrinf.pokedex.R;

import java.util.ArrayList;

public class PokemonData {

    private static String[] pokemonName = {
            "bulbasaur",
            "ivysaur",
            "venusaur",
            "charmander",
            "charmeleon",
            "charizard",
            "squirtle",
            "wartortle",
            "blastoise",
            "caterpie",
            "metapod",
            "butterfree",
            "weedle",
            "kakuna",
            "beedrill"
    };

    private static int[] pokemonimage = {
            R.drawable.bulbasaur,
            R.drawable.ivysaur,
            R.drawable.venusaur,
            R.drawable.charmander,
            R.drawable.charmeleon,
            R.drawable.charizard,
            R.drawable.squirtle,
            R.drawable.wartortle,
            R.drawable.blastoise,
            R.drawable.caterpie,
            R.drawable.metapod,
            R.drawable.butterfree,
            R.drawable.weedle,
            R.drawable.kakuna,
            R.drawable.beedrill
    };

    private static String[] pokemontype = {
            "grass",
            "grass",
            "grass",
            "fire",
            "fire",
            "fire",
            "water",
            "water",
            "water",
            "bug",
            "bug",
            "bug",
            "bug",
            "bug",
            "bug"
    };

    private static String[] pokemoncatch = {
            "45",
            "45",
            "45",
            "45",
            "45",
            "45",
            "45",
            "45",
            "45",
            "225",
            "120",
            "45",
            "255",
            "120",
            "45"
    };

    private static String[] pokemondetail = {
            "Bulbasaur can be seen napping in bright sunlight.\\nThere is a seed on its back. By soaking up the sun’s rays,\\nthe seed grows progressively larger.",
            "There is a bud on this Pokémon’s back. To support its weight,\\nIvysaur’s legs and trunk grow thick and strong.\\nIf it starts spending more time lying in the sunlight,\\nit’s a sign that the bud will bloom into a large flower soon.",
            "There is a large flower on Venusaur’s back. The flower is said\\nto take on vivid colors if it gets plenty of nutrition and sunlight.\\nThe flower’s aroma soothes the emotions of people.",
            "The flame that burns at the tip of its tail is an indication\\nof its emotions. The flame wavers when Charmander\\nis enjoying itself. If the Pokémon becomes enraged,\\nthe flame burns fiercely.",
            "Charmeleon mercilessly destroys its foes using its sharp\\nclaws. If it encounters a strong foe, it turns aggressive.\\nIn this excited state, the flame at the tip of its tail flares with\\na bluish white color.",
            "Charizard flies around the sky in search of powerful opponents.\\nIt breathes fire of such great heat that it melts anything.\\nHowever, it never turns its fiery breath on any opponent\\nweaker than itself.",
            "Squirtle’s shell is not merely used for protection.\\nThe shell’s rounded shape and the grooves on its\\nsurface help minimize resistance in water,\\nenabling this Pokémon to swim at high speeds.",
            "Its tail is large and covered with a rich, thick fur. The tail\\nbecomes increasingly deeper in color as Wartortle ages.\\nThe scratches on its shell are evidence of this Pokémon’s\\ntoughness as a battler.",
            "Blastoise has water spouts that protrude from its shell.\\nThe water spouts are very accurate.\\nThey can shoot bullets of water with enough accuracy\\nto strike empty cans from a distance of over 160 feet.",
            "Perhaps because it would like to grow up\\nquickly, it has a voracious appetite, eating\\na hundred leaves a day.",
            "Its shell is filled with a thick liquid. All of the\\ncells throughout its body are being rebuilt in\\npreparation for evolution.",
            "Its wings are covered in toxic scales. If it finds\\nbird Pokémon going after Caterpie, Butterfree\\nsprinkles its scales on them to drive them off.",
            "Weedle has an extremely acute sense of smell. It is capable\\nof distinguishing its favorite kinds of leaves from those it\\ndislikes just by sniffing with its big red proboscis (nose).",
            "Kakuna remains virtually immobile as it clings to a tree.\\nHowever, on the inside, it is extremely busy as it prepares\\nfor its coming evolution.\\nThis is evident from how hot the shell becomes to the touch.",
            "Beedrill is extremely territorial. No one should ever approach\\nits nest—this is for their own safety. If angered, they will attack\\nin a furious swarm."
    };

    public static ArrayList<Pokemon> getPokemon() {
        ArrayList<Pokemon> list = new ArrayList<>();

        for (int i = 0; i < pokemonName.length; i++) {
            Pokemon pokemon = new Pokemon();
            pokemon.setName(pokemonName[i]);
            pokemon.setType(pokemontype[i]);
            pokemon.setCatchprobability(pokemoncatch[i]);
            pokemon.setDetail(pokemondetail[i]);
            pokemon.setImgdata(pokemonimage[i]);
            list.add(pokemon);
        }

        return list;
    }
}
