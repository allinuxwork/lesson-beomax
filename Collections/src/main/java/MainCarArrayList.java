public class MainCarArrayList {
    public static void main(String[] args) {
        CarList carList = new CarArrayList();
        for (int i = 0; i < 90; i++) {
            carList.add(new Car("Brand" + i, i));
        }
        System.out.println(carList.size());

        CarList caList = new CarLinkedList();

        caList.add(new Car("Brand1", 1));
    }
}
