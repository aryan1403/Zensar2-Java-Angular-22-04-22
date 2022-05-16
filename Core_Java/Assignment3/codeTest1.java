package Core_Java.Assignment3;

import java.util.*;

public class codeTest1 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            String arr[] = new String[n];

            for (int i=0;i<n;i++)
            arr[i]=sc.next();

            int len=0;
            ArrayList<String> oddLength=new ArrayList<String>();
            for(int i=0;i<n;i++){
                len=arr[i].length();
                if(len%2==1)
                oddLength.add(arr[i]);
            }
            if(oddLength.size()==0)
               System.out.println("Better  luck next time");
            else{
                Iterator itr=oddLength.iterator();
                int max=-1;
                String res="";
                while(itr.hasNext()){
                    String temp=(String)itr.next();
                    if(temp.length()>max){
                        res=temp;
                        max=temp.length();
                    }
                }
                System.out.println(res);
            }
        }
    }
}
