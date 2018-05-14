public class Exercise20 {

    /* . Write a method called shift that rearranges the elements of a list of integers by moving to the end of the list all values
that are in odd-numbered positions and otherwise preserving list order. For example, suppose that a variable list
stores the values [10, 31, 42, 23, 44, 75, 86]. The call of list.shift(); should rearrange the list to store
[10, 42, 44, 86, 31, 23, 75]. It doesn’t matter whether the value itself is odd or even; what matters is
whether the value appears in an odd index (index 1, 3, 5, etc.). Also notice that the original order of the list is otherwise
preserved. You may not construct any new nodes nor use any auxiliary data structures to solve this problem. You
also may not change any data fields of the nodes; you must solve this problem by rearranging the links of the list.
*/

    public static void main(String[] args) {
        LinkedIntList liste1 = new LinkedIntList();

        liste1.add(10);
        liste1.add(31);
        liste1.add(42);
        liste1.add(23);
        liste1.add(44);
        liste1.add(75);
        liste1.add(86);
        System.out.println("This is the list: " + liste1);

        liste1.shift();

        System.out.println("\n after shifting method: " + liste1);
    }
}
class List
{
    public int data;
    public List next;


    public List(int data) {
        this(data,null);
    }

    public List(int data, List next) {
        this.data = data;
        this.next = next;
    }
}

class LinkedIntList {
    private List front;
    public LinkedIntList() {
        front = null;
    }
    public String toString() {
        if (front == null) {
            return "[]";
        } else {
            String result = "[" + front.data;
            List current = front.next;

            while (current != null) {
                result += ", " + current.data;
                current = current.next;
            }
            result += "] ";
            return result;
        }
    }
    public void add(int value) {
        if (front == null) {
            front = new List(value);
        } else {
            List current = front;

            while (current.next != null) {
                current = current.next;
            }
            current.next = new List(value);
        }
    }
    public void shift ()
    {
        if(front == null)
        {
            System.out.println("\n Its null :( ");
        }
        else
        {
            int count = 0;
            List last = front;

            while (last != null)
            {
                last = last.next;
                count = count + 1;
            }
            List fst = front;
            List lst = front.next;
            List current = front.next;

            for (int i = 0; i < count; i++) {
                if (i % 2==1)
                {
                    if (current != null)
                    {
                        current = current.next;
                        fst.next = current;
                        int value = lst.data;
                        add(value);
                    }
                    fst = fst.next;
                    lst = fst.next;
                    current = current.next;
                    i = i + 1;
                }
            }
        }
    }
}



