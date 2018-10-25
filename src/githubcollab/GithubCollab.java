
package githubcollab;


public class GithubCollab 
{
    int c;
    int b; 
 
    public static void main(String[] args) 
    {
        int a = 2;
        int b = 2;
        
        System.out.println(a + " + " + b + " = " + Addition(a, b)); // Addition Output
        System.out.println(a + " + " + b + " = " + Subtraction(a, b)); // Subtraction Output
    }
    public static int Addition(int a, int b)
    {
        int answer = a + b;
        return answer; 
    }
    
    public static int Subtraction(int a, int b)
    {
        int answer = a - b; // Calculation
        
        return answer;
    }
         
}
