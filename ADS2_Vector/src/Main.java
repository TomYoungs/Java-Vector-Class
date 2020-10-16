public class Main {
    public static void main(String[] args) {
        ADS2Vector myVector = new ADS2Vector();
        myVector.Append(50);
        myVector.Append(140);
        myVector.Append(70);
        myVector.Append(2);
        myVector.Append(600);
        myVector.Append(600);
        myVector.Append(45);
        myVector.Append(75);
        myVector.DeleteItem(2);
        myVector.Append(69);
        myVector.InsertItem(6,420);
        System.out.println(myVector.Find(70));

       // ADS2Vector myVector2 = new ADS2Vector(4);




        System.out.println();
    }
}
