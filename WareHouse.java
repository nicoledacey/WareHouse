import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileReader; 
public class WareHouse
{
public static void main(String[] args)
{
int num = 0;
int aisle = 0;
int shelf = 0;
int bin = 0;
int c = 0;
Scanner inputStream = null;
Order[] orders = new Order[60];
Cart[] carts = new Cart[10];
Scanner list = null;

try 
{ 
inputStream = new Scanner(new File("warehouse_data.txt")); 
}//end try 
catch(FileNotFoundException e) 
{ 
System.out.println("Could not open file, program will end."); 
System.exit(0); 
}//end catch 

int x = 0;
while(inputStream.hasNextInt())
{
for(int i = 0; i < 3; ++i)
{
num = inputStream.nextInt();
}//end for
aisle = inputStream.nextInt();
shelf = inputStream.nextInt();
bin = inputStream.nextInt();
orders[x] = new Order(aisle,shelf,bin);
inputStream.nextLine();
++x;
}//end while
insertionSort(orders);


for(int m = 0; m < carts.length;m++)
{
carts[m] = new Cart(orders[0+c],orders[1+c],orders[2+c],orders[3+c],orders[4+c],orders[5+c]);
c+=6;
}//end for
inputStream.close();
printOrders(carts);
}//end method

public static void printOrders(Cart[] cartPassed)
{ 
for(int i = 0; i < cartPassed.length; ++i) 
{
System.out.println("Cart " + (i+1) + ": ");
System.out.println(cartPassed[i].toString()); 
System.out.println(); 
} 
}//end method

public static void insertionSort(Order[] ordersPassed)
{                  
Order temp;      
for (int i = 1; i < ordersPassed.length; i++) 
{             
for(int j = i ; j > 0 ; j--)
{                 
if(ordersPassed[j].getAisle() < ordersPassed[j-1].getAisle())
{                     
temp = ordersPassed[j];                     
ordersPassed[j] = ordersPassed[j-1];                     
ordersPassed[j-1] = temp;                 
}//end if
else if(ordersPassed[j].getAisle() == ordersPassed[j-1].getAisle())
{                                 
if(ordersPassed[j].getShelf() < ordersPassed[j-1].getShelf())
{                     
temp = ordersPassed[j];                     
ordersPassed[j] = ordersPassed[j-1];                     
ordersPassed[j-1] = temp;                 
}//end if
else if(ordersPassed[j].getShelf() == ordersPassed[j-1].getShelf())
{                                    
if(ordersPassed[j].getBin() < ordersPassed[j-1].getBin())
{                     
temp = ordersPassed[j];                     
ordersPassed[j] = ordersPassed[j-1];                     
ordersPassed[j-1] = temp;                 
}//end if         
}//end inner for loop         
}//end outer for loop
}
}     
}//end method
}//end class