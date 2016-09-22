package base;

public class MyInteger {
	private int iValue;

	public MyInteger(int newiValue) {
		iValue = newiValue;
	}

	public int getiValue() {
		return iValue;
	}

	public boolean isEven() {
		if (iValue % 2 == 0){
			return true;
		}else{
			return false;
		}
	}

	public boolean isOdd() {
		if (iValue % 2 != 0){
			return true;
		}else{
			return false;
		}
	}

	public boolean isPrime() {
		for (int i = 2; i < iValue; i++) {
			if (iValue % i == 0){
				return false;
			}
		}
		return true;
	}

	public static boolean isEven(int iValue) {
		if (iValue % 2 == 0){
			return true;
		}else{
			return false;
		}
	}

	public static boolean isOdd(int iValue) {
		if (iValue % 2 != 0){
			return true;
		}else{
			return false;
		}
	}

	public static boolean isPrime(int iValue) {
		for (int i = 2; i < iValue; i++) {
			if (iValue % i == 0){
				return false;
			}
		}
		return true;
	}

	public static boolean isEven(MyInteger x) {
		if (x.getiValue() % 2 == 0){
			return true;
		}else{
			return false;
		}
	}

	public static boolean isOdd(MyInteger x) {
		if (x.getiValue() % 2 != 0){
			return true;
		}else{
			return false;
		}
	}

	public static boolean isPrime(MyInteger x) {
		for (int i = 2; i < x.getiValue(); i++) {
			if (x.getiValue() % i == 0){
				return false;
			}
		}
		return true;
	}

	public boolean equals(int MyValue) {
		if (MyValue == iValue){
			return true;
		}else{
			return false;
		}
	}

	public boolean equals(MyInteger x) {
		return equals(x.getiValue());
	}
}
