package sunbeam.qsn1;

 interface Employee {
		double getSal();

		default double calcIncentives() {

			return 0.0;
		}

		static double calcTotalIncome(Employee arr[]) {
			double totalSalaryArray = 0;
			for (Employee ele : arr) {
				totalSalaryArray += ele.getSal() + ele.calcIncentives();
			}

			return totalSalaryArray;
		}
}
