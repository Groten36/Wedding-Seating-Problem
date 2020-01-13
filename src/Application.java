import java.util.Scanner;

public class Application {
    int numberOfTables;
    int numberOfPersons;
    Table[] tables;
    Person[] persons;
    Scanner in= new Scanner(System.in);
    public Application(){
        createTables();
        createPersons();
    }

    void createTables(){
        int size;
        System.out.print("Podaj liczbę stolików: ");
        numberOfTables=in.nextInt();
        tables=new Table[numberOfTables];
        for(int i=0;i<numberOfTables;i++){
            System.out.print("Tworze stolik nr "+i+".\nPodaj jego rozmiar: ");
            size=in.nextInt();
            tables[i]=new Table(i,size);
        }
    }


    void createPersons(){
        int size;
        System.out.print("Podaj liczbę gości: ");
        numberOfPersons=in.nextInt();
        persons=new Person[numberOfPersons];
        for(int i=0;i<numberOfPersons;i++){
            System.out.print("Tworze gościa nr "+i+".\nPodaj liczbę jego przyjaciół: ");
            size=in.nextInt();
            persons[i]=new Person(i,size);
            persons[i].setPreferention();
        }
    }

    void solve(){
        
    }

}
