package open_closed_and_Liskov_substitution.exercises.blob_s.interfaces;

import open_closed_and_Liskov_substitution.exercises.blob_s.models.Blob;

public interface Behavior {

    void trigger(Blob source);

    void applyRecurrentEffect(Blob source);

    boolean isTriggered ();
}
