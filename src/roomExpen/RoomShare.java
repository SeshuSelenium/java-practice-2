package roomExpen;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RoomShare {
	static double employee;
	static double un_employee;
	static double anilSpent, abhiSpent, arunSpent, madhuSpent, sudhaSpent, manojSpent, hariSpent, seshuSpent;

	public static void main(String[] args) throws Exception {

		
		double worker = 1200;
		double currentBill =0;
		double shopBook = 3016;
		double roomBook = 10059;
		double roomRent = 13000;
		double waterBill = 910;
		double EMI = 2100;

		
		anilSpent = 270;

		System.out.println("Anil spent : " + anilSpent);

//			s1.createRow(10).createCell(0).setCellValue(10);
//			s1.getRow(10).createCell(1).setCellValue("Abhishek");
		// s.getRow(10).createCell(2).setCellValue(4279);
		abhiSpent = 4529;

		System.out.println("Abhi spent : " + abhiSpent);

//			s1.createRow(11).createCell(0).setCellValue(11);
//			s1.getRow(11).createCell(1).setCellValue("Arun");
//			//s.getRow(11).createCell(2).setCellValue(950);
		arunSpent = 1000;

		System.out.println("Arun spent : " + arunSpent);

//			s1.createRow(12).createCell(0).setCellValue(12);
//			s1.getRow(12).createCell(1).setCellValue("Madhu");
		// s.getRow(12).createCell(2).setCellValue(115);
		madhuSpent = 115;

		System.out.println("Madhu spent : " + madhuSpent);

//			s1.createRow(13).createCell(0).setCellValue(13);
//			s1.getRow(13).createCell(1).setCellValue("Sudharshan");
		// s.getRow(13).createCell(2).setCellValue(464);
		sudhaSpent = 2730;

		System.out.println("Sudha spent : " + sudhaSpent);

//			s1.createRow(14).createCell(0).setCellValue(14);
//			s1.getRow(14).createCell(1).setCellValue("Manoj");
		// s.getRow(14).createCell(2).setCellValue(1400);
		manojSpent = 1400;

		System.out.println("Manoj spent : " + manojSpent);

//			s1.createRow(15).createCell(0).setCellValue(15);
//			s1.getRow(15).createCell(1).setCellValue("Harinath");
		// s.getRow(15).createCell(2).setCellValue(15);
		hariSpent = 15;

		System.out.println("Hari : " + hariSpent);

//			s1.createRow(16).createCell(0).setCellValue(16);
//			s1.getRow(16).createCell(1).setCellValue("Nagaseshu");
		// s.getRow(16).createCell(2).setCellValue(0);
		seshuSpent =0;

		System.out.println("Seshu spent : " + seshuSpent);

		// s.createRow(17).createCell(0).setCellValue(17);
		// s.getRow(17).createCell(1).setCellValue("name");
		// s.getRow(17).createCell(2).setCellValue("spent");
		

		Map<String,Double> map = new HashMap<String, Double>();

		map.put("worker", worker);
		map.put("currentBill", currentBill);
		map.put("shopBook", shopBook);
		map.put("roomBook", roomBook);
		map.put("roomRent", roomRent);
		map.put("waterBill", waterBill);
		// map.put("emi", EMI);

		for (Entry<String, Double> ent : map.entrySet()) { // print list of expenditure
			System.out.println(ent.getKey() + " : " + ent.getValue());
		}

		double tbill = 0;
		for (Entry<String, Double> entry : map.entrySet()) { // total bill counting
			tbill = tbill + entry.getValue();

		}
		System.out.println("Total  : " + tbill);
		double total_with_EMI = tbill + EMI;
		System.out.println("Total with EMI : " + total_with_EMI);
		double non_emp_mem = 3, non_emp_amount = 3500;
		double non_emp_total = non_emp_amount * non_emp_mem;

		double total = tbill - non_emp_total; // total without un-employee
		double emp_mem = 5;
		double emp_amount_each = total / emp_mem; // employee amount for each

		double persons_EMI = 8;
		double EMI_for_each = EMI / persons_EMI; // EMI for each person

		System.out.println("EMI : " + EMI_for_each); // Emi for each person printing
		emp_amount_each = emp_amount_each + EMI_for_each;

		non_emp_amount = non_emp_amount + EMI_for_each;

		System.out.println("employee rent : " + emp_amount_each);
		employee = emp_amount_each;
		System.out.println("non employee rent : " + non_emp_amount);
		un_employee = non_emp_amount;
//			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Nagasesha Reddy\\eclipse-workspace\\MavenPractice\\drivers\\geckodriver.exe");
//			WebDriver driver = new FirefoxDriver();
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//			driver.get("https://www.google.com");

		RoomShare.final_bill();
	}

	public static void final_bill() throws Exception {
		
		double netpay = 0;
//		s.createRow(0).createCell(0).setCellValue("S.No");
//		s.getRow(0).createCell(1).setCellValue("Name ");
//		s.getRow(0).createCell(2).setCellValue("amount");
//		s.getRow(0).createCell(3).setCellValue("Spent");
//		s.getRow(0).createCell(4).setCellValue("Net Pay");
		netpay = employee - anilSpent;
		System.out.println("Anil : " + netpay);
//		s.createRow(1).createCell(0).setCellValue("1");
//		s.getRow(1).createCell(1).setCellValue("Anilkumar Reddy ");
//		s.getRow(1).createCell(2).setCellValue(employee);
//		s.getRow(1).createCell(3).setCellValue(anilSpent);
//		s.getRow(1).createCell(4).setCellValue(netpay);
		netpay = employee - abhiSpent;
		System.out.println("abhi : " + netpay);
//		s.createRow(2).createCell(0).setCellValue("2");
//		s.getRow(2).createCell(1).setCellValue("Abhishek Reddy ");
//		s.getRow(2).createCell(2).setCellValue(employee);
//		s.getRow(2).createCell(3).setCellValue(abhiSpent);
//		s.getRow(2).createCell(4).setCellValue(netpay);
		netpay = employee - arunSpent;
		System.out.println("Arun : " + netpay);
//		s.createRow(3).createCell(0).setCellValue("3");
//		s.getRow(3).createCell(1).setCellValue("Arunkumar Reddy ");
//		s.getRow(3).createCell(2).setCellValue(employee);
//		s.getRow(3).createCell(3).setCellValue(arunSpent);
//		s.getRow(3).createCell(4).setCellValue(netpay);
		netpay = employee - madhuSpent;
		System.out.println("Madhu : " + netpay);
//		s.createRow(4).createCell(0).setCellValue("4");
//		s.getRow(4).createCell(1).setCellValue("Madhusudhan ");
//		s.getRow(4).createCell(2).setCellValue(employee);
//		s.getRow(4).createCell(3).setCellValue(madhuSpent);
//		s.getRow(4).createCell(4).setCellValue(netpay);
		netpay = employee - sudhaSpent;
		System.out.println("Sudha : " + netpay);
//		s.createRow(5).createCell(0).setCellValue("5");
//		s.getRow(5).createCell(1).setCellValue("Sudharshan Reddy ");
//		s.getRow(5).createCell(2).setCellValue(employee);
//		s.getRow(5).createCell(3).setCellValue(sudhaSpent);
//		s.getRow(5).createCell(4).setCellValue(netpay);
		netpay = un_employee - manojSpent;
		System.out.println("Manoj : " + netpay);
//		s.createRow(6).createCell(0).setCellValue("6");
//		s.getRow(6).createCell(1).setCellValue("ManojKumar Reddy ");
//		s.getRow(6).createCell(2).setCellValue(un_employee);
//		s.getRow(6).createCell(3).setCellValue(manojSpent);
//		s.getRow(6).createCell(4).setCellValue(netpay);
		netpay = un_employee - hariSpent;
		System.out.println("hari : " + netpay);
//		s.createRow(7).createCell(0).setCellValue("7");
//		s.getRow(7).createCell(1).setCellValue("Harinath Reddy ");
//		s.getRow(7).createCell(2).setCellValue(un_employee);
//		s.getRow(7).createCell(3).setCellValue(hariSpent);
//		s.getRow(7).createCell(4).setCellValue(netpay);
		netpay = un_employee - seshuSpent;
		System.out.println("seshu : " + netpay);
//		s.createRow(8).createCell(0).setCellValue("8");
//		s.getRow(8).createCell(1).setCellValue("Nagasesha Reddy ");
//		s.getRow(8).createCell(2).setCellValue(un_employee);
//		s.getRow(8).createCell(3).setCellValue(seshuSpent);
//		s.getRow(8).createCell(4).setCellValue(netpay);

//		FileOutputStream output = new FileOutputStream(f);
//		wb.write(output);
//		output.close();
	}

}
