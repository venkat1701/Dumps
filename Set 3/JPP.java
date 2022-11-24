/*
 * Always Remember the Following: - 
 * In an Double Dimensional Array , accounts[][]: - 
 * First set of Square Brackets denotes Rows.
 * Second set of Square Brackets denotes Columns.
 */
class JPP
{
    public static void main(String args[])
    {
        double accounts[][]=new double[2][200];
        accounts[0][2]=43.95;  //Storing value of Savings Account.
        accounts[1][2]=2.9339929292929;    //Checking Account Value.
        System.out.println("Savings Account: "+accounts[0][2]);
        System.out.println("Checking Account: "+accounts[1][2]);
    }
}
/*
 * In a Multi-Dimensional Array, it can also be called as "Array of Arrays".
 */