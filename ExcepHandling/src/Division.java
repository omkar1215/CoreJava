
public class Division {
	public static void main(String args[]) {
		try {
			if(args.length<2){
				throw new ArrayIndexOutOfBoundsException("Two number are required");
			}
			int num1=Integer.parseInt(args[0]);
			int num2=Integer.parseInt(args[1]);
			System.out.println(num1/num2);
		}catch(ArrayIndexOutOfBoundsException  e) {
			System.out.println("Please provide the exactly two numbers");
		}catch(NumberFormatException e){
			System.out.println("Please Enter Valid Integer");
		}catch(ArithmeticException e){
			System.out.println("Division by zero is Not possible");
		}catch(Exception e){
			System.out.println("An unexpected error occurd "+e.getMessage());
		}finally {
			System.out.println("Execution Completed");
		}
	}
}
