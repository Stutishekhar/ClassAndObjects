package source;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Operations
{
    int a,b;
    public Operations(int a, int b)
    {
        
        this.a = a;
        this.b = b;
        
    }
    
    public static int add(Operations obj)
    {
        return (obj.a + obj.b);
    }
    
    public static int sub(Operations obj)
    {
        return (obj.a - obj.b);
    }
    
    public static int multiply(int x, int y)
    {
        return x*y;
    }
}

public class Source 
{
    public static void main(String[] args) throws IOException
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int a = Integer.parseInt(br.readLine());
    	int b = Integer.parseInt(br.readLine());
    	Operations obj = new Operations(a,b);
        int r = Operations.add(obj);
        int j = Operations.sub(obj);
        
    	int product = Operations.multiply(r,j);
    	System.out.println(product);
    	
    	
    	/*Scan input numbers (using buffered reader), call constructor of Operations class and then call multiply*/    	
    }
}
        


