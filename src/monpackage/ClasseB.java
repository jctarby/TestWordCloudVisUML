package monpackage;

import unpackage.ClasseA;

public class ClasseB {

    private String nom;
    private int age;

    /**
     * Voici un exemple de texte qui ne raconte rien de particulier mais qui doit servir en théorie à créer des
     * tags, c'est-à-dire des mots-clés contenant de la sémantique
     */

    // ajout de texte vide

    // il était une fois un plugin appelé visuml qui faisait des diagrammes UML interactifs connectées en temps réel.
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        ClasseA classeA = new ClasseA();
        this.setAge(classeA.getAge());
        for (int i = 0; i < 10; i++) {
            this.setAge(classeA.getAge());
        }
        try {
            this.setAge(classeA.getAge());
            for (int i = 0; i < 10; i++) {
                this.setAge(classeA.getAge());
            }
        } catch (Exception exception) {} ;

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ClasseB() {
    }
}
