
 class Max {
	  	int getMax(int a ,int b){
	  	int c = 0 ;
	  	if ( a > b ){
	  		c = a;
	  	}
	  	else if( a < b){
	  		c = b;
	  	}
	  	else{
	  		c = a;
	  		System.out.println("c");
		}
	  	return  c;
	 	}
 public static void main(String[] args){
		 Max max = new Max();
		 //int a = 3;
		 //int b = 5;
		 int m = 0;
		 m =max.getMax(3, 5);
		 System.out.println(m);
		 
		
	}
		
}
	


