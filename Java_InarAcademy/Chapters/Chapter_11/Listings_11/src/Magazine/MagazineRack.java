package Magazine;

public class MagazineRack {

    public static void main(String[] args)
    {
        MagazineList rack = new MagazineList();

        rack.enqueue(new Magazine("GQ"));
        rack.enqueue(new Magazine("Time"));
        rack.enqueue(new Magazine("Woodworking Today"));
        rack.enqueue(new Magazine("Communications of the ACM"));
        rack.enqueue(new Magazine("House and Garden"));

        System.out.println(rack);

        Magazine m = rack.dequeue();
        if(m != null)
            System.out.println("Deleted magazine is " + m);
        System.out.println("After Deleting => ");
        System.out.println(rack);
        System.out.println("First Magazine is => " + rack.first());
    }
}