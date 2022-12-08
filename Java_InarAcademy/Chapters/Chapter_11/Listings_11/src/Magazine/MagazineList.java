package Magazine;
public class MagazineList
{
    private MagazineNode front;
    private MagazineNode rear;

    public MagazineList() {
        front = null;
        rear = null;
    }
    public void enqueue(Magazine next)
    {
        MagazineNode node = new MagazineNode(next);
        if(front == null && rear == null) {
            front = node;
            rear = node;
        }
        else {
            rear.next = node;
            rear = node;
        }
    }
    public String toString() {
        MagazineNode current = front;
        String result = "";
        do {
            result += current.magazine + "\n";
            current = current.next;
        } while (current != rear);
        return result;
    }
    public Magazine dequeue() {
        if(front==null) {
            System.out.println("Queue is empty!");
            return null;
        } else {
            Magazine mag=front.magazine;
            if(front==rear) {
                front=null;
                rear=null;
            } else {
                front=front.next;
            }
            return mag;
        }
    }

    public Magazine first() {
        if (front == null)
            return null;
        else
            return front.magazine;

    }
}
class MagazineNode {
    public Magazine magazine;
    public MagazineNode next;

    //--------------------------------------------------------------
    //  Sets up the node
    //--------------------------------------------------------------
    public MagazineNode(Magazine mag) {
        magazine = mag;
        next = null;
    }
}
