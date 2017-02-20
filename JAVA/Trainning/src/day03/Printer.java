package day03;

public class Printer {
	public String brand;
	public double price;
	
	public Printer(String printerBrand,double printerPrice){
		brand = printerBrand;
		price = printerPrice;
	}
	public void print(String str){
		System.out.println("打印"+str);
	}
	public String toString(){
		return "Printer brand is "+ brand + " and its price is "+ price;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer anyPrinter = new Printer("HP",5600);
		String info = anyPrinter.toString();
		System.out.println(info);
		anyPrinter.print("请节约纸张");

	}

}
