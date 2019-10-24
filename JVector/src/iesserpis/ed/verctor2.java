/*
 * antonio yepez 24102019
 */

package iesserpis.ed;

public class verctor2 {

	public static void main(String[] args) {
		
			//variable
			int index=0;
	 
			int [] v= new int [] {17,12,15,9,14};
		
			
			
			
			//bucle con while programa 1
//			int index=0;
//			while(index<5) {
//				System.out.println(index);
//				index++
//			}
//			System.out.println("fin");
			
			//imprimir solo un valor por linea    // omitir variable index
			//System.out.println("primer elemento = " + v[0]);
		    //System.out.println("segundo  elemento = " + v[1]);
			
			
			//imprimir todos los valores con un bucle programa2
			for (index=0; index<=4; index++)
				System.out.println("elemento " + index +" valor="+  v [ index ]);
			
			System.out.println("fin");

	}

}
