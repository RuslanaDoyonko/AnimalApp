package com.example.animalapp

import androidx.annotation.DrawableRes

data class Animal(
    val name: String,
    val subtitle: String,
    val description: String,
    @DrawableRes val imageResource: Int
) {

    companion object {
        val cat = Animal(
            "Cat",
            "Cat is the laziest animal",
            "The cat (Felis catus) is a domestic species of small carnivorous mammal. It is the only domesticated species in the family Felidae and is commonly referred to as the domestic cat or house cat to distinguish it from the wild members of the family. Cats are commonly kept as house pets but can also be farm cats or feral cats; the feral cat ranges freely and avoids human contact. Domestic cats are valued by humans for companionship and their ability to kill rodents. About 60 cat breeds are recognized by various cat registries.",
            R.drawable.cat
        )

        val dog = Animal(
            "Dog",
            "The best friend of human",
            "The dog (Canis familiaris or Canis lupus familiaris) is a domesticated descendant of the wolf. Also called the domestic dog, it is derived from the extinct Pleistocene wolf, and the modern wolf is the dog's nearest living relative. Dogs were the first species to be domesticated by hunter-gatherers over 15,000 years ago before the development of agriculture. Due to their long association with humans, dogs have expanded to a large number of domestic individuals and gained the ability to thrive on a starch-rich diet that would be inadequate for other canids.",
            R.drawable.dog
        )

        val parrot = Animal(
            "Parrot",
            "Better not to curse near parrot",
            "Parrots, also known as psittacines, are birds of the roughly 398 species in 92 genera comprising the order Psittaciformes, found mostly in tropical and subtropical regions. The order is subdivided into three superfamilies: the Psittacoidea (\"true\" parrots), the Cacatuoidea (cockatoos), and the Strigopoidea (New Zealand parrots). One-third of all parrot species are threatened by extinction, with higher aggregate extinction risk (IUCN Red List Index) than any other comparable bird group.",
            R.drawable.parrot
        )
    }

}