package day02;

import java.awt.geom.AffineTransform;
import java.util.Scanner;

public class Shopping {
	private double sum = 0;
	private double priceTshirt = 245.0;
	private double tennisShoePrice  = 570.0;
	private double tennisPad = 260.0;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void  shoppingPrompt() {
		
		System.out.println("我行我素购物管理系统 > 购物结算");
		System.out.println();
		System.out.println();
		for (int i = 0; i < 80; i++) {
			System.out.print("*");
		}
		System.out.println();
		System.out.println("请选择购买的商品编号：");
		System.out.println("1. T-shirt 2. 网球鞋       3。网球拍 ");
		for (int i = 0; i < 80; i++) {
			System.out.print("*");
		}
		System.out.println();

	}
	public static int getOneInterger(String prompt) {
		Scanner input = new Scanner(System.in);
		System.out.println(prompt);
		try {
			int number = input.nextInt();
			return number;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("invalid input");
		} 
		return 1;
	}
	public void itemPay() {
		String yesString ="y";
		String noString = "n";
		int itemCode = getOneInterger("请输入商品编号 ") ;
		int itemNumber = getOneInterger("请输入购买数量 ");
		switch (itemCode) {
		case 1:
			sum += priceTshirt*itemNumber;
			System.out.println("T-SHIRT"+"          "+priceTshirt+"           "+priceTshirt*itemNumber);
			break;
		case 2:
			sum += tennisShoePrice*itemNumber;
			System.out.println("网球鞋"+"          "+tennisShoePrice+"           "+tennisShoePrice*itemNumber);
			break;
		case 3:
			sum += tennisPad*itemNumber;
			System.out.println("网球拍"+"          "+tennisPad+"           "+tennisPad*itemNumber);
			break;
		default:
			System.out.println("input code number not correct");
			itemPay();
			break;
		}
		System.out.println("是否继续 (y/n) ");
		Scanner input = new Scanner(System.in);
		String userInput = input.nextLine();
		if (userInput.equals(yesString)) {
			itemPay();
		}else {
			System.out.println("折扣： 0.8");
			System.out.println("金额总计："+ sum*0.8);
			int moneyGiven = getOneInterger("实际交费：	");
			System.out.println("找零 ： "+ (moneyGiven-sum*0.8));
		}
		
	}
	
	

}
