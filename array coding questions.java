1.sorting an array without using inbuilt method.
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++){
		    a[i]=scan.nextInt();
		}
		 for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
		for(int i=0;i<a.length;i++){
		    System.out.print(a[i]+" ");
		}
	}
} 
 2.median of given mergedarray
import java.util.Scanner;//hi
import java.util.Arrays;

public class Main {
     static int[] merge(int a[],int b[]){
        int i=0,j=0,k=0;
		int[] res=new int[a.length+b.length];
		while(k<res.length){
		    if(i<a.length){
		        res[k++]=a[i++];
		        
		    }
		    else if(j<b.length){
		        res[k++]=b[j++];
		        
		    }
		    
		}
		return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        int m = scan.nextInt();
        int b[] = new int[m];

        for (int j = 0; j < m; j++) {
            b[j] = scan.nextInt();
        }

        int res[] = merge(a, b);
        Arrays.sort(res);

        float median = 0.0f;
        int k = res.length;

        if (k % 2 == 0) {
            median = (res[k / 2] + res[(k / 2) - 1]) / 2.0f;
        } else {
            median = res[k / 2];
        }

        System.out.printf("%.2f", median);
    }
}
3.
