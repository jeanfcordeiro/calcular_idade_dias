import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Program {

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual sua data de nascimento? (aaaa-mm-dd)");
		LocalDate birthDate = LocalDate.parse(sc.nextLine());
		
		LocalDate currentDate = LocalDate.now();
		
		long days = ChronoUnit.DAYS.between(birthDate, currentDate);
							
		System.out.println("Sua idade em dias é: " + days);
					
		
		sc.close();
	}

}