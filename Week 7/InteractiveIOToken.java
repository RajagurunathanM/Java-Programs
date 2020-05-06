import java.util.*;
import java.io.*;

class InteractiveIOToken
{
	public static void main(String args[]) throws Exception
	{
		StringTokenizer st ;
		//FileInputStream f1 = new FileInputStream("f1.txt");
		FileOutputStream f2 = new FileOutputStream("f1.txt");
		DataInputStream in = new DataInputStream(System.in);
		DataOutputStream  op = new DataOutputStream(f2);
		
		
		System.out.println("ENTER CODE ");
		st = new StringTokenizer(in.readLine());
		int code = Integer.parseInt((st.nextToken()));
		op.writeInt(code);
		
		System.out.println("ENTER NAME ");
		st = new StringTokenizer(in.readLine());
		String Name = (st.nextToken());
		op.writeBytes(Name);
		
		System.out.println("ENTER COST ");
		st = new StringTokenizer(in.readLine());
		double cost = Double.parseDouble((st.nextToken()));
		op.writeDouble(cost);
		
	}
}
		