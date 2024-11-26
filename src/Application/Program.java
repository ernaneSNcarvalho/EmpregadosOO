package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Departament;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do departamento: ");
		String nameDepartament = sc.nextLine();
		System.out.print("Dia do pagamento: ");
		int dayOfPayment = sc.nextInt();
		sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Telefone: ");
		String phone = sc.nextLine();
		Address add = new Address(email, phone);
		Departament dept = new Departament(nameDepartament, dayOfPayment, add);
		
		System.out.print("Quantos funcionarios tem o departamento? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Dados do funcionario " + i + ": ");
			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Salario: ");
			double salary = sc.nextDouble();
			dept.addEmployee(new Employee(name, salary));
		}
		
		showReport(dept);
		
		sc.close();
	}
	
	private static void showReport(Departament dept) {
		StringBuilder sb = new StringBuilder();
		sb.append("Departamento " + dept.getName() + " = " + String.format("%.2f", dept.payRoll()) + "\n");
		sb.append("Pagamento realizado no dia " + dept.getPayDay() + "\n");
		sb.append("Funcionarios: \n");
		for(Employee emp : dept.getEmployee()) {
			sb.append(emp.getName() + "\n");
		}
		sb.append("Para duvidas favor entrar em contato: " + dept.getAdress().getEmail());
		System.out.println(sb.toString());	
	}
}
