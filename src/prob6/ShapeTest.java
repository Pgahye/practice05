package prob6;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {

	public static void main(String[] args) {
		

			Shape db1=new Rectangle(5,6);
			Shape db2=new RectTriangle(6,2);
		
			
			List<Shape> list=new ArrayList<Shape>();		
			list.add(db1);
			list.add(db2);
	
			int count=list.size();
			
			for(int i=0;i<count;i++){
				
				Shape s=list.get(i);
				System.out.println("area : "+s.getArea());
				System.out.println("perimeter: " +s.getPerimeter());
			}	
			
			for(int i=0;i<count;i++){
				
				Shape s=list.get(i);
				
				if(s instanceof Resizable){
					
					((Resizable) s).resize(0.5);
					
				System.out.println("new area : "+s.getArea());
				System.out.println("new perimeter: "+s.getPerimeter());
				}
			}	
			
					
	}

}
