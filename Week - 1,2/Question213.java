// This is the main class Question
public class Question213{ 
    public static void main(String[] args) { 
		// Object of the main class is created
		Question213 q = new Question213();
		q.abc();
	}


void p(Question213 object)
{
	System.out.println("p class");
}

void abc()
{
	p(this);
}
}
