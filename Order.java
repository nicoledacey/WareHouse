public class Order
{
int aisle;
int shelf;
int bin;
public Order()
{
aisle = 0;
shelf = 0;
bin = 0;
}//end default

public Order(int aislePassed, int shelfPassed, int binPassed)
{
aisle = aislePassed;
shelf = shelfPassed;
bin = binPassed;
}//end nondefault

public int getAisle()
{
return this.aisle;
}//end getter

public int getShelf()
{
return this.shelf;
}//end getter

public int getBin()
{
return this.bin;
}//end getter

public String toString() 
{ 
return   "Aisle: " + aisle +          
         "\nShelf: " + shelf +          
         "\nBin: " + bin; 
}//end method

}//end class