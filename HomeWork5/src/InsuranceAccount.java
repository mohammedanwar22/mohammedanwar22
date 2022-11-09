public class InsuranceAccount {

        private double  balance;
        private double interest;

        public InsuranceAccount(double intialize,final double interest ){
            balance=intialize;
            this.interest=interest; }


        public void withdraw() {
            balance-=balance;
        }

        public double getBalance() {
            return balance;
        }

        public void addInterest()
        {
            balance=((this.interest/100)*balance)+balance;

        }


}
