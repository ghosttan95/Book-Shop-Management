package main;
import java.util.ArrayList;
import java.util.List;

import main.Bill;
import main.Item;

public class Cart extends Bill{
    //one cart one bill
    public List<Item> inCart = new ArrayList<Item>();
    public List<Integer> quant = new ArrayList<Integer>();
    public int noOfItems=0;
    public void updateCart(Item a,int q ){
      //write your code here
      //------------
      //------------
    	//if item already exits then just increasing quantity only
    	if( inCart.contains(a) ) { 
    		int index_a = inCart.indexOf(a);
    		quant.add(quant.get(index_a)+q);
    	}
    	//if item is new to the list then adding item with its quantity
    	else {
    	inCart.add(a);
    	quant.add(q);
    	noOfItems++;
    	}
   

    }
    public int totalAmt=0;
    public void finalizeCart(String name){
    	//initializing value of name to super class
        super.getBill(name);//make it outside
        //Printing whole cart 
        for(int i=0;i<noOfItems;i++){
            System.out.println("|  "+ inCart.get(i).itemName + "  " + inCart.get(i).mrp +"  "+quant.get(i)+'\n');
        }
        totalAmt = calcBill();
        System.out.println("total Amount: "+ Integer.toString(totalAmt));
    }
    public int calcBill() {
    	int total=0;
//    	write your code here!!!
//    	----------------------
    	for( int i=0;  i<noOfItems; i++  ) {
    		total = total + ( (inCart.get(i).mrp)*(quant.get(i)) );
    	}
    	return total;
    	
    }
}