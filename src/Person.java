import java.util.Scanner;

public class Person {
    int id;
    int numberOfFriends;
    int[] preferention;

    public Person(int id,int nuberOfFriends){
        this.id=id;
        this.numberOfFriends=nuberOfFriends;
        preferention=new int[nuberOfFriends];
    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(int numberOfFriends) {
        this.numberOfFriends = numberOfFriends;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPreferention(int[] preferention) {
        this.preferention = preferention;
    }
    public void setPreferention(){
        int friend;
        Scanner in= new Scanner(System.in);
        int[] friends=new int[numberOfFriends];
        for(int i=0;i<numberOfFriends;i++){
            System.out.print("POdaj ID przyjaciela: ");
            friends[i]=in.nextInt();
        }
        setPreferention(friends);
    }
}
