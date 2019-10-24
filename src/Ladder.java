import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ladder {

    public static void main (String[] args) throws FileNotFoundException, CloneNotSupportedException {
        Scanner sc = new Scanner(new File("input.txt"));
        while (sc.hasNextLine())
        {
            findWordLadder(sc.next(), sc.next());
        }
    }
    @SuppressWarnings("Duplicates")
    private static void findWordLadder(String start, String end) throws CloneNotSupportedException, FileNotFoundException {
        if (start.length() != end.length()) {
            System.out.println("No can do");
            return;
        }
        if (start.equals(end)){
            System.out.println(start);
            return;
        }
        String  aplha = "abcdefghijklmnopqrstuvwxyz";
        Dictionary dict = new Dictionary();
        LinkedList queue = new LinkedList();
        Set<String> used = new HashSet<>();
        for (int i=0; i<start.length();i++)
        {
            for (int j=0;j<aplha.length();j++)
            {
                LinkedList stack = new LinkedList();
                stack.addFront(start);
                if (start.charAt(i) != aplha.charAt(j)) {
                   String mod = start.substring(0,i) + aplha.charAt(j) + start.substring(i+1);
                    if (dict.hasWord(mod))
                    {
                         stack.addFront(mod);
                    }
                    if(!used.contains(mod))
                    {
                        used.add(mod);
                        queue.addBack(stack);
                    }
                }

            }
        }
        while (queue.size() > 0)
        {
            if (queue.size() ==0) System.out.println("no can do");
             Object o = queue.removeFront();
             LinkedList dequeueStack = (LinkedList)(o);
             if (dequeueStack.peekFront().equals(end)) {
                 System.out.println(dequeueStack);
                 break;
             }
             String newStart = (String)(dequeueStack.peekFront());
            for (int i=0; i<newStart.length();i++)
            {
                for (int j=0;j<aplha.length();j++)
                {
                        LinkedList newStk = (LinkedList) dequeueStack.clone();

                    if (newStart.charAt(i) != aplha.charAt(j)) {
                        String mod = newStart.substring(0,i) + aplha.charAt(j) + newStart.substring(i+1);
                        if (dict.hasWord(mod))
                        {
                             newStk.addFront(mod);
                        }
                        if(!used.contains(mod))
                        {
                            used.add(mod);
                            queue.addBack(newStk);
                        }
                    }

                }
            }


        }
    }
}
