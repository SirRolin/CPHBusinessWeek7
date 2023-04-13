package Arv;

public class Chicken extends Animal implements Edible {

    @Override
    public String sound() {
        return "Short chit chat";
    }

    @Override
    public String howToEat() {
        return """
                Strap it's feet together, then chop it's head off.
                When it's stopped bleeding, put it in a Steam Chamber for an hour.
                Then Remove all the feathers with a knife.
                Split it's ribcage and remove it's intestines.
                From then on you can prepare it in allot of ways.
                Most common method is to cook it whole.""";
    }
}
