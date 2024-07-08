import  java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        //synta
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(652);
        list.add(6565);
        list.add(6562);
        list.add(6554);
        list.add(65543);
        list.add(65324);
        list.add(6525);

        list.set(0, 8998);
        System.out.println(list);


    }
}
