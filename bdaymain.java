import java.util.*;
public class bdaymain {
    public static void main(String[] args) {
        int size ;
        int count ;
        int match=0;

        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter no of people: ");
        size = input.nextInt();
        System.out.print("Enter no of simulations: ");
        count = input.nextInt();

        System.out.println();

        for(int i=0; i<count; i++){
            ArrayList<Integer> birthdayList = new ArrayList<Integer>();
            for(int j=0; j<size;j++){
                Random r = new Random();
                int i1 = r.nextInt(365 - 0 + 1) + 0;
                birthdayList.add(i1);
            }
            boolean foundDupe=false;
            for(int z: birthdayList){
                if(arrayCount(birthdayList,z)>1){
                    foundDupe=true;
                }
            }
            if(foundDupe==true){
                match = match+ 1;
            }
        }

        double prob = (double)match/(double)count;
        System.out.println("\n"+ (prob*100) +"% "+"of the time there were two people that shared the same birthday");
    }
    public static int arrayCount(ArrayList<Integer> array, int item) {
        int amt = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).equals(item)) {
                amt++;
            }
            else {
                amt = amt;
            }
        }
        return amt;
    }}
