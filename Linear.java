
public class Linear{
    public static void main(String [] args){
        int a[] = {10,20,5,66,300};

        int search_elem = 0;
        boolean flag=false;

        for(int i = 0; i<a.length;i++){
            if(search_elem==a[i]){
                System.out.println("elem found at: "+i);
                flag=true;
                break;
            }
        }
        if(flag==false){
        System.err.println("elem not found.");
        }
    }
}