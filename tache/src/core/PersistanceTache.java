package core;

/**
 * Created by chihebdaoues on 12/9/17.
 */
public interface PersistanceTache {
    void charger(TacheList tacheList);
    void enregistrer(TacheList tacheList);
    void ajouter(Tache tache);
    void supprimer(long id);
    void modifier(Tache tache , long id);
}
