package monpackage;

public class ClassePourTestBlockCode {

    public static void main(String[] args) {
        int tab[] = {1,2,3,4};
        try{
            tab[4] = 3;

        } catch(Exception e ){
            System.out.println("Erreur d'index");
        }
    }

    public void boucle(){
        for (int i=0;i<10;i++){
            System.out.println(i);
        }
    }
}
