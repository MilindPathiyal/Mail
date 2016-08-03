//Milind Pathiyal

//User enters dimensions of the package and weight and code determines if it is valid for transportation

import java.util.*;
public class mail
{
    public void calculate()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the weight");
        int weight = input.nextInt();
        System.out.println("Enter a dimension");
        int dimension1 = input.nextInt();
        System.out.println("Enter the next dimension");
        int dimension2 = input.nextInt();
        System.out.println("Enter the last dimension");
        int dimension3 = input.nextInt();
            //Input ends here
        
        int weightMax = 70;
        if (weight <= weightMax)
        {
            System.out.println("This weight is compatible to ship");
        }
        else
        {
            System.out.println("Your package is too heavy to ship");
        }
        
        int length = 0;
        if ( dimension2 < dimension1 && dimension1 > dimension3)
        {
            length = dimension1;
        }
        else if (dimension1 < dimension2 && dimension2 > dimension3)
        {
            length = dimension2;
        }
        else if (dimension1 < dimension3 && dimension3 > dimension2)
        {
            length = dimension3;
        }
        
        int girth = 0;
        if ( dimension3 < length && length > dimension2 )
        {
            girth = ( dimension2 * 2 ) + ( dimension3 * 2);
        }
        else if ( dimension1 < length && length > dimension3 )
        {
            girth = ( dimension1 * 2 ) + ( dimension3 * 2);
        }
        else if ( dimension1 < length && length > dimension2 )
        {
            girth = ( dimension1 * 2 ) + ( dimension2 * 2);
        }
        
        int total = 0;
        if ( (length + girth) <= 100)
        {
            total = length + girth;
            System.out.println("Package size is acceptable");
        }
        else
        {
            System.out.println("Package size is not acceptable");
        }
    }
}
/*      
Enter the weight
60
Enter a dimension
10
Enter the next dimension
5
Enter the last dimension
6
This weight is compatible to ship
Package size is acceptable
*/
            
        
        

        