package calendrier;

public class CalendrierAnnuel {

    private Mois[] calendrier = calendrier = new Mois[] {
        new Mois("Janvier", 31),
        new Mois("Février", 28),
        new Mois("Mars", 31),
        new Mois("Avril", 30),
        new Mois("Mai", 31),
        new Mois("Juin", 30),
        new Mois("Juillet", 31),
        new Mois("Aout", 31),
        new Mois("Septembre", 30),
        new Mois("Octobre", 31),
        new Mois("Novembre", 30),
        new Mois("Decembre", 31),
    };

    public class Mois {

        private String mois;
        private boolean[] jours;

        private Mois(String nom, int nbJours) {
            jours = new boolean[nbJours];
            mois = nom;
        }

        private boolean estLibre(int jour) {
            return jours[jour - 1];
        }

        private void reserver(int jour) {
            jours[jour - 1] = true;
        }
    }
    
    private boolean estLibre(int jour) {
        // TODO
    }

    private void reserver(int jour) {
        // TODO
    }
}
