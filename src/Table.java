public class Table {
    int id;
    int size;
    int[] guests;

    public Table(int id,int size){
        this.id=id;
        this.size=size;
        guests= new int[size];
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size){
        this.size=size;
    }
    public void displayGuests(){
        for(int i : guests)
            System.out.print(i+" ");
    }
}
