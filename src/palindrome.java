import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class palindrome {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bu=new BufferedReader(new FileReader("input.txt"));
        while(bu.ready()) {
        	String line = bu.readLine();
        	Tokenize_line(line);
        	/*StringTokenizer t =new StringTokenizer(line, ",");
        	
                int count=0;
                while(t.hasMoreTokens()) {
                	String x=t.nextToken();
                	System.out.println(x);
                }*/
        }
        }
		
		
	
	
	static void Tokenize_line(String Line) throws IOException
	{
		//System.out.print(Line);
        	StringTokenizer t =new StringTokenizer(Line, " ");
                while(t.hasMoreTokens()) {
                
                String x=t.nextToken();
                
                Booleancheck_palindrome(x);
                
                }
        
	}

	static void Booleancheck_palindrome(String x)
	{
		boolean found=true;
		int first=0,last=x.length()-1;
		for (int i = 0; i < x.length()/2; i++) {
			//System.out.println("first :"+first+" / last: "+last);
			
			if(x.charAt(first)!=x.charAt(last))
			{
				found=false;
			}
			if(first==last ||first==last-1){
				break;	
			}
			
			first++;
    		last--;
		}
		if(found==true)
		{
			System.out.println("this word is palindrome  : "+x);
		}
		
      }
	
}
