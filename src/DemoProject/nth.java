package DemoProject;

import java.util.Scanner;

import files.payload;
import io.restassured.path.json.JsonPath;

public class nth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JsonPath js =new JsonPath(payload.CoursePrice());
		int count =js.getInt("courses.size()");
		System.out.println("total number of courses:" +count);
		for(int k=0;k<count;k++)
		{
			String Title =js.getString("courses["+k+"].title");
			System.out.println("Title name:"+Title);
			int Price =js.getInt("courses["+k+"].price");
			int Copies =js.getInt("courses["+k+"].copies");
			System.out.println("Price for one copy"+js.get("courses["+k+"].price").toString());
			System.out.println("No of copies:" + js.get("courses[" +k+"].copies").toString());
			Scanner sn = new Scanner(System.in);
			System.out.println("enter the value n:");
			int n=sn.nextInt();
			
			for (int j=0;j<count;j++)
			{
				if(n==(j+1))
				{
					System.out.println(js.getString("courses["+j+"]"));
					break;
					
				}
				
			}
			if(n>count||n<=0)
				System.out.println("enter the valid number:");
			break;
			
		}

	}

}
