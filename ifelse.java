public class ifelse {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println( " Enter a letter: " );
		char ch = sc.next().charAt(0);
		if( ch >= 'a' && ch <= 'z' ) {
			if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
			System.out.println( ch + "  Vowel " );
		}
			else if( ch != 'a' || ch != 'i' || ch != 'o' || ch != 'e' || ch != 'u'){
				System.out.println( ch + " Consonant "  );
			}
			else {
				System.out.println("Not an alphabet");
			}

	}
System.out.println("Enter a string: ");
		 String M = sc.nextLine();
		// String rock, paper, scissor;

		 switch(M) {
		 case "rock":
			 		 System.out.println( " Rock beats scissor " + M);
				 break;


		 case "scissors":
			 System.out.println( " Scissors beats paper " + M);
			 break;

		 case "paper":
			 System.out.println( " paper beats rock " + M);
			 break;
		 default:
		        System.out.println( " Invalid case " );


		 }String strl=String EDxample="Hello World";
		 System.out.println(strl.length());
}
}