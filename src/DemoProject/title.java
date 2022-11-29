package DemoProject;

import java.util.Scanner;

import files.payload;
import io.restassured.path.json.JsonPath;

public class title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JsonPath js =new JsonPath(payload.CoursePrice());
		int count =js.getInt("courses.size()");
		System.out.println("total number of courses:"+count);
		System.out.println("Title name:");
		Scanner hi =new Scanner(System.in);
		String R =hi.nextLine();
		String Courses =js.getString("courses");
		String Title =js.getString("title");
		
		int i=0;
		
		while(i<count)
		{
			String find= js.getString("courses["+i+"].title");
			if(find.equals(R))
			{
				System.out.println(js.getString("courses["+i+"]").toString());
				break;
				
			}
			else if (i==(count-1))
			{
				System.out.println("invalid title");
				
			}
			i++;
		}
		

	}

}
