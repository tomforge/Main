package seedu.address.model.util;

import seedu.address.model.Anakin;
import seedu.address.model.ReadOnlyAnakin;
import seedu.address.model.deck.Answer;
import seedu.address.model.deck.Card;
import seedu.address.model.deck.Deck;
import seedu.address.model.deck.Name;
import seedu.address.model.deck.Question;

/**
 * Contains utility methods for populating {@code Anakin} with sample decks.
 */
public class SampleDataUtil {
    /**
     * @param sampleAnakin
     * @return sampleAnakin with a sample deck
     */
    public static final Card SAMPLE_CARD_1 = new Card(new Question("What is always coming, but never arrives?"),
            new Answer("Tomorrow"));
    public static final Card SAMPLE_CARD_2 = new Card(new Question("What can be broken, but is never held?"),
            new Answer("A promise"));
    public static final Card SAMPLE_CARD_3 = new Card(new Question("What is it that lives if it is fed, and dies if you "
            + "give it a drink?"), new Answer("Fire"));
    public static final Card SAMPLE_CARD_4 = new Card(new Question("What can one catch that is not thrown?"),
            new Answer("A cold"));
    public static final Card SAMPLE_CARD_5 = new Card(new Question("What is it that if you have, you want to share me, "
            + "and if you share, you do not have?"), new Answer("A secret"));
    public static final Card SAMPLE_CARD_6 = new Card(new Question("If it takes eight men ten hours to build a wall, "
            + "how long would it take four men?"),
            new Answer("No time, because the wall is already built"
                    + "."));
    public static final Deck SAMPLE_DECK = new Deck(new Name("Asking Questions"));

    private static Anakin addSampleDeck(Anakin sampleAnakin) {
        sampleAnakin.addDeck(SAMPLE_DECK);
        sampleAnakin.getIntoDeck(SAMPLE_DECK);
        sampleAnakin.addCard(SAMPLE_CARD_1);
        sampleAnakin.addCard(SAMPLE_CARD_2);
        sampleAnakin.addCard(SAMPLE_CARD_3);
        sampleAnakin.addCard(SAMPLE_CARD_4);
        sampleAnakin.addCard(SAMPLE_CARD_5);
        sampleAnakin.addCard(SAMPLE_CARD_6);
        return sampleAnakin;
    }

    public static ReadOnlyAnakin getSampleAnakin() {
        Anakin sampleAnakin = new Anakin();
        addSampleDeck(sampleAnakin);
        return sampleAnakin;
    }
}
