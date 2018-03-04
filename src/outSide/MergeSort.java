package outSide;


public class MergeSort {  
	  
    public static void sort(int[] array){  
        int length = array.length;  
        int[] tmpArray = new int[ length ];  
        sort(array, tmpArray, 0, length-1);  
    }  
  
    public static void sort(int[] array, int[] tmpArray, int left, int right){  
        if(left < right){  
            int center = (left + right)/2; 
           
            		sort(array,tmpArray,left,center);
            	
      
         
            		sort(array,tmpArray,center+1,right);
    
            merge(array, tmpArray, left, center+1, right);  
           
        }  
    }  
  
    private static void merge(int[] array, int[] tmpArray, int leftStart, int rightStart, int rightEnd) {  
        int leftEnd = rightStart - 1;   
        int tmpPos = leftStart;    
        int total = rightEnd - leftStart + 1;  
  
        while(leftStart <= leftEnd && rightStart <= rightEnd){  
            if(array[ leftStart ] <= array[ rightStart ]){  

                tmpArray[ tmpPos++ ] = array[ leftStart++ ];  
            }else{  
  
                tmpArray[ tmpPos++ ] = array[ rightStart++ ];  
            }  
        }  
  
        while(leftStart <= leftEnd){  
            tmpArray[ tmpPos++ ] = array[ leftStart++ ];  
        }  
  

        while(rightStart <= rightEnd){  
            tmpArray[ tmpPos++ ] = array[ rightStart++ ];  
        }  

        for(int i = 0; i < total; i++, rightEnd-- ){  
            array[ rightEnd ] = tmpArray[ rightEnd ];  
        }  
  
    }  
  
}  