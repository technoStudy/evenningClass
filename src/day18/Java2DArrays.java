package day18;

public class Java2DArrays {
    //item prices

    //         Costco  Walmart  Aldi
    // water   $0.25   $0.27    $0.35
    // bread   $0.75   $0.45    $1.05
    // meat    $7.35   $9.99    $7.35

    // given table of item prices in market
    // create an 2D array item prices

    public static void main(String[] args) {
        double[][] prices = {
                // 0    1     2
                {0.25, 0.27, 0.35}, // row 0
                {0.75, 0.45, 1.05}, // row 1
                {7.35, 9.99, 7.35} // row 2
        };

        //part 1. print prices of water in each market
        System.out.println( "Part 1 ----------------------------" );
        for(int col = 0; col < prices[0].length; col++) {
            System.out.println( "$" + prices[0][col] );
        }

        //part 2. print average price of water
        System.out.println( "\nPart 2 ----------------------------" );
        double sum = 0;
        for(int col = 0; col < prices[0].length; col++) {
            sum += prices[0][col];
        }
        double avg = sum / 3;
        System.out.println( "Water average price: $" + avg );

        //part 2.1 price average price of meat
        System.out.println( "\nPart 2.1 ----------------------------" );
        sum = 0;
        for(int col = 0; col < prices[2].length; col++) {
            sum += prices[2][col];
        }
        avg = sum / 3;
        System.out.println( "Meat average price: $" + String.format( "%.2f", avg ) );

        //part 3. print item prices in Costco, and calculate sum
        //         Costco  Walmart  Aldi
        // water   $0.25   $0.27    $0.35
        // bread   $0.75   $0.45    $1.05
        // meat    $7.35   $9.99    $7.35

        System.out.println( "\nPart 3 ----------------------------" );
        // 0-0
        // 1-0
        // 2-0

        sum = 0;
        for(int i = 0; i < 3; i++) { // 0 1 2
            sum += prices[i][0];
            System.out.print( "$" + prices[i][0] + " " );
        }
        System.out.println( "\nTotal price at Costco: $" + sum );

        // given table,
        // part4. calculate sum of price in each market(costco, walmart, aldi)
        // expected output is:
        // Total at costco is: ???
        // Total at walmart is: ???
        // Total at aldi's is: ???

        // part5. calculate average price of each item(water, bread, meat)
        // expected output is:
        // average price of water is: ???
        // average price of bread is: ???
        // average price of meat is: ???

    }
}
