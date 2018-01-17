class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		int sum=0, i= 0;
		int temp= numberToCheck, temp2 = numberToCheck;

		while(numberToCheck > 0) {
			numberToCheck = numberToCheck / 10;
			i++;
		}
		while(temp2 > 0) {
			sum = (int)Math.pow(temp2 % 10, i) + sum;
			temp2 = temp2 / 10;
		}

		if (sum == temp)
			return true;
		else
			return false;
	}

}
