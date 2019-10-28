/*
 * antonio yepez 28/10/2019
 */

package iesserpis.ed;

public class busqueda {

	public static void main(String[] args) {
	
		//declara variable/vector
		int [] v= new int [] {17,12,15,9,14};
		int x =15;
		int index =indexOf(v, x);
		
		System.out.println("index:" + index);
		System.out.println("fin");
		
		
	}
		public static int indexOf(int[] v, int x) {
//			int index =0;
//			while (index< v.length && v[index]!= x)     //v.lenght vale el numero de elementos  que hay 
//				index++;
//			 if (index == v.length)
//				 	return 	-1;
//			 return index;
			
			
			//con for
			int index=0;
			for ( index=0; index < v.length;index++)
				if(v[index] == x)
					return index;
			return -1;
		}
				
}

