package java_就当一堆来学习;

class MainDemo {
	public static void main(String[] args) {
		System.out.println(args); 
		System.out.println(args.length); 
		//System.out.println(args[0]); 
		for(int x=0; x<args.length; x++) {
			System.out.println(args[x]);
		}
	}
}